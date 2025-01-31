package project;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Building> buildings = new ArrayList<Building>();

    public City(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public Building findBuilding(String streetName, String houseNumber) {
        streetName = streetName.toLowerCase();
        for (Building building : buildings) {
            if ( building.getStreetName().toLowerCase().equals(streetName) && building.getHouseNumber().equals(houseNumber)) {
                return building;
            }
        }
        return null;
    }
}
