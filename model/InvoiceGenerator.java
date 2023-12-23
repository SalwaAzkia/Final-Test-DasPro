package model;

public class InvoiceGenerator {
    public static void generateInvoice(BillItem billItem) {
        Product.displayFormat();
        double overAllPrice = 0.0;

        for (Product p : billItem.getProducts()) {
            p.display();
            overAllPrice += p.getTotalharga();
        }

        double discount = overAllPrice * 0.02;
        double subtotal = overAllPrice - discount;
        double sgst = overAllPrice * 0.06; // Changed SGST rate to 6%
        double cgst = overAllPrice * 0.06; // Changed CGST rate to 6%
        double totalAmount = subtotal + cgst + sgst;

        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " + discount);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + totalAmount);
    }
}