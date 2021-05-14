package main;

public class Master {
    static int money = 50;

    public static void checkCurrentMoneyOfMaster(){
        System.out.println("Current money of Master: " + getMoney() + " $\n");
    }

    public static int getMoney() {
        return money;
    }

    public static int moneyAfterCat(){
        money--;
        return money;
    }
}