package main;

public class Main{

    public static void main(String[] args) {
        System.out.println("CoolStoryBob:\nThis story about 2 cats and his Master:");

        HomeCat homeCat1 = new HomeCat();
        homeCat1.setName("Misha");
        homeCat1.setBreed("Vinegar");
        homeCat1.getAboutHomeCat();

        Master.checkCurrentMoneyOfMaster();

        homeCat1.layOnSofa();
        homeCat1.spoilShoes();
        homeCat1.spoilShoes();

        WildCat wildCat1 = new WildCat();
        wildCat1.setName("Mitya");
        wildCat1.setBreed("Northen");
        wildCat1.getAboutWildCat();
        wildCat1.hatePeople();
        wildCat1.saveWorld();

        HomeCat homeCat2 = new HomeCat();
        homeCat2.setName("Fernando");
        homeCat2.setBreed("Alvarengo");
        homeCat2.getAboutHomeCat();

        WildCat wildCat2 = new WildCat();
        wildCat2.setName("Jora");
        wildCat2.setBreed("Chibisov");
        wildCat2.hatePeople();
    }
}
