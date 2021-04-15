import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Recipe> cookBook = new ArrayList<>();
        boolean wantsToEat = true;
        do {
            System.out.println("Cook Book");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1) Add Recipe");
        System.out.println("2) View Recipe");
        System.out.println("3) List All Recipes");
        System.out.println("4) Exit");
        System.out.print(": ");
        int choice = s.nextInt();
        s.nextLine();
        switch (choice) {
            case 1:
                promptAddRecipe(cookBook, s);
                break;
            case 2:
                promptViewRecipe(cookBook, s);
                break;
            case 3:
                for (Recipe recipe : cookBook) {
                    System.out.println(recipe);
                }
            default:
                wantsToEat = false;
        }
        } while (wantsToEat);
    }

    private static void promptViewRecipe(ArrayList<Recipe> cookBook, Scanner s) {
        System.out.println("What Recipe Would You Like to View?");
        for (int i = 0; i < cookBook.size(); i++) {
            System.out.println((i + 1) + ". " + cookBook.get(i).getRecipeName());
        }
        System.out.print(": ");
        int choice = s.nextInt();
        System.out.println(cookBook.get(choice - 1));
    }

    private static void promptAddRecipe(ArrayList<Recipe> cookBook, Scanner s) {
        System.out.println("Add a Recipe:");
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Ingredients: ");
        ArrayList<String> ingredients = new ArrayList<>();
        String i = s.nextLine();
        while (!i.equals("-1")) {
            ingredients.add(i);
            System.out.println("Next Ingredient: (-1 to end) ");
            i = s.nextLine();
        }
        System.out.print("Instructions: ");
        ArrayList<String> instructions = new ArrayList<>();
        i = s.nextLine();
        while (!i.equals("-1")) {
            instructions.add(i);
            System.out.println("Next Instruction: (-1 to end) ");
            i = s.nextLine();
        }
        System.out.print("Total Cook Time in Minutes: ");
        double cookTime = s.nextDouble();
        cookBook.add(new Recipe(name, ingredients, instructions, cookTime));
        System.out.println("Recipe Added!");
    }
}
