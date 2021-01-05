package com;

import com.Location.Location;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

//import java.util.logging.Logger;
//import java.util.logging.Logger;


public class Main {

    static final Logger logger = Logger.getLogger(Main.class);
    static final String LOG_PROPERTIES_FILE = "src/com/log4j.properties";

    public static void main(String[] args)
    {
        initializeLogger();
        Scanner sc = new Scanner(System.in);
        //Location location = null;

        logger.info("leaving the main method of Log4JDemo");

        boolean isExit = false;
        while(true) {
            Hamburger hamburger = new com.Hamburger();
            System.out.println("1. Add Location");
            //System.out.println("2. Update Location");
            System.out.println("2. Delete Location");
            System.out.println("3. Display Menu");
            System.out.println("4. Exit");
            System.out.println(" Please enter your choice of operation");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.println("Please enter the location id:");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Please enter the longitude");
                    Double longitude = Double.parseDouble(sc.nextLine());

                    System.out.println("Please enter the lattitude");
                    Double lattitude = Double.parseDouble(sc.nextLine());

                    System.out.println("Please enter your Street address");
                    String address = sc.nextLine();

                    System.out.println("Please enter your City");
                    String City = sc.nextLine();

                    System.out.println("Please enter your State");
                    String State = sc.nextLine();

                    System.out.println("Please enter your Zip");
                    Long zip = sc.nextLong();

                    // System.out.println("longitude" + longitude);
                    //System.out.println("lattitude" + lattitude);
                    //System.out.println("address" + address);
                    //System.out.println("City" + City);
                    //System.out.println("State" + State);
                    //System.out.println("zip" + zip);

                    Location location = new Location(id, longitude, lattitude, address, City, State, zip);


                    hamburger.addLocation(location);
                    break;

                //case 2 :
                //    hamburger.updateLocation(location);
                //     break;

                case 2:
                    System.out.println("Enter location id to delete:");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    hamburger.deleteLocation(deleteId);
                    break;

                case 3:
                    hamburger.displayMenu();
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
            if(isExit)
                break;
        }

    }

    public static void initializeLogger() {
        Properties logProperties = new Properties();

        try {
            // load log4j properties configuration file
            logProperties.load(new FileInputStream(LOG_PROPERTIES_FILE));
            PropertyConfigurator.configure(logProperties);
            logger.info("Logging initialized.");
        } catch (IOException e) {
            logger.error("Unable to load logging property :", e);
        }
    }
}
