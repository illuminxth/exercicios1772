import java.util.Scanner;

public class exerciciofrutas {
    public static void main(String[] args) {

        String[] fruits = new String[5];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        fruits[3] = "Avocado";

        System.out.println("Hi! Your list of fruits is here: ");
        for (String f : fruits) {
            if (f != null) {
                System.out.println(f);
            } else {
                System.out.println("");
            }
        }

        System.out.println("Write a fruit: ");
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();

        boolean fruitExists = false;
        int position = 0;
        for (String f : fruits) {
            if (fruit.equals(f)) {
                fruitExists = true;
                System.out.println("Great! - " + fruit + " is in position " + position);
            }
            position++;

        }
        System.out.println("Oh... - " + fruit + " is not on list");

        System.out.println("\nOPTIONS:\n1 - Add a fruit\n2 - Remove a fruit");
        Scanner option = new Scanner(System.in);
        String options = option.nextLine();
        switch (options) {
        case "1":
            System.out.println("\nYour choose: 1\n1 - Add a new fruit:");
            String newfruit = scan.nextLine();
            fruits[4] = newfruit;
            System.out.println("");
            System.out.println("Update list of fruits:");
            for (String f : fruits) {
                if (f != null) {
                    System.out.println(f);
                } else {
                    System.out.println("");
                }
            }
            System.out.println("\n*Successfully added " + newfruit + " on array*");
            break;
        }
    }
}
