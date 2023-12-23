package controller;

import java.util.Scanner;
import model.BillItem;
import model.Customer;
import model.DateFormatter;
import model.InvoiceGenerator;
import model.Product;

public class LaundryShop {

    public void processShoppingBill(Scanner scan, Customer customer, BillItem billItem) {
        char choice;
        do {
            System.out.println("Masukkan detail Cucian: ");
            System.out.print("Jenis Pakaian: ");
            String id = scan.nextLine();
            System.out.print("Bahan Pakaian: ");
            String productName = scan.nextLine();
            System.out.print("Jumlah (pcs): ");
            int quantity = scan.nextInt();
            System.out.print("Price (per unit): ");
            double price = scan.nextDouble();

            Product product = new Product(id, productName, quantity, price);
            billItem.addProduct(product);

            System.out.print("Apakah ingin menambah item lagi? (y or n): ");
            choice = scan.next().charAt(0);
            scan.nextLine(); // consume the newline character
        } while (choice == 'y' || choice == 'Y');
    }

    public void generateBill(Scanner scan) {
        double overAllPrice = 0.0;

        System.out.println("\t\t\t\t--------------------Selamat Mencuci-----------------");
        System.out.println("\t\t\t\t\t " + "    " + " Laundry Satuan Sukses Jaya");

        System.out.println(DateFormatter.getCurrentDate());
        System.out.print("Masukkan Nama pelanggan: ");
        Customer customer = new Customer(scan.nextLine());

        BillItem billItem = new BillItem();
        processShoppingBill(scan, customer, billItem);

        InvoiceGenerator.generateInvoice(billItem);

        System.out.println("\t\t\t\t----------------Terima kasih telah mencuci di Laundry kami!!-----------------");
        System.out.println("\t\t\t\t                           Silahkan berkunjung kembali");
    }
}