package main;

public class Home extends Base{
    @Override
    public String getBreed() {
        return "Vinegar";
    }

    @Override
    public String getName() {
        return "Misha";
    }


    @Override
    public String getAboutCat(){
        return super.getAboutCat() +  " is a home cat and he likes to spoil shoes.";
    }

    public void layOnSofa(){
        System.out.println(getName() + " " + getBreed() + " lay on sofa.");
    }

    public void spoilShoes(){
        System.out.println(getName() + " " + getBreed() + " spoil shoes.");
        System.out.println("Oh no!\nCurrent money of Master: " + Base.moneyAfterCat() + " $\n");
    }

    public void checkCurrentMoneyOfMaster(){
        System.out.println("Current money of Master: " + Base.getMoney() + " $\n");
    }
}
