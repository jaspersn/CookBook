public class Ingredient {

    private double amount;
    private String name;
    private String units;

    public Ingredient(double amount, String units, String name) {
        this.amount = amount;
        this.units = units;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnits() {
        return units;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return amount + " " + units + " of" + name;
    }
}
