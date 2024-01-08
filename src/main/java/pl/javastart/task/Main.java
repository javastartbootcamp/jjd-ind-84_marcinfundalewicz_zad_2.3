package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcoholUsage = true;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient3 = new Ingredient();
        drink1.ingredient1.name = "Woda";
        drink1.ingredient2.name = "Sok cytrynowy";
        drink1.ingredient3.name = "Wódka";
        drink1.ingredient1.amount = 70;
        drink1.ingredient2.amount = 70;
        drink1.ingredient3.amount = 70;
        double totalAmountMojito = drink1.ingredient1.amount + drink1.ingredient2.amount
                + drink1.ingredient3.amount;

        System.out.println("Drink: " + drink1.name + "\n" + "Cena: " + drink1.price + "zł" + "\n" + "Czy zawiera alkohol ? "
                + drink1.alcoholUsage + "\n" + "Składniki: " + "\n" + drink1.ingredient1.name + "\n"
                + drink1.ingredient2.name + "\n" + drink1.ingredient3.name + "\n" + totalAmountMojito + "ml");

        Drink drink2 = new Drink();
        drink2.name = "Jagerbomb";
        drink2.price = 15.0;
        drink2.alcoholUsage = true;
        drink2.ingredient1 = new Ingredient();
        drink2.ingredient2 = new Ingredient();
        drink2.ingredient3 = new Ingredient();
        drink2.ingredient1.name = "Jagermeister";
        drink2.ingredient2.name = "Redbull";
        drink2.ingredient3.name = "Sok";
        drink2.ingredient1.amount = 100;
        drink2.ingredient2.amount = 50;
        drink2.ingredient3.amount = 25;
        double totalAmountJagerbomb = drink2.ingredient1.amount + drink2.ingredient2.amount
                + drink2.ingredient3.amount;

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Drink: " + drink2.name + "\n" + "Cena: " + drink2.price + "zł" + "\n" + "Czy zawiera alkohol ? "
                + drink2.alcoholUsage + "\n" + "Składniki: " + "\n" + drink2.ingredient1.name + "\n"
                + drink2.ingredient2.name + "\n" + drink2.ingredient3.name + "\n" + totalAmountJagerbomb + "ml");
    }
}