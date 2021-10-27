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

    private void modifyGroceryItem(int position, String value){
        groceryList.set(position, value);
        System.out.printf("Item %s added!%n", value);
    }

    public void modifyGroceryItem(String current, String newItem){
        int position = findItem(current);
        if(position >= 0){
            this.modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int position){
        String removedItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.printf("%s removed.%n", removedItem);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    public String searchGroceryItem(String item){
        int position = groceryList.indexOf(item);
        return (position >= 0) ? groceryList.get(position) : null;
    }

    private int findItem(String item){
        return groceryList.indexOf(item);
    }

    public boolean onFile(String item){
        return (this.findItem(item) >= 0);
    }
    public int size(){
        return groceryList.size();
    }
}
