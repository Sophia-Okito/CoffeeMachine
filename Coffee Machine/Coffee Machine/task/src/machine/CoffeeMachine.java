package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println(n);
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println((200*n) + " ml of water");
        System.out.println((50*n) + " ml of milk");
        System.out.println((15*n) + " g of coffe beans"); 
        System.out.println("Write how many ml of water the coffee machine has:");
        int aWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int aMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee bean the coffee machine has:");
        int aCoffeeBean = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int n = scanner.nextInt();
        int nCoffee = 0;
        int a = (aWater / 200);
        int b = (aMilk / 50);
        int c = (aCoffeeBean / 15);
        if (a <= b ) {
            nCoffee = a; 
        } else {
            nCoffee = b;
        } 
        if (nCoffee <= c) {
            nCoffee = nCoffee;
        } else {
            nCoffee = c;
        }
        if (n > nCoffee) {
            System.out.println("No, I can make only " + nCoffee + " cup(s) of coffee");
        } else if (n == nCoffee) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (nCoffee - n) + " more than that)"); 
        }
        
        */

        
        int amountOfWater = 400;
        int amountOfMilk = 540;
        int amountOfCoffee = 120;
        int amountOfCups = 9;
        int amountOfMoney = 550;
        
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        switch (action) {
            case "exit":
            break;
            
            case "remaining":
            System.out.println("\nThe coffee machine has:\n" +
                amountOfWater + " of water\n" +
                amountOfMilk + " of milk\n" +
                amountOfCoffee + " of coffee beans\n" +
                amountOfCups + " of disposable cups\n" +
                "$" + amountOfMoney + " of money");
            break;
            
            case "take":
            amountOfMoney -= amountOfMoney;
            System.out.println("I gave you $" + amountOfMoney);
            break;
            
            case "fill":
            System.out.println("Write how many ml of water do you want to add:");
            int aWater = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int aMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee bean do you want to add:");
            int aCoffeeBean = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            int cups = scanner.nextInt();
            amountOfWater += aWater;
            amountOfMilk += aMilk;
            amountOfCoffee += aCoffeeBean;
            amountOfCups += cups;
            break;
            
            case "buy":
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String type = scanner.next();
            switch (type) {
                case "1":
                amountOfWater = amountOfWater - 250;
                amountOfCoffee = amountOfCoffee - 16;
                amountOfMoney =  amountOfMoney + 4;
                amountOfCups = amountOfCups - 1;
                if (amountOfWater >= 250 || amountOfCoffee >= 16 || amountOfCups >= 1 ) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (amountOfWater < 250){
                        System.out.println("Sorry, not enough water!");
                    } else if (amountOfCoffee < 16) {
                        System.out.println("Sorry, not enough coffee bean!");
                    } else {
                        System.out.println("Sorry, not disposable cup!");
                    }
                }
                break;
                
                case "2":
                amountOfWater = amountOfWater - 350;
                amountOfMilk = amountOfMilk - 75;
                amountOfCoffee = amountOfCoffee - 20;
                amountOfMoney =  amountOfMoney + 7;
                amountOfCups = amountOfCups - 1;
                if (amountOfWater >= 350 || amountOfMilk >= 75 || amountOfCoffee >= 20 || amountOfCups >= 1 ) {
                    System.out.println("I have enough resources, making you a coffee!"); 
                } else {
                    if (amountOfWater <350){
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
                amountOfWater = amountOfWater - 200;
                amountOfMilk = amountOfMilk - 100;
                amountOfCoffee = amountOfCoffee - 12;
                amountOfMoney =  amountOfMoney + 6;
                amountOfCups = amountOfCups - 1;
                if (amountOfWater >= 200 || amountOfMilk >= 100 || amountOfCoffee >= 12 || amountOfCups >= 1 ) {
                    System.out.println("I have enough resources, making you a coffee!"); 
                } else {
                    if (amountOfWater <200){
                        System.out.println("Sorry, not enough water!");
                    } else if (amountOfMilk < 100) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (amountOfCoffee < 12) {
                        System.out.println("Sorry, not enough coffee bean!");
                    } else {
                        System.out.println("Sorry, not disposable cup!");
                    }
                }
                break;
                
                case "back":
                break;
            }
            break;
        }
    
    } 
}
