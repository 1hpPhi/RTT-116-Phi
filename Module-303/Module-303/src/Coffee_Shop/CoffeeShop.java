 package Coffee_Shop;


import java.util.*;

 public class CoffeeShop {

    //we will use this multiple times, so we can call it whenever we need it
    private Scanner scanner = new Scanner(System.in);

    private List<Product> products = new ArrayList<>();

    //we will "add" to the list that we want to put in our cart
    private List<Product> cart = new ArrayList<>();

    private void initProducts() {
        Product p1 = new Product("Small Coffee", 4.57, 0);
        products.add(p1);
        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);
        Product p3 = new Product("Sugar Cookie", 5.89, 0);
        products.add(p3);
        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);
        Product p5 = new Product("Ginger Cookie", 5.89, 0);
        products.add(p5);

        //sorting by price
        List <Product> sorted = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
        //sorted.forEach(p -> System.out.println(p));

        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
        sorted.forEach(p -> System.out.println(p));
    }

    private List<Product> sortByPrice(List<Product> source) {
        return null;
    }

    private void printProductMenu() {
        for (int count = 0; count < products.size(); count++) {
            Product p = products.get(count);
            //count + 1 will be considered a math problem and increase the number by 1
            System.out.println((count + 1) + ") " + p.getName() + " \t " + p.getPrice());
        }
        //Give space
        System.out.print("\n");
    }

    private int printMainMenu() throws InvalidInputException {
        System.out.println("1) See product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");

        return readNumberFromUser("\n Enter Selection : ");



    }

    private int readNumberFromUser(String question) throws InvalidInputException {
        System.out.print(question);

        try {
            int selection = scanner.nextInt();
            return selection;
        } catch (Exception e) {
            System.out.println("\nInvalid selection\n");
            throw new InputMismatchException("Invalid input: you must enter a valid number");
        } finally {
            scanner.nextLine();
        }
    }

    public void addProductToCart() throws InvalidInputException {
        //display items
        printProductMenu();
        //prompt the user to enter an item # to buy

        int selection = readNumberFromUser("Enter product number?");

        if (isProductSelectionValid(selection)) {


                int quantity = readNumberFromUser("Enter the quantity to buy: ");

            if ( quantity <= 0 ) {
                System.out.println("You must buy at least 1.");
            } else {


                //add to the array/list (-1 to get the POSITION of the array at a 0 index)
                Product p = products.get(selection - 1);

                p.setQuantity(p.getQuantity() + quantity);

                if (!existsInCart(p)) {
                    cart.add(p);
                }
                    System.out.println("Added product " + p.getName() + " to the cart\n");
                    //ask for quantity of purchase
                    //make adjustment to quantity on product
            }
        } else {
            System.out.println("Invalid item selection\n");
        }


    }

    private boolean isProductSelectionValid(int selectedProduct){
        if (selectedProduct >= 1 || selectedProduct <= products.size()) {
            return true;
        }
            return false;
    }

    private boolean existsInCart(Product purchase) {
        boolean found = false;

        for (Product item : cart){
            if (item.getName().equals(purchase.getName())) {
                found = true;
                break;
            }
        }

        return found;
    }

    public void checkout() {
        System.out.println("========== Items in your cart ==============");
        double subtotal = 0.0;
        //list the items in the cart
        for (Product item : cart) {
            System.out.println(item.getName() + " \t " + item.getQuantity() + " \t $" + item.getPrice() + " \t $" + (item.getPrice() * item.getQuantity()));
            subtotal = subtotal + item.getPrice();
        }
        System.out.println("");
        System.out.println("Subtotal\t\t $" + subtotal);
        //calculate tax
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t $" + tax);
        //calculate total amount
        double total = subtotal + tax;
        System.out.println("Total price\t\t $" + total + "\n");
    }

    public void start() throws InvalidInputException {

        //initialize the products for sale
        initProducts();

        //repeat until selection == 4 which will exit program

        while (true) {
            //Show main menu and get user input
            int selection = printMainMenu();

            if (selection == 1) {
                printProductMenu();
            } else if (selection == 2) {
                //purchase/add to cart
                addProductToCart();
            } else if (selection == 3) {
                //checkout/payment
                checkout();
            } else if (selection == 4) {
                //exit
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid selection\n");
            }
        }


        //Print the list of products for sale
        //printProductMenu();
    }

    public static void main(String[] args) throws InvalidInputException {
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}