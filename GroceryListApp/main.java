import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.PrintList();
                    break;
                case 2:
                    AddItem();
                    break;
                case 3:
                    ModifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    Search();
                    break;
                case 6:
                    quit = true;
                    break;
                    default:
                        System.out.println("Please enter a valid choice betweem 0-7");
                        break;



            }
        }

    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void AddItem(){
        System.out.print("Please Enter the Item: ");
        groceryList.addItem(scanner.nextLine());
    }
    public static void ModifyItem(){
        System.out.print("Please Enter the Item Number: ");
        int ItemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement Item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyItem(ItemNo-1 , newItem);

    }
    public static void removeItem(){
        System.out.print("Please enter the item No: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNo-1);

    }
    public static void Search(){
        System.out.print("Item to search for: ");
        String Item = scanner.nextLine();
        if(groceryList.findItem(Item) != null){
            System.out.println("Found " + Item + " in the list.");

        }
        else{
            System.out.println(Item + " is not found");
        }

    }

}
