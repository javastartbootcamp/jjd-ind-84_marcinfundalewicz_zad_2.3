package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcoholUsage = true;
        drink1.component1 = "Woda";
        drink1.component2 = "Sok cytrynowy";
        drink1.component3 = "Wódka";
        drink1.capacity = 210;

        System.out.println("Drink: " + drink1.name + "\n" + "Cena: " + drink1.price + "zł" + "\n" + "Czy zawiera alkohol ? " +
                drink1.alcoholUsage + "\n" + "Składniki: " + "\n" + drink1.component1 + "\n" + drink1.component2 + "\n" +
                drink1.component3 + "\n" + "Pojemność: " + drink1.capacity + "ml");
    }
}
