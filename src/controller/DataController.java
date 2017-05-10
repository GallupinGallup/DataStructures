package controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import model.Customer;
import model.Logs;

public class DataController {
	private Queue<Customer> myCustomer;
	private Stack<Logs> logPile;
	public DataController()
	{
		myCustomer = new LinkedList<Customer>();
		logPile = new Stack<Logs>();
	}
	public void start() {
		testQueues();
		testStacks();
	}
	private void testStacks() {
		myCustomer.add(new Customer("Jeff", 5, true));
		myCustomer.add(new Customer("Fred", 9001, false));
		myCustomer.add(new Customer("Billy", 6, true));
		myCustomer.add(new Customer("Jo", 4, false));
		myCustomer.add(new Customer("Isaac", 2, true));
		myCustomer.remove(0);
	}
	private void testQueues() {
		logPile.add(new Logs(true, "blue", 543557578));
		logPile.add(new Logs(false, "blue", 453453));
		logPile.add(new Logs(true, "blue", 45234893));
		logPile.add(new Logs(false, "blue", 45235452));
		logPile.add(new Logs(true, "blue", 542852452));
		logPile.remove(0);
	}

}
