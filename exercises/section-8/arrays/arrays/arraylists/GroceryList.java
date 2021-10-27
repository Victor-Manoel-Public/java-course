package arrays.arraylists;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.printf("You have %d items in your grocery list!%n", this.groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.printf("%d) = %s.%n", (i+1), groceryList.get(i) );
        }
    }

    public void modifyGroceryItem(int position, String value){
        groceryList.set(position, value);
        System.out.printf("Item %d modified!%n", position);
    }

    public void removeGroceryItem(int position){
        String removedItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.printf("%s removed.%n", removedItem);
    }
}
