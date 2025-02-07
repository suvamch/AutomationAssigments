package Assigment.com.creatio.crm.language.basics;

public class Grocerytest {



	public static void main(String[] args) {
		
		GroceryList obj = new GroceryList();

        obj.addItemsGroceryList("Fresh Fruits");
        obj.addItemsGroceryList("Milk and Bread");
        obj.addItemsGroceryList("Vegetables");


        obj.removeItemsGroceryList("Milk and Bread");


        obj.viewList();

	}

}