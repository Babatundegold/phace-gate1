import java.util.ArrayList;
import java.util.Scanner;

public class GoseryApp {

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

    do {
	System.out.println("\nGrocery List Menu:");
	System.out.println("1. Add an item");
	System.out.println("2. Remove an item");
	System.out.println("3. Show available items");
	System.out.println("0. Exit");
	System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
case 1:
	System.out.print("Enter the item to add: ");
        String itemToAdd = scanner.nextLine();
        groceryList.add(itemToAdd);
        System.out.println(itemToAdd + " has been added to the list.");
                    break;
case 2:
       if (groceryList.isEmpty()) {
	System.out.println("The list is empty. Nothing to remove.");
	}else{
	System.out.print("Enter to exist ");
	String itemToRemove = scanner.nextLine();


}
		 scanner.close();
}
}











                   