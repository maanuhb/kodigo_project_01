import datalist.FlightList;
import helpers.Find;
import model.Flight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Flight> flightList = FlightList.getFlightList();
        for(Flight f :  flightList){
            System.out.println(f.getFlightNumber());
            System.out.println(f.getAirline());
            System.out.println(f.getDestination());
            System.out.println(f.getOrigin());
            System.out.println(f.getArrivalDateTime());
            System.out.println("----------------");
        }
        System.out.println("Ingrese que vuelo desea seleccionar");
        Scanner sc = new Scanner(System.in);
        Flight founded = Find.findFlight(sc.nextInt(), flightList);
        System.out.println("Vuelo encontrado: " + founded.toString());
        System.out.println("CANCELANDO VUELO...");
        founded.cancelFlight(founded);
        System.out.println("Vuelo cancelado: " + founded.toString());

        System.out.println("Cambiando estado");

        System.out.println("Ingrese que vuelo desea cambiar estado a retrasado");
        founded = Find.findFlight(sc.nextInt(), flightList);
        founded.updateState("delayed");
        DateFormat hourdateFormat2 = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        try {
            founded.updateFlight(founded, hourdateFormat2.parse("04:30 15/10/2021"), hourdateFormat2.parse("05:55 15/10/2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("VUELO ACTUALIZADO HORA");
        System.out.println(founded.toString());
    }
}
