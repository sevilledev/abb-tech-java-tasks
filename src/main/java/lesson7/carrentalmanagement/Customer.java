package lesson7.carrentalmanagement;

public class Customer {
    private int id;
    private String name;
    private String licenseNumber;

    public Customer(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || this.getClass() != that.getClass()) return false;
        Customer c = (Customer) that;
        return this.id == c.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
