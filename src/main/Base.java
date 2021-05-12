package main;

public abstract class Base {
    static int money = 50;
    private String name;
    private String breed;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getAboutCat() {
        return getName() + " named " + getBreed();
    }

    public static int getMoney() {
        return money;
    }

    public static int moneyAfterCat(){
        money--;
        return money;
    }
}
