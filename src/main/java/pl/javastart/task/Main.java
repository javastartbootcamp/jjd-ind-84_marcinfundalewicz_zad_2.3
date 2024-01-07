package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcoholUsage = true;

        Drink drink2 = new Drink();
        drink2.name = "Jagerbomb";
        drink2.price = 15.0;
        drink2.alcoholUsage = true;

        Mojito mojito = new Mojito();
        Jagerbomb jagerbomb = new Jagerbomb();

        System.out.println("Drink: " + drink1.name + "\n" + "Cena: " + drink1.price + "zł" + "\n"
                + "Czy zawiera alkohol ? " + drink1.alcoholUsage + "\n" + "Składniki: " + "\n"
                + mojito.nameIngredient1 + "\n" + mojito.nameIngredient2 + "\n" +
                mojito.nameIngredient3 + "\n" + "Pojemność: " + mojito.totalAmount + "ml");

        System.out.println();

        System.out.println("Drink: " + drink2.name + "\n" + "Cena: " + drink2.price + "zł" + "\n"
                + "Czy zawiera alkohol ? " + drink2.alcoholUsage + "\n" + "Składniki: " + "\n"
                + jagerbomb.nameIngredient1 + "\n" + jagerbomb.nameIngredient2 + "\n" +
                jagerbomb.nameIngredient3 + "\n" + "Pojemność: " + jagerbomb.totalAmount + "ml");
    }
}
