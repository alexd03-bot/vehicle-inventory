package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Vehicle[] cars = new Vehicle[20];
        int count = 6;

        cars[0] = new Vehicle("Ford Explorer",101121L,"Red",45000,13500);
        cars[1] = new Vehicle("Toyota Camry",101122L,"Blue",60000,11000);
        cars[2] = new Vehicle("Chevrolet Malibu",101123L,"Black",50000,9700);
        cars[3] = new Vehicle("Honda Civic",101124L,"White",70000,7500);
        cars[4] = new Vehicle("Subaru Outback",101125L,"Green",55000,14500);
        cars[5] = new Vehicle("Jeep Wrangler",101126L,"Yellow",30000,16000);



        System.out.println("What do you want to do?\n" +
                "1 - List all vehicles\n" +
                "2 - Search by make/model\n" +
                "3 - Search by price range\n" +
                "4 - Search by color\n" +
                "5 - Add a vehicle\n" +
                "6 - Quit\n" +
                "Enter your command:\n"
        );

        String command = scanner.nextLine();


        switch(command) {
            case "1" -> {
                allVehicles(cars, count);
                break;
            }

            case "2" -> {

                System.out.println("Enter make/model to search for:");
                String searchTerm = scanner.nextLine();
                break;
            }



            case "5" -> {

                System.out.println("Enter model: ");


            }



        }



    }


    public static void allVehicles(Vehicle[] cars, int count) {

        for (int i = 0; i < count; i++) {
            Vehicle thisCar = cars[i];

            System.out.println("Make/Model: " + thisCar.getMakeModel() + "\nVehicle ID: " + thisCar.getVehicleId() +
                    "\nColor: " + thisCar.getColor() + "\nOdometer: " + thisCar.getOdometerReading() +
                    "\nPrice: $" + thisCar.getPrice());

        }
    }


    public static void searchByMake(Vehicle[] cars, int count, String searchTerm) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            Vehicle currentCar = cars[i];


            if (currentCar.getMakeModel().equalsIgnoreCase(searchTerm)) {
                System.out.println("Found: " + currentCar.getMakeModel());
                System.out.println("ID: " + currentCar.getVehicleId());
                System.out.println("Price: $" + currentCar.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Invalid");
        }
    }













}


