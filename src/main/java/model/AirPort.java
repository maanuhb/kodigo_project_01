package model;

import lombok.Data;

@Data
public class AirPort {
    private String country;
    private String city;
    private String airportName;

    public AirPort() {
    }

    public AirPort(String country, String city, String airportName) {
        this.country = country;
        this.city = city;
        this.airportName = airportName;
    }
}