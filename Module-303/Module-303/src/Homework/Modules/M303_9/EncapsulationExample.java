package Homework.Modules.M303_9;

public class EncapsulationExample {
    public static void main(String[] args) {
        GLab_303_9_1.HumanBeing h1 = new GLab_303_9_1.HumanBeing();
        // using setters of HumanBeing
        h1.setHeight(1.65f);
        h1.setWeight(68);
        h1.setBmi(calculateBmi(h1));

        // using getters of HumanBeing
        System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() + " meters in height, which results in BMI of " + h1.getBmi());
    }

    public static float calculateBmi(GLab_303_9_1.HumanBeing h1) {
        return h1.getWeight() / (h1.getHeight() * h1.getHeight());
    }
}

