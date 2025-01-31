package project;

import java.util.ArrayList;
import java.util.List;


public class Building {
    private String streetName;
    private String houseNumber;
    private double basicMonthlyPaymentPerSqM;
    private List<Room> rooms = new ArrayList<Room>();

    public Building(String streetName, String houseNumber, double basicMonthlyPaymentPerSqM) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.basicMonthlyPaymentPerSqM = basicMonthlyPaymentPerSqM;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public double getBasicMonthlyPaymentPerSqM() {
        return basicMonthlyPaymentPerSqM;
    }

    public void setBasicMonthlyPaymentPerSqM(double basicMonthlyPaymentPerSqM) {
        this.basicMonthlyPaymentPerSqM = basicMonthlyPaymentPerSqM;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Room room : rooms) {
            totalArea += room.getArea();
        }
        return totalArea;
    }

}
