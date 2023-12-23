package model;

public class Product {
    private String jenis;
    private String bahan;
    private int jumlah;
    private double harga;
    private double totalharga;

    public Product(String jenis, String bahan, int jumlah, double harga) {
        this.jenis = jenis;
        this.bahan = bahan;
        this.jumlah = jumlah;
        this.harga = harga;
        this.totalharga = jumlah * harga;
    }

    public String getjenis() {
        return jenis;
    }

    public String getbahan() {
        return bahan;
    }

    public int getjumlah() {
        return jumlah;
    }

    public double getharga() {
        return harga;
    }

    public double getTotalharga() {
        return totalharga;
    }

    public void display() {
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", jenis,
                bahan, jumlah, harga, totalharga);
    }

    public static void displayFormat() {
    }
}