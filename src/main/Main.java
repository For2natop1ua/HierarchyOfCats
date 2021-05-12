package main;

public class Main{

    public static void main(String[] args) {
        Home homeCat = new Home();
        Wild wildCat = new Wild();
        System.out.println("CoolStoryBob:\nThis story about 2 cats and his Master:\n\n"
                + homeCat.getAboutCat() + "\n" + wildCat.getAboutCat() + "\n");

        homeCat.checkCurrentMoneyOfMaster();
        homeCat.layOnSofa();

        homeCat.spoilShoes();
        homeCat.spoilShoes();

        wildCat.hatePeople();
        wildCat.saveWorld();
    }
}
