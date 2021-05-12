package main;

public class Wild extends Base{

    @Override
    public String getBreed() {
        return "Northern";
    }

    @Override
    public String getName() {
        return "Mitya";
    }

    @Override
    public String getAboutCat(){
        return super.getAboutCat() +  " is a wild cat.";
    }

    public void hatePeople(){
        System.out.println(getName() + " " + getBreed() + " hates people, so he doesn`t care.");
    }

    public void saveWorld(){
        System.out.println(getName() + " " + getBreed() + " wants to save the world from these worthless people!");
    }
}
