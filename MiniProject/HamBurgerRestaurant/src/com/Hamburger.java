package com;

import com.Contact.Contact;
import com.Location.Location;
import com.Menu.Categories.*;
import com.Menu.MenuI;
import com.Reservations.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hamburger {


    private List<MenuI> menuList ;
    private List<Reservation> reservationList;
    private List<Location> locationList;
    private Contact contact ;

    public Hamburger()
    {
       this.menuList = new ArrayList<>();
       this.reservationList = new ArrayList<>();
       this.locationList = new ArrayList<>();
       initializeMenu();

    }

    //Getters and Setters

    public List<MenuI> getMenuList()
    {
        return menuList;
    }
    public void setMenuList(List<MenuI> menuList)
    {
        this.menuList = menuList;
    }

    public List<Reservation> getReservationList()
    {
        return reservationList;
    }
    public void setReservationList(List<Reservation> reservationList)
    {
        this.reservationList = reservationList;
    }

    public Contact getContact()
    {
        return contact;
    }
    public void setContact(Contact contact)
    {
        this.contact = contact;
    }


    public void addLocation(Location location)
    {
        this.locationList.add(location);

    }

    public void updateLocation(Location updateObj)
    {
        Optional<Location> obj = locationList.stream().filter(l -> l.getId() == updateObj.getId()).findFirst();
        if(obj.isEmpty())
        {
            System.out.println("Location does not exist . Please add the desired location");
        }
        else
        {

            Location l = obj.get();
            l.setAddress(updateObj.getAddress());
            l.setCity(updateObj.getCity());
            l.setZip(updateObj.getZip());
            l.setLattitude(updateObj.getLattitude());
            l.setLongitude(updateObj.getLongitude());
        }
    }

    public void deleteLocation(int id)
    {
        Optional<Location> obj = locationList.stream().filter(l -> l.getId() == id).findFirst();
        if(obj.isEmpty())
        {
            System.out.println("Location not present");
        }
        else
        {
           Location deleteLocation = obj.get();
           locationList.remove(deleteLocation);
        }
    }

    public void initializeMenu()
    {
            MenuI appetizer = new Appetizers();
            appetizer.setName();
            menuList.add(appetizer);

            MenuI beverage = new Beverages();
            beverage.setName();
             menuList.add(beverage);

            MenuI burgers = new Burgers();
             burgers.setName();
            menuList.add(burgers);

            MenuI burritos = new Burritos();
            burritos.setName();
            menuList.add(burritos);

            MenuI desserts = new Desserts();
            desserts.setName();
            menuList.add(desserts);

            MenuI hotdogs = new Hotdogs();
            hotdogs.setName();
            menuList.add(hotdogs);

            MenuI salads = new Salads();
            salads.setName();
            menuList.add(salads);

            MenuI sandwiches = new Sandwiches();
            sandwiches.setName();
            menuList.add(sandwiches);



    }

    public void displayMenu()
    {
        System.out.println("The menu goes as follows : ");
        for (MenuI obj : menuList) {
            System.out.println(obj.getName());
        }
    }


}
