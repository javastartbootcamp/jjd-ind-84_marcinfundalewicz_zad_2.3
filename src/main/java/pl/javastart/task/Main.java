package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcoholUsage = true;
        drink1.ingredient = new Ingredient();
        drink1.ingredient.nameIngredient1 = "Woda";
        drink1.ingredient.nameIngredient2 = "Sok cytrynowy";
        drink1.ingredient.nameIngredient3 = "Wódka";
        drink1.ingredient.amountIngredient1 = 70;
        drink1.ingredient.amountIngredient2 = 70;
        drink1.ingredient.amountIngredient3 = 70;
        double totalAmountMojito = drink1.ingredient.amountIngredient1 + drink1.ingredient.amountIngredient2
                + drink1.ingredient.amountIngredient3;

        System.out.println("Drink: " + drink1.name + "\n" + "Cena: " + drink1.price + "zł" + "\n" + "Czy zawiera alkohol ? "
                + drink1.alcoholUsage + "\n" + "Składniki: " + "\n" + drink1.ingredient.nameIngredient1 + "\n"
                + drink1.ingredient.nameIngredient2 + "\n" + drink1.ingredient.nameIngredient3 + "\n" + totalAmountMojito + "ml");

        Drink drink2 = new Drink();
        drink2.name = "Jagerbomb";
        drink2.price = 15.0;
        drink2.alcoholUsage = true;
        drink2.ingredient = new Ingredient();
        drink2.ingredient.nameIngredient1 = "Jagermeister";
        drink2.ingredient.nameIngredient2 = "Redbull";
        drink2.ingredient.nameIngredient3 = "Sok";
        drink2.ingredient.amountIngredient1 = 100;
        drink2.ingredient.amountIngredient2 = 50;
        drink2.ingredient.amountIngredient3 = 25;
        double totalAmountJagerbomb = drink2.ingredient.amountIngredient1 + drink2.ingredient.amountIngredient2
                + drink2.ingredient.amountIngredient3;

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Drink: " + drink2.name + "\n" + "Cena: " + drink2.price + "zł" + "\n" + "Czy zawiera alkohol ? "
                + drink2.alcoholUsage + "\n" + "Składniki: " + "\n" + drink2.ingredient.nameIngredient1 + "\n"
                + drink2.ingredient.nameIngredient2 + "\n" + drink2.ingredient.nameIngredient3 + "\n" + totalAmountJagerbomb + "ml");
    }
}