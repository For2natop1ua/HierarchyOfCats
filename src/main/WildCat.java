package main;

public class WildCat extends Cat{

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

    public void getAboutWildCat(){
        System.out.println(getName() + " " + getBreed() + " is a wild cat.");
    }

    public void hatePeople(){
        System.out.println(getName() + " " + getBreed() + " hates people, so he doesn`t care.");
    }

    public void saveWorld(){
        System.out.println(getName() + " " + getBreed() + " wants to save the world from these worthless people!");
    }
}
