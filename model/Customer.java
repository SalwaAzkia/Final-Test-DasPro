package model;

public class Customer {

    private String name;
    private String email;
    private String alamat;

    public Customer(String nextLine) {
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Customer setAlamat(String alamat) {
        this.alamat = alamat;
        return this;
    }

    public String getAlamat() {
        return this.alamat;
    }

}