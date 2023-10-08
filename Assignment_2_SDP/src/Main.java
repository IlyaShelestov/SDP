import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iBurger burger;
        System.out.println("------------------------------------------------------------");
        System.out.println("What type of buns do you want?");
        System.out.println("1 - Classic;");
        System.out.println("2 - Brioche;");
        System.out.println("3 - Gluten-free;");
        System.out.println("4 - Pretzel;");
        System.out.println("------------------------------------------------------------");
        int bunChoice = scanner.nextInt();
        burger = switch (bunChoice) {
            case 1 -> new ClassicBuns();
            case 2 -> new BriocheBun();
            case 3 -> new NoGlutenBuns();
            case 4 -> new PretzelBuns();
            default -> new ClassicBuns();
        };
        String doneChoice;
        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("Add the filling: ");
            System.out.println("1 - Patty;");
            System.out.println("2 - Cheese;");
            System.out.println("3 - Lettuce;");
            System.out.println("4 - Pickles;");
            System.out.println("5 - Tomatoes;");
            System.out.println("------------------------------------------------------------");
            int fillingChoice = scanner.nextInt();
            burger = switch (fillingChoice) {
                case 1 -> new Patty(burger);
                case 2 -> new Cheese(burger);
                case 3 -> new Lettuce(burger);
                case 4 -> new Pickles(burger);
                case 5 -> new Tomatoes(burger);
                default -> burger;
            };
            System.out.println("Are you done? y/n");
            doneChoice = scanner.next();
        } while (doneChoice.equals("n"));
        System.out.println("------------------------------------------------------------");
        System.out.println("Your burger: " + burger.getDescription() + ".\nPrice: " + burger.getCost() + "$");
        System.out.println("------------------------------------------------------------");
    }
}