package model;

public class Customer {
    private String name;
    private String address;
    private String contact;
    private String email;
    private String vehicle;
    private Showroom showroom;
    private ArrayList<Part> partsToRepair;
    private int repairCost;

    public Customer(String name, String address, String contact, String email, String vehicle, Showroom showroom, ArrayList<Part> partsToRepair, int repairCost) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.vehicle = vehicle;
        this.showroom = showroom;
        this.partsToRepair = partsToRepair;
        this.repairCost = repairCost;
    }

    public Customer(String name, String address, String contact, String email, String vehicle, Showroom showroom, String part, int quantity, double partCost, String appointmentTime, double totalCost) {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getVehicle() {
        return vehicle;
    }

    public Showroom getShowroom() {
        return showroom;
    }

    public ArrayList<Part> getPartsToRepair() {
        return partsToRepair;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public void addPartToRepair(Part part) {
        partsToRepair.add(part);
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Contact: " + contact + "\n" +
                "Email: " + email + "\n" +
                "Vehicle of interest: " + vehicle + "\n" +
                "Showroom: " + showroom.getName() + "\n" +
                "Parts to repair: " + partsToRepair.toString() + "\n" +
                "Repair cost: " + repairCost;
    }
}
