package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static int amountOfWater = 400;
    static int amountOfMilk = 540;
    static int amountOfCoffee = 120;
    static int amountOfCups = 9;
    static int amountOfMoney = 550;
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void remaining(){
        System.out.println("\nThe coffee machine has:\n" + amountOfWater + " of water\n" + amountOfMilk + " of milk\n" +
        amountOfCoffee + " of coffee beans\n" +
        amountOfCups + " of disposable cups\n" +
        "$" + amountOfMoney + " of money");
    }
    
    public static void take() {
        amountOfMoney -= amountOfMoney;
        System.out.println("\nI gave you $" + amountOfMoney);
    }
    
    public static void fill() {
        System.out.println("\nWrite how many ml of water do you want to add:");
        int aWater = scanner.nextInt();
        System.out.println("\nWrite how many ml of milk do you want to add:");
        int aMilk = scanner.nextInt();
        System.out.println("\nWrite how many grams of coffee bean do you want to add:");
        int aCoffeeBean = scanner.nextInt();
        System.out.println("\nWrite how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        amountOfWater += aWater;
        amountOfMilk += aMilk;
        amountOfCoffee += aCoffeeBean;
        amountOfCups += cups;
    }
    
    public static void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = scanner.next();
        switch (type) {
            case "1":
                if (amountOfWater >= 250 && amountOfCoffee >= 16 && amountOfCups >= 1 ) {
                    amountOfWater -= 250;
                    amountOfCoffee -= 16;
                    amountOfMoney += 4;
                    amountOfCups--;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else {
                    if (amountOfWater < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (amountOfCoffee < 16) {
                        System.out.println("Sorry, not enough coffee bean!");
                    } else {
                        System.out.println("Sorry, not disposable cup!");
                    }
                }
                break;
                
            case "2":
                if (amountOfWater >= 350 && amountOfMilk >= 75 && amountOfCoffee >= 20 && amountOfCups >= 1 ) {
                    amountOfWater -= 350;
                    amountOfMilk -= 75;
                    amountOfCoffee -= 20;
                    amountOfMoney += 7;
                    amountOfCups--;
                    System.out.println("I have enough resources, making you a coffee!"); 
                    break;
                } else {
                    if (amountOfWater < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if (amountOfMilk < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (amountOfCoffee < 20) {
                        System.out.println("Sorry, not enough coffee bean!");
                    } else {
                        System.out.println("Sorry, not disposable cup!");
                    }
                }
                break;
                
            case "3":
                if (amountOfWater >= 200 && amountOfMilk >= 100 && amountOfCoffee >= 12 && amountOfCups >= 1 ) {
                    amountOfWater -= 200;
                    amountOfMilk -= 100;
                    amountOfCoffee -= 12;
                    amountOfMoney += 6;
                    amountOfCups--;
                    System.out.println("I have enough resources, making you a coffee!"); 
                    break;
                } else {
                    if (amountOfWater < 200) {
                        System.out.println("Sorry, not enough water!");
                        break;
                    } else if (amountOfMilk < 100) {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    } else if (amountOfCoffee < 12) {
                        System.out.println("Sorry, not enough coffee bean!");
                        break;
                    } else {
                        System.out.println("Sorry, not disposable cup!");
                    }
                }
                break;
        }
    
    }
    public static void exit() {
        System.exit(0);
    }
    

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            if (action.equals("exit")) {
                exit();
            } else if (action.equals("buy")) {
                buy();
            } else if (action.equals("fill")) {
                fill();
            } else if (action.equals("remaining")) {
                remaining();
            } else {
                take();
            }
            
        } 
    }
}
