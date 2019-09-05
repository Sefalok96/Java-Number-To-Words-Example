import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String >();

    public void addItem(String Item){
        groceryList.add(Item);
    }
    public void PrintList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0 ; i<groceryList.size() ; i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyItem(int pos , String newItem){
        groceryList.set(pos,newItem);
        System.out.println("Grocery item " + (pos+1) + " has been modified.");
    }
    public void removeItem(int pos){
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);
    }
    public String findItem(String Item){
        boolean exist = groceryList.contains(Item);
        if(exist){
            int pos = groceryList.indexOf(Item);
            return groceryList.get(pos);
        }
        return null;
    }
}
