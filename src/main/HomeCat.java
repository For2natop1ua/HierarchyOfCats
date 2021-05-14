package main;

public class HomeCat extends Cat{

    @Override
    public String getBreed() {
        return "Vinegar";
    }

    @Override
    public String getName() {
        return "Misha";
    }


    public void getAboutHomeCat(){
        System.out.println(getName() + " " + getBreed() + " is a home cat and he likes to spoil shoes.");
    }

    public void layOnSofa(){
        System.out.println(getName() + " " + getBreed() + " lay on sofa.");
    }

    public void spoilShoes(){
        System.out.println(getName() + " " + getBreed() + " spoil shoes.");
        System.out.println("Oh no!\nCurrent money of Master: " + Master.moneyAfterCat() + " $\n");
    }
}
