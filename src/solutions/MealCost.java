package solutions;

public class MealCost {
    public static void main(String[] args) {
        solve(12, 20, 8);
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipPercent = meal_cost * (tip_percent * 1.00 / 100);
        double taxPercent = meal_cost * (tax_percent * 1.00 / 100);

        System.out.println(Math.round(meal_cost + tipPercent + taxPercent));
    }

}
