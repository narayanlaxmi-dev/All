package entity;

import java.util.HashMap;

import exception.CustomerNotFoundException;
import exception.InsufficientStockException;
import exception.ProductNotFoundException;

public class Shop {

	private HashMap<String, Products> products = new HashMap();
	private HashMap<String, Customers> customer = new HashMap();
	private Transaction transManager = new Transaction();

	public Shop() {

	}

	public void addProduct(Products p) {
		products.put(p.getProductId(), p);
		System.out.println("Successfully added");

	}

	public void removeProduct(Products p) {
		products.remove(p);
		System.out.println("Successfully removed");
	}

	public void displayAllproduct() {
		for (Products pro : products.values()) {
			System.out.println(pro);
			System.out.println("dispalyed");
		}
	}

	public void addCustomer(Customers c) {
		customer.put(c.getCustomerId(), c);
		System.out.println("Successfully added");
	}

	public void removeCustomer(Customers c) {
		customer.remove(c);
		System.out.println("Successfully removed");
	}

	public void displayAllCustomer() {
		for (Customers c : customer.values()) {
			System.out.println(c);
			System.out.println("dispalyed");
		}
	}

	public void recordSale(String pId, int quantity, String cId) {
		if (customer.containsKey(cId)) {
			Customers foundid = customer.get(cId);
			if (customer.equals(foundid)) {

			} else {
				throw new CustomerNotFoundException("is not available customer");
			}
			throw new InsufficientStockException(" not available stock");
		}
	}

	public void recordReturn(String pId, int quantity, String cId) throws ProductNotFoundException {
		if (customer.containsKey(cId)) {
			Customers foundid = customer.get(cId);
			if (customer.equals(foundid)) {

			} else {
				throw new ProductNotFoundException("is not available");
			}
		}
	}

	public void displayTransaction() {

	}

}
