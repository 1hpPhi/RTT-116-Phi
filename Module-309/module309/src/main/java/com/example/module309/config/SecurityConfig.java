package com.example.module309.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    // authentication - the act of checking the users credentials .. meaning is the username and password correct
    // authorization - is what the user can do
    // principal - this is the user logged in


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // you guys can research this if you want ... It's for preventing automated bots and helps to increase the likelihood that it's a human using your site
        // this is defaulted to on ... so we need to turn it off to prevent hair loss
        http.csrf(csrf -> csrf.disable());


        // 1) All URLS are considered open, and we restrict the URLS we want to protect
        // 2) All URLS are restricted, and we open the ones we want.

        // this part of the configuration secures actual URLS
        // this is the list of URLS that require authentication to the website before the user can view the URL
        // this works on the idea ... that all URLS are accessible to everyone except for the ones listed here
        // this restriction is NOT including authorization it is only for authentication
//        http.authorizeRequests()
//                .requestMatchers(
//                        new AntPathRequestMatcher("/customer/**"),
//                        new AntPathRequestMatcher("/employee/**")).authenticated()
//                .anyRequest().permitAll();

        http.authorizeHttpRequests((authorize) -> authorize
                // Require authentication for /customer/** endpoints
                .requestMatchers("/customer/**").authenticated()
                .requestMatchers("/employee/**").authenticated()

                // Allow all other requests without authentication
                .anyRequest().permitAll()
        );

        // this section specifies where our login page is
        http.formLogin(formLogin -> formLogin
                // this is the URL for the login page ... this needs a controller method to listen and show the login page
                // this is analogous to /customer and the page is login
                .loginPage("/login/login")
                // spring security has this controller method created for us already .. and we are just configuring the URL where it submits to
                .loginProcessingUrl("/login/loginSubmit"));

        // this section is for configuing logout
        http.logout(formLogout -> formLogout
                // when the user logs out ... destroy the session the server side
                .invalidateHttpSession(true)
                // this is the actual URL this is implemented by spring security and we are just specifying the get mapping for it
                .logoutUrl("/login/logout")
                // where does the user go after they have been logged out
                // this is a URL that we have implemented somewhere in our project or controllers
                .logoutSuccessUrl("/")
                // extra security and delete these cookies when logging out
                .deleteCookies("username", "JSESSIONID"));

        http.exceptionHandling(exception -> exception
                .accessDeniedPage("/404"));


        return http.build();
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
