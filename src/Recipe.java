import java.util.ArrayList;

public class Recipe {

    private double cookTime;
    private String recipeName;
    ArrayList<String> instructions = new ArrayList<String>();
    ArrayList<String> ingredients = new ArrayList<String>();

    public Recipe() {

    }

    public Recipe(String Name, ArrayList<String> ingredients, ArrayList<String> instructions, double cookTime) {
        this.cookTime = cookTime;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.recipeName = Name;
    }

    public double getCookTime() {
        return cookTime;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public String toString() {
        String s = "";
        s += "\nRecipe for " + recipeName + ":\n";
        s += "\nIngredients:\n";
        // 1. butter (\n)
        for (int i = 0; i < ingredients.size(); i++) {
            s += (i + 1) + ". " + ingredients.get(i) + "\n";
        }
        s += "\nInstructions:\n";
        for (int i = 0; i < instructions.size(); i++) {
            s += (i + 1) + ". " + instructions.get(i) + "\n";
        }
        s += "\nTotal Cook Time: " + toHourMinute(cookTime) + "\n";
        return s;
    }

    private String toHourMinute(double cookTime) {
        String s = "";
        if (cookTime >= 60) {
            s += (int) cookTime/60 + " Hours and ";
        }
        s += (int) cookTime%60 + " Minutes.";
        return s;
    }

}
