package entity;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

	public static List<TransactionRecord> tansaction;

	static {
		tansaction = new ArrayList<TransactionRecord>();
	}

	public Transaction() {

		tansaction = new ArrayList<TransactionRecord>();
	}

	public static void recordSale(String p, String q, String sId) {
		TransactionRecord recordSales = new TransactionRecord(p, q, sId);
		tansaction.add(recordSales);
	}

	public static void recordreturned(String c, String p, String type) {
		TransactionRecord recordreturn = new TransactionRecord(c, p, type);
		tansaction.add(recordreturn);
	}

	public static void displayTransaction() {
		tansaction.stream().forEach(rec -> System.out.println(rec + "\n---------"));
	}

}
