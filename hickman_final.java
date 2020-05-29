package hickman_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Author: Heather Hickman
	Class: CPT 236 H01 Intro to Java Programming
	Description: Final Project
	Date written: 7/23/2019
	Date last updated: 8/5/2019
	Program name: hickman_finalProject.java
	
	Program summary: Final Project
	For this project you will create an order entry system so people can choose one of five items to 
	order at a restaurant. The menu items should hold the name of the item as well as a price. When the 
	user is ordering, they should be able to continue to input items as long as they desire, or until they have 
	entered 10 items to order.
	
	A class named orderEntry should also be created with the appropriate constructor, accessor and mutator methods.
	As the user is entering the items they wish to order, these items should be placed into a separate array as they
	are ordered. Once the user is done entering items, the program should use the array to output all items that were
	ordered to the screen, with their prices. 
	
	Additionally, a subtotal should be given, as well as a final total including 11% sales tax.
	As always, proper programming practices should be adhered to at all times */

public class hickman_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// CREATE SCANNER KEYBOARD
		Scanner keyboard = new Scanner(System.in);
		
		
		// Initialize Variables, including the arrayList that will hold all of the users orders
		double userOrder = 0;
		double subTotal = 0.0;
		double overallTotal = 0.0;
		ArrayList<String> orderReceipt = new ArrayList<String>();

		
		// Print out the menu for the user to view
		orderEntry.printMenu();
		
						
		// Create a newUserOrder object from the orderEntry class
		orderEntry newUserOrder = new orderEntry();
		

		// To get user order, use for loop that will only iterate up to 10 times
		for(int i = 1; i <= 10 ;i++){
			// Prints out the item number as they go along
			System.out.print("Item " + i + ": ");
			userOrder = keyboard.nextDouble();
			
			// If/else statements to determine which number from the menu the user has chosen
			// Depending on that number, add the menu item to the arrayList
			// Calculate the subtotal based on the menu item. Will continue to add to the total for as many items as chosen
			if (userOrder == 1) {
				orderReceipt.add("Cinnamon Pastry\t\t$5.00\n");
				subTotal = subTotal + 5.00; }
		
			else if (userOrder == 2) {
				orderReceipt.add("Chocolate Chip Cookie\t$2.50\n");
				subTotal = subTotal + 2.50; }
			
			else if (userOrder == 3) {
				orderReceipt.add("Marble Cake Slice\t$8.00\n");
				subTotal = subTotal + 8.00; }
			
			else if (userOrder == 4) {
				orderReceipt.add("Ice Cream Scoop\t\t$6.50\n");
				subTotal = subTotal + 6.50; }
			
			else if (userOrder == 5) {
				orderReceipt.add("Glazed Doughnut\t\t$3.00\n");
				subTotal = subTotal + 3.0; }
			
			// If user presses 9 (0, or any number greater than 5) they can automatically exit the loop and end their order
			// Automatically sets the iterations to 10 to end the loop
			else if (userOrder == 9) {
				i = 10;}
			
			else {i = 10;}
									}
		
		
		// Calculates the overallTotal, adding the 11% tax to the subTotal
		overallTotal = (subTotal * 0.11) + subTotal;
		
		// Adds the subTotal, Tax, and overall Total in a printable string to the arrayList
		orderReceipt.add("\nSubtotal: " + subTotal + "\nTax: " + (subTotal*0.11) + "\nTotal: " + overallTotal);
		
		// Print out a statement thanking the user for their order once they are done
		System.out.println("\nThank you for your order!\n");
		
		// Print out each item the user ordered, along with price, and the subTotal/Tax/overallTotal string
		// .size determines how many items are in the index of the arrayList so that .get can print them out in a neat list
		System.out.println("Description\t\tPrice\n-----------\t\t-----");
		for (int i = 0; i < orderReceipt.size(); i++) { 
			System.out.print(orderReceipt.get(i)); }

	}

}