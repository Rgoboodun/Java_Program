import java.util.Scanner;
/**
 * @author Riyash Goboodun
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner
		Scanner key = new Scanner(System.in);
		
		//initializing variable
		
		int size, choice, wrong, item, available, count = 0;
		int counter = 0;
		String pwrd,itemId, name, description, category,supName, supCon;
		final String PASSWORD = "DitProg123";
		double price;

		 
		System.out.println("Welcome to the lab inventory");
		
		System.out.print("Enter maximum number of Items to be store: ");
		size = key.nextInt();//to allow user input
		
		//Create an empty array
		Item [] itemDatabase = new Item[size];
		
		while(count < 12) {
			System.out.println("What do you want to do?");
			System.out.println("Enter 1 to add new Item to the inventory");
			System.out.println("Enter 2 to chnage information of an existing Item");
			System.out.println("Enter 3 to display all the Items with specified category");
			System.out.println("Enter 4 to display all Item to be re-ordered");
			System.out.println("Enter 5 to know number of Items currenlty in store");
			System.out.println("Enter 6 to quit");
			System.out.print("Enter your choice: ");
			choice = key.nextInt();
					
			if (choice == 1) {
				System.out.println("Add new item to the inventory");
				for(int attempt = 0; attempt <3; attempt++) {
					System.out.print("Enter your password. Attempt "+(attempt+1)+": ");
					pwrd = key.next();
					
					if(!pwrd.equals(PASSWORD)) {
						count++;
						if(count == 12) {
							System.out.println("Program detected suspicious activity and is terminating!");
							break;
						}
					}
					else if(pwrd.equals(PASSWORD)) {
						do {
							System.out.println("How many item do you want to enter");
							item = key.nextInt();
							
							if (item >= (itemDatabase.length - Item.getTotalItems()) ) {
								System.out.println("Not enough space to add that many item");
								System.out.println("Remaining Item: "+(itemDatabase.length - Item.getTotalItems()));
							}
							else {
								for(int i = 0; i < item; i++) {
									System.out.println("Enter item ID: ");
									itemId = key.next();
									
									System.out.println("Enter Name: ");
									name = key.next();
									
									System.out.println("Enter Description: ");
									description = key.next();
									
									System.out.println("Enter category: ");
									category = key.next();
									
									System.out.println("Enter Supplier Name: ");
									supName = key.next();
									
									System.out.println("Enter Supplier contacts: ");
									supCon = key.next();
									
									System.out.println("Enter Price: ");
									price = key.nextDouble();
									
									System.out.println("Enter Available quantity: ");
									available = key.nextInt();
									
									itemDatabase[i] = new Item(itemId, name, description, category, supName, supCon, price, available);
									System.out.println(itemDatabase[i]);
								}
							}
						}while(item >= (itemDatabase.length - Item.getTotalItems()));				
					}
				}
				
			}
			
			else if(choice == 2) {
				for(int attempt = 0; attempt <3; attempt++) {
					System.out.print("Enter your password. Attempt "+(attempt+1)+": ");
					pwrd = key.next();
					
					if(!pwrd.equals(PASSWORD)) {
						count++;
						if(count == 3) {
							break;
						}
					}
					else if(pwrd.equals(PASSWORD)) {
						System.out.println("Which item do you want to update");
						do {
							System.out.println("Enter item ID: ");
								itemId = key.next();
								
								if(itemDatabase.equals(itemId)) {
									System.out.println("Item ID: "+ itemDatabase[itemId.indexOf(itemId)].getItemId());
									System.out.println("Name: "+ itemDatabase[itemId.indexOf(itemId)].getName());
									System.out.println("Description: "+ itemDatabase[itemId.indexOf(itemId)].getDescription());
									System.out.println("Category: "+ itemDatabase[itemId.indexOf(itemId)].getCategory() );
									System.out.println("Supplier Name: "+ itemDatabase[itemId.indexOf(itemId)].getSupplierName());
									System.out.println("Supplier contact: "+ itemDatabase[itemId.indexOf(itemId)].getSupplierContact());
									System.out.println("Price: "+ itemDatabase[itemId.indexOf(itemId)].getPrice() );
									System.out.println("Available qty: "+ itemDatabase[itemId.indexOf(itemId)].getAvailableQuantity());
									
									System.out.println("What information of this Item would you like to change?");
									System.out.println("1. Name\n2. Description\n3. Category\n4. Supplier Name\n5. Supplier contacts\n6. Price\n7. Available Qty\n8. Quit");
									System.out.println("Enter your choice: ");
									choice = key.nextInt();
								
									if (choice == 1) {
										System.out.println("Change Name");
										
									}
									else if (choice == 2) {
										
									}
									else if (choice == 3) {
										
									}
									else if (choice == 4) {
										
									}
									else if (choice == 5) {
										
									}
									else if (choice == 6) {
										
									}
									else if (choice == 7) {
										
									}
									else if (choice == 8) {
										System.out.println("Quit");
										break;
									}
									
								}
								else {
									System.out.println("No item with the specified ID");
									System.out.println("Do you want to continue or quit");
									System.out.println("To continue enter 1 and to quit enter 2");
									choice = key.nextInt();	
								}
						}while(choice == 1);
					}
				}
			}
			else if(choice == 3) {
				System.out.println("Enter Category of an item");
				category = key.next();
				
			}
			
			else if(choice == 4) {
				
			}
			
			else if(choice == 5) {
				System.out.println("Number of items: "+Item.getTotalItems());
				break;
			}
			
			else if(choice == 6) {
				System.out.println("Thank you. You end the program");
				break;
				}
					

		}
		key.close();
	}

}
