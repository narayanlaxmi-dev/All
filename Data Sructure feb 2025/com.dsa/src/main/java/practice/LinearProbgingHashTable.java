package practice;

import java.util.Scanner;

public class LinearProbgingHashTable {
	int size = 10;
    Integer[] hashTable;

    public LinearProbgingHashTable() {
        hashTable = new Integer[size];
    }

    // Hash Function
    int hash(int key) {
        return key % size;
    }

    // Insert using linear probing
    void insert(int key) {
        int index = hash(key);
        int startIndex = index;
        do {
            if (hashTable[index] == null) {
                hashTable[index] = key;
                System.out.println("Inserted " + key + " at index " + index);
                return;
            }
            index = (index + 1) % size;
        } while (index != startIndex);
        System.out.println("Hash Table is full. Couldn't insert " + key);
    }

    // Print the hash table
    void printTable() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (hashTable[i] != null ? hashTable[i] : "null"));
        }
    }

    public static void main(String[] args) {
    	LinearProbgingHashTable table = new LinearProbgingHashTable();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Insert");
            System.out.println("2. Print Hash Table");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                case 1:
                    System.out.print("Enter value to insert (0-99): ");
                    int val = scanner.nextInt();
                    table.insert(val);
                    break;
                case 2:
                    table.printTable();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
