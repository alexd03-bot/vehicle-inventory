package com.pluralsight;

public class Vehicle {

    private String makeModel;
    private long vehicleId;
    private String color;
    private int odometerReading;
    private double price;


//    makeModel - a string (ex: Ford Explorer)
//    vehicleId - a long (ex: 101121)
//    color - a string (ex: Red)
//    odometerReading - an int (ex: 32775)
//    price - a double (ex: 12250.00)

//region
    public Vehicle(String makeModel, long vehicleId, String color, int odometerReading, double price) {
        this.makeModel = makeModel;
        this.vehicleId = vehicleId;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
//endregion


    //region
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }



    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //endregion




}
