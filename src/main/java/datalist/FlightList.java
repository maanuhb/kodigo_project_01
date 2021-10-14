package datalist;

import model.AirPort;
import model.Flight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public static List<Flight> getFlightList() {
        List<Flight> flightList = new ArrayList<>();
        Flight f1= new Flight();
        f1.setAirline("Avianca");
        f1.setStatus("On Time");
        f1.setFlightNumber(0);
        f1.setDestination(new AirPort("El Salvador", "San Salvador", "Aeropuerto Monseñor Romero"));
        f1.setOrigin(new AirPort("Honduras", "Tegucigalpa", "Aeropuerto Tegucigalpa"));
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        try {
            f1.setArrivalDateTime(hourdateFormat.parse("01:10 15/10/2021"));
            f1.setDepartureDateTime(hourdateFormat.parse("09:10 15/10/2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        flightList.add(f1);

        Flight f2= new Flight();
        f2.setAirline("American Airlines");
        f2.setStatus("On Time");
        f2.setFlightNumber(1);
        f2.setDestination(new AirPort("United States", "Miami", "Aeropuerto Miami"));
        f2.setOrigin(new AirPort("Costa Rica", "San José", "Aeropuerto San José"));
        DateFormat hourdateFormat2 = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        try {
            f2.setArrivalDateTime(hourdateFormat2.parse("11:10 15/10/2021"));
            f2.setDepartureDateTime(hourdateFormat2.parse("04:30 15/10/2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        flightList.add(f2);

        return flightList;
    }
}