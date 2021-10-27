package arrays.arraylists;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    sayGoodBye();
                    quit = true;
                    break;
            }
        }
    }

    private static void sayGoodBye() {
        String[] phrases = {
                "I'm gonna miss you :(",
                "Please, don't go </3 ",
                "I hope you come back soon",
                "Have a nice shopping!"
        };

        int random = new Random().nextInt(phrases.length);
        System.out.println(phrases[random]);
    }

    private static void searchItem() {
        System.out.print("Item to search for > ");
        String item = sc.nextLine();
        System.out.println(
                (groceryList.searchGroceryItem(item) != null ) ?
                        "Found " + "\""+ item + "\"" + " in our grocery list." :
                        "\""+ item + "\"" + " not found in the shopping list."
        );
    }

    private static void removeItem() {
        System.out.print("Item name to remove > ");
        groceryList.removeGroceryItem(sc.nextLine());
    }

    private static void modifyItem() {
        groceryList.printGroceryList();
        if(groceryList.size() == 0){
            System.out.println("You cannot modify because your grocery list is empty!");
        }else{
            System.out.print("Enter item name to modify > ");
            String currentItem = sc.next();
            sc.nextLine();
            System.out.print("Enter a replacement for " + "\""+currentItem+"\" > ");
            String replacement = sc.nextLine();
            groceryList.modifyGroceryItem(currentItem, replacement);
        }

    }

    private static void addItem() {
        System.out.print("Enter the grocery item to add > ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    private static void printInstructions() {
        System.out.println("Press:");
        System.out.println("\t 0 - print instructions");
        System.out.println("\t 1 - print grocery list items");
        System.out.println("\t 2 - add a list item");
        System.out.println("\t 3 - modify a grocery item");
        System.out.println("\t 4 - remove a grocery item");
        System.out.println("\t 5 - search for an item on the list");
        System.out.println("\t 6 - to quit");
    }
}
