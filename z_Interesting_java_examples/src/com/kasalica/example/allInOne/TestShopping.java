package com.kasalica.example.allInOne;

import java.util.Iterator;

import com.kasalica.example.allInOne.builder.ItemBuilder;
import com.kasalica.example.allInOne.builder.ShoppingBasketBuilder;
import com.kasalica.example.allInOne.composite.Employee;
import com.kasalica.example.allInOne.composite.Manager;
import com.kasalica.example.allInOne.composite.Staff;
import com.kasalica.example.allInOne.decorator.CountDecorator;
import com.kasalica.example.allInOne.facade.PurchaseEvaluation;
import com.kasalica.example.allInOne.items.Book;
import com.kasalica.example.allInOne.items.CD;
import com.kasalica.example.allInOne.items.Item;
import com.kasalica.example.allInOne.observer.Department;
import com.kasalica.example.allInOne.observer.LogisticsDepartment;
import com.kasalica.example.allInOne.observer.SalesDepartment;
import com.kasalica.example.allInOne.observer.StockControl;
import com.kasalica.example.allInOne.observer.XYZStockControl;
import com.kasalica.example.allInOne.proxy.PriceListUser;
import com.kasalica.example.allInOne.strategy.CheckStrategy;
import com.kasalica.example.allInOne.strategy.LongerThan15;
import com.kasalica.example.allInOne.strategy.StartsWithCD;
import com.kasalica.example.allInOne.visitor.GoodsLabellingVisitor;
import com.kasalica.example.allInOne.visitor.ItemVisitor;

public class TestShopping {

	/**
	 * Class with main(String[] args) method which initially gets loaded by the
	 * class loader. Subsequent classes are loaded as they are referenced in the
	 * program.
	 */
	public static void main(String[] args) throws ItemException {
		process();
	}

	public static void process() throws ItemException {
		/**
		 * ******Creational Patterns:SINGLETON, FACTORY METHOD, BUILDER *******
		 */
		System.out.println("----create a shopping basket with items ---");
		// Shopping basket using the builder pattern
		ItemBuilder builder = new ShoppingBasketBuilder();
		// build basket of items using a builder pattern
		builder.buildBasket(Item.TYPE_BOOK, "Book - IT", 1, 12.00);
		builder.buildBasket(Item.TYPE_CD, "CD - JAZZ", 1, 15.00);
		builder.buildBasket(Item.TYPE_COSMETICS, "Cosmetics - Lipstick", 1, 1.0);
		// let’s print prices and taxes of this built basket
		double totalTax = builder.calculateTotalTax();
		builder.printExtendedTaxedPrice();
		System.out.println("Sales Taxes: " + totalTax);
		System.out.println("Grand Total:" + builder.calculateTotal());
		System.out.println("----- After adding an imported CD to the basket ----");
		// Say now customer decides to buy an additional imported CD
		builder.buildBasket(Item.TYPE_CD_IMPORTED, "CD - JAZZ IMPORTED", 1, 15.00);
		// lets print prices and taxes of this built basket with imported CD
		// added
		totalTax = builder.calculateTotalTax();
		builder.printExtendedTaxedPrice();
		System.out.println("Sales Taxes: " + totalTax);
		System.out.println("Grand Total:" + builder.calculateTotal());

		/**
		 * **************STRATEGY and DECORATOR Patterns**************
		 */
		System.out.println("-count item description starting with 'cd'or longer than 15 characters -");
		Iterator<Item> it = builder.getIterator();
		boolean bol = false;
		CheckStrategy strategy = null;
		System.out.println("---------------- description satarting with cd -----------------");
		it = builder.getIterator();
		// for starting with CD
		strategy = new StartsWithCD();
		strategy = new CountDecorator(strategy);
		while (it.hasNext()) {
			Item item = it.next();
			bol = strategy.check(item.getDescription());
			System.out.println(item.getDescription() + " --> " + bol);
		}
		System.out.println("No of descriptions starts with CD -->" + strategy.count());
		System.out.println("-------------- description longer than 15 characters ------------------");
		it = builder.getIterator();
		// longer than 15 charecters
		strategy = new LongerThan15();
		strategy = new CountDecorator(strategy);

		while (it.hasNext()) {
			Item item = it.next();
			bol = strategy.check(item.getDescription());
			System.out.println(item.getDescription() + " --> " + bol);
		}
		System.out.println("No of descriptions longer than 15 characters -->" + strategy.count());

		/**
		 * ****************STRATEGY and DECORATOR Patterns ****************
		 */
		System.out.println("-count item description starting with 'cd'or longer than 15 characters -");
		it = builder.getIterator();
		bol = false;
		strategy = null;
		System.out.println("---------------- description satarting with cd -----------------");
		it = builder.getIterator();
		// for starting with CD
		strategy = new com.kasalica.example.allInOne.adapter.StartsWithCD();
		strategy = new CountDecorator(strategy);
		while (it.hasNext()) {
			Item item = it.next();
			bol = strategy.check(item.getDescription());
			System.out.println(item.getDescription() + " --> " + bol);
		}
		System.out.println("No of descriptions starts with CD -->" + strategy.count());
		System.out.println("-------------- description longer than 15 characters ------------------");
		it = builder.getIterator();
		// longer than 15 charecters
		strategy = new com.kasalica.example.allInOne.adapter.LongerThan15();
		strategy = new CountDecorator(strategy);

		/**
		 * ************VISITOR Design Pattern************************
		 */
		// visitor pattern example, no messy instanceof and typecast constructs
		it = builder.getIterator();
		ItemVisitor visitor = new GoodsLabellingVisitor();

		while (it.hasNext()) {
			Item item = it.next();
			item.accept(visitor);
		}

		/**
		 * *******************ITERATOR Pattern******************
		 */
		// Iterator pattern example, inner implementations of
		// ShopingBasketBuilder is protected.
		com.kasalica.example.allInOne.Iterator.Iterator itemIterator = builder.getItemIterator();
		// say we want to traverse through every second item in the basket
		itemIterator.setStep(2);
		Item item = null;
		for (item = itemIterator.firstItem(); !itemIterator.isDone(); item = itemIterator.nextItem()) {
			System.out.println("nextItem:" + item.getDescription() + "==>" + item.getExtendedTaxPrice());
		}
		item = itemIterator.lastItem();
		System.out.println("lastItem: " + item.getDescription() + "==> " + item.getExtendedTaxPrice());
		item = itemIterator.previousItem();
		System.out.println("previousItem:" + item.getDescription() + "=>" + item.getExtendedTaxPrice());

		item = null;
		for (item = itemIterator.firstItem(); !itemIterator.isDone(); item = itemIterator.nextItem()) {
			item.prepareItemForRetail();
			System.out.println("-----------------------------------");

			/**
			 * ***********COMPOSITE Pattern****************************
			 */
			System.out.println("----------------- Employee hierachy & getSalaries() recursively ---------");
			// Employee hierachy
			Employee generalManager = new Manager("John Smith", 100000.00);
			Employee salesManger = new Manager("Peter Rodgers", 80000.00);
			Employee logisticsManger = new Manager("Graham anthony", 90000.00);
			Employee staffSales1 = new Staff("Lisa john", 40000.00);
			Employee staffSales2 = new Staff("Pamela watson", 50000.00);
			salesManger.addEmployee(staffSales1);
			salesManger.addEmployee(staffSales2);
			Employee logisticsTeamLead = new Manager("Cooma kumar", 70000.00);
			Employee staffLogistics1 = new Staff("Ben Sampson", 60000.00);
			Employee staffLogistics2 = new Staff("Vincent Chou", 20000.00);
			logisticsTeamLead.addEmployee(staffLogistics1);
			logisticsTeamLead.addEmployee(staffLogistics2);
			logisticsManger.addEmployee(logisticsTeamLead);
			generalManager.addEmployee(salesManger);
			generalManager.addEmployee(logisticsManger);
			System.out.println(staffSales1.getName() + "-->" + staffSales1.getSalaries());
			System.out.println(staffSales2.getName() + "-->" + staffSales2.getSalaries());
			System.out.println("Logistics dept " + " --> " + logisticsManger.getSalaries());
			System.out.println("General Manager " + " --> " + generalManager.getSalaries());

			/**
			 * ****************FACADE Pattern***********************
			 */
			System.out.println("--------------------shouldWePlaceOrder----------------------------");
			PurchaseEvaluation purchaseEval = new PurchaseEvaluation();
			boolean shouldWePlaceOrder = purchaseEval.shouldWePlaceOrder(item);
			System.out.println("shouldWePlaceOrder=" + shouldWePlaceOrder);

			/**
			 * **************OBSERVER Pattern************************
			 */
			System.out.println("--------------------notify stock update----------------------------");
			Department deptLogistics = new LogisticsDepartment(); // observer/subscriber
			Department salesLogistics = new SalesDepartment(); // observer/subscriber
			StockControl stockControl = new XYZStockControl();// observable/publisher
			// let's register subscribers with the publisher
			stockControl.addSubscribers(deptLogistics);
			stockControl.addSubscribers(salesLogistics);
			// let's update the stock value of the publisher
			for (item = itemIterator.firstItem(); !itemIterator.isDone(); item = itemIterator.nextItem()) {
				if (item instanceof CD) {
					stockControl.updateStock(item, 25);
				} else if (item instanceof Book) {
					stockControl.updateStock(item, 40);
				} else {
					stockControl.updateStock(item, 50);
				}
			}

			/**
			 * **************COMMAND Pattern************************************
			 */
			System.out.println("------------Calculator with redo & undo operations-----------------------");
			Staff stockControlStaff = new Staff("Vincent Chou", 35);
			stockControlStaff.compute('+', 10);// 10
			stockControlStaff.compute('-', 5);// 5
			stockControlStaff.compute('+', 10);// 15
			stockControlStaff.compute('-', 2);// 13
			// lets try our undo operations
			System.out.println("---------------undo operation : 1 level---------------------------");
			stockControlStaff.undo(1);
			System.out.println("---------------undo operation : 2 levels---------------------------");
			stockControlStaff.undo(2);
			// lets try our redo operations
			System.out.println("---------------redo operation : 2 levels---------------------------");
			stockControlStaff.redo(2);
			System.out.println("---------------redo operation : 1 level---------------------------");
			stockControlStaff.redo(1);

			/**
			 * *****************PROXY Pattern********************************
			 */
			System.out.println("---------------Accessing the price list---------------------------");
			PriceListUser user1 = new PriceListUser(1);// accessing same
														// itemId=1
			PriceListUser user2 = new PriceListUser(1);// accessing same
														// itemId=1
			Thread t1 = new Thread(user1);
			Thread t2 = new Thread(user2);
			Thread t3 = new Thread(user1);
			t1.setName("accessor");// user 1 reads the price
			t2.setName("mutator");// user 2 modifies the price
			t3.setName("accessor");// user 1 reads the price
			t1.start(); // accessor user-1 reads before mutator user-2 modifies
						// the price as 12.00
			t2.start(); // mutator user-2 sets the price to 15.00
			t3.start(); // while the user-2 is setting the price to 15.00 user-1
						// reads again and gets the
			// price as 12.00
			// user-2 gets the wrong price i.e gets 12.0 again instead of 15.00

		}

	}
}
