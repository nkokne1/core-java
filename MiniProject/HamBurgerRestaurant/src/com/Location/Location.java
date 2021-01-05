package com.Location;

public class Location {

    private int id;
    private double longitude;
    private double lattitude;
    private String address;
    private String state;
    private String city;
    private long zip;

    //Constructors

    public Location(int id,double longitude, double lattitude, String address, String state, String city, long zip )
    {
        this.id = id;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    public Location(int id,double longitude, double lattitude )
    {
        this.id = id;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

    public Location(int id, String address, String state, String city, long zip )
    {
        this.id = id;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    // Getters and Setters

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
     this.id = id;
    }

    public double getLongitude()
    {
        return longitude;
    }
    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public double getLattitude()
    {
        return lattitude;
    }
    public void setLattitude(double lattitude)
    {
        this.lattitude = lattitude;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    public long getZip()
    {
        return zip;
    }
    public void setZip(long zip)
    {
        this.zip = zip;
    }
}
