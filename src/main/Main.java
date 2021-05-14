package main;

public class Main{

    public static void main(String[] args) {
        HomeCat homeCat = new HomeCat();
        WildCat wildCat = new WildCat();
        System.out.println("CoolStoryBob:\nThis story about 2 cats and his Master:");

        homeCat.getAboutHomeCat();
        wildCat.getAboutWildCat();

        Master.checkCurrentMoneyOfMaster();

        homeCat.layOnSofa();

        homeCat.spoilShoes();
        homeCat.spoilShoes();

        wildCat.hatePeople();
        wildCat.saveWorld();
    }
}
