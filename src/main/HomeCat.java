package main;

public class HomeCat extends Cat{

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
