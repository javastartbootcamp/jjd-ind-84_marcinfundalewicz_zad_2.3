package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcoholUsage = true;
        drink1.mojito = new Mojito();
        drink1.mojito.nameIngredient1 = "Woda";
        drink1.mojito.nameIngredient2 = "Sok cytrynowy";
        drink1.mojito.nameIngredient3 = "Wódka";
        drink1.mojito.amountIngredient1 = 70;
        drink1.mojito.amountIngredient2 = 70;
        drink1.mojito.amountIngredient3 = 70;
        double totalAmount = drink1.mojito.amountIngredient1 + drink1.mojito.amountIngredient1 + drink1.mojito.amountIngredient1;

        System.out.println("Drink: " + drink1.name + "\n" + "Cena: " + drink1.price + "zł" + "\n" + "Czy zawiera alkohol ? "
                + drink1.alcoholUsage + "\n" + "Składniki: " + "\n" + drink1.mojito.nameIngredient1 + "\n"
                + drink1.mojito.nameIngredient2 + "\n" + drink1.mojito.nameIngredient3 + "\n" + totalAmount + "ml");
    }
}
