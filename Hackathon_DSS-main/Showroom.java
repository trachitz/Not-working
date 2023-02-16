package model;

import java.util.ArrayList;

public class Showroom {
    private String name;
    private String branch;
    private ArrayList<Part> parts;

    public Showroom(String name, String branch) {
        this.name = name;
        this.branch = branch;
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "Showroom [name=" + name + ", branch=" + branch + ", parts=" + parts + "]";
    }

    public void addRepairingDetails(String part, int quantity, double partCost, String appointmentTime) {
    }
}
