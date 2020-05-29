package hickman_final;

import java.util.ArrayList;
import java.util.Scanner;

/* Author: Heather Hickman
	Class: CPT 236 H01 Intro to Java Programming
	Description: Final Project
	Date written: 7/23/2019
	Date last updated: 8/5/2019
	Program name: hickman_finalProject.java, orderEntry.java
	
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

public class orderEntry {
	
		// VARIABLES
		double userOrder;
		double subTotal;
		double overallTotal;
		static final double TAX_RATE = .11;

		
		// CREATE CONSTRUCTOR
		public orderEntry() {
			double userOrder = 0;
			double subTotal = 0;
			double overallTotal = 0;
			
			// Calculate the overall total of the chosen items
			overallTotal = (subTotal * 0.11) + subTotal;	}

		
		
		// SETTERS (MUTATORS)
		public void setUO(double uo) {
			userOrder = uo; }
		
		public void setSTotal(double st) {
			subTotal = st; }
		
		
		// GETTERS (ACCESSORS)
		public double getUO() {
			return userOrder;	}
		
		public double getSTotal() {
			return subTotal;	}
		
		
		
		// A method to print out the menu that the user can choose from
		public static void printMenu(){
			System.out.println("Welcome to Thor's Tasty Treats!\nPlease choose an item to enjoy from the menu below!\n"
					+ "\n1. Cinnamon Pastry\t\t$5.00\n2. Chocolate Chip Cookie\t$2.50"
					+ "\n3. Marble Cake Slice\t\t$8.00\n4. Ice Cream Scoop\t\t$6.50\n5. Glazed Doughnut\t\t$3.00\n\n"
					+ "Please enter the Tasty Treat item #(1-5) that you would like!\nWhen you are done, press 9!\n"); }

}
