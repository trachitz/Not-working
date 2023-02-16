package model;

import java.util.ArrayList;
import java.util.Scanner;
import model.Customer;
import model.Showroom;
import model.Part;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Showroom> showrooms = new ArrayList<Showroom>();

        while (true) {
            System.out.println("Enter 'search' to search for existing customers or 'add' to add a new customer:");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("search")) {
                System.out.println("Enter the name of the customer you want to search for:");
                String searchName = sc.nextLine();

                boolean customerFound = false;

                for (Customer c : customers) {
                    if (c.getName().equalsIgnoreCase(searchName)) {
                        // Customer found, print details
                        customerFound = true;
                        System.out.println("\n-----------------------------------------");
                        System.out.println("             Customer Bill");
                        System.out.println("-----------------------------------------");
                        System.out.printf("%-20s: %s\n", "Name", c.getName());
                        System.out.printf("%-20s: %s\n", "Address", c.getAddress());
                        System.out.printf("%-20s: %s\n", "Contact number", c.getContact());
                        System.out.printf("%-20s: %s\n", "Email", c.getEmail());
                        System.out.printf("%-20s: %s\n", "Vehicle interested in", c.getVehicle());
                        Showroom showroom = c.getShowroom();
                        if (showroom != null) {
                            System.out.printf("%-20s: %s\n", "Showroom name", showroom.getName());
                            Part part = c.getPart();
                            if (part != null) {
                                System.out.printf("%-20s: %s\n", "Part name", part.getName());
                                System.out.printf("%-20s: %d\n", "Number of parts to repair", c.getQuantity());
                                System.out.printf("%-20s: %.2f\n", "Part cost", part.getCost());
                                double repairCost = c.getQuantity() * part.getCost() + c.getRepairCost();
                                System.out.printf("%-20s: %.2f\n", "Repair cost", repairCost);
                            }
                        }
                        System.out.println("-----------------------------------------");
                        break;
                    }
                }

                if (!customerFound) {
                    System.out.println("Customer not found.");
                }
            } else if (input.equalsIgnoreCase("add")) {
                System.out.println("Enter customer details:");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("Contact number: ");
                String contact = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Vehicle interested in: ");
                String vehicle = sc.nextLine();
                System.out.print("Showroom name: ");
                String showroomName = sc.nextLine();
                System.out.print("Branch name: ");
                String branchName = sc.nextLine();

                Showroom showroom = null;
                for (Showroom s : showrooms) {
                    if (s.getName().equalsIgnoreCase(showroomName) && s.getBranchName().equalsIgnoreCase(branchName)) {
                        showroom = s;
                        break;
                    }
                }

                if (showroom == null) {
                    System.out.println("Showroom not found.");
                } else {
                    System.out.print("Part to repair: ");
                    String part = sc.nextLine();
                    System.out.print("Number of parts to repair: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // consume the newline character

                    System.out.print("Cost to repair part: ");
                    double partCost = sc.nextDouble();
                    sc.nextLine(); // consume the newline character

                    System.out.print("Appointment time: ");
                    String appointmentTime = sc.nextLine();

                    double totalCost = quantity * partCost;
                    showroom.addRepairingDetails(part, quantity, partCost, appointmentTime);

                    customers.add(new Customer(name, address, contact, email, vehicle, showroom, part, quantity, partCost, appointmentTime, totalCost));
                    System.out.println("Customer added.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        }}}