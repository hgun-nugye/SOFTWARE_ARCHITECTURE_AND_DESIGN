package behavioral.template;

public class MainCaffein {
    public static void main(String[] args) {
        CaffeinBeverage tea = new Tea();
        CaffeinBeverage coffee = new Coffee();

        System.out.println("MAKING TEA...");
        tea.prepareRecipe();

        System.out.println("\nMAKING COFFEE...");
        coffee.prepareRecipe();
    }
}
