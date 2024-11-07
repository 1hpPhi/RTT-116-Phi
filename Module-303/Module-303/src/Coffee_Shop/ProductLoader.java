package Coffee_Shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductLoader {

    public List<Product> loadProducts() {
        List<Product> result = new ArrayList<>();

        try {
            // 1) open the file to read from
            File file = new File("C:\\Users\\1hpPhi\\Dev\\RTT-116-Classwork\\Module-303\\Module-303\\src\\products.txt");

            // 2) read the file line by line to get our products
            BufferedReader br = new BufferedReader(new FileReader(file));

            // 3) read the file line by line
            String line;
            while ((line = br.readLine()) != null) {

                // 4) Tokenize the line that we just read from the file by splitting on a ,
                String[] tokens = line.split(",");

                // 5) Create a product and set the values that we just "parsed" from the file
                Product p = new Product();
                p.setName(tokens[0]);
                p.setPrice(Double.parseDouble(tokens[1]));
                result.add(p);

                System.out.println(line);
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        return result;
    }
}
