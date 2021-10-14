package helpers;

import model.Flight;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Menu {
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final static String ANSI_BLUE = "\u001B[34m";

    final static String LINE = "**************************************************";
    final static String TAB = "%60s[%1s].%-80s\n";
    final static String TAB_HEADER = "%66s%-80s\n";

    public static void printMainMenu(){

        //
        System.out.println(ANSI_BLUE );
        String spaces = " %100s\n";
        System.out.printf(spaces, LINE);
        System.out.printf(TAB_HEADER, " ", "****Menu Principal****");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "1", "Administrar Vuelos");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "2", "Ver Catalogo de Aviones permitidos");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "3", "Generar reportes");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "4", "Enviar Reporte por correo");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "5", "Salir");
        System.out.printf(spaces, LINE);
    }

    public static void printFlightMenu(){
        System.out.println(ANSI_BLUE );
        String spaces = " %100s\n";
        System.out.printf(spaces, LINE);
        System.out.printf(TAB_HEADER, " ", "****Menu Vuelos****");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "1", "Ver Lista de Vuelos");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "2", "Agregar Vuelo");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "3", "Actualizar estado de vuelos");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "4", "Cancelar Vuelos");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "0", "Regresar al menu anterior");
        System.out.printf(spaces, LINE);
    }

    static String mainTab = "|%77s%-92s|\n";

    static String headerTab = "|%-6s|%-15s|%-18s|%-32s|%-16s|%-32s|%-16s|%-10s|\n";
    static String separatorLine =
            "+------+---------------+------------------+--------------------------------+----------------+--------------------------------+----------------+----------+";

    public static void printObjectList(List<Flight> flightList){
        System.out.printf(separatorLine + "\n");
        System.out.printf( headerTab, " Code", "     Airline", "   Aircraft", " Country/City Origin", "    Hour/Date",
                " Country/City Destination", "   Hour/Date", " Status");
        System.out.println(separatorLine);
        for(Flight f : flightList){
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            System.out.printf(headerTab, f.getFlightNumber(), "NO APLICA NAVE", f.getAirline(), f.getOrigin().getCountry(),
                    hourdateFormat.format(f.getDepartureDateTime()), f.getDestination().getCountry(),
                    hourdateFormat.format(f.getArrivalDateTime()), f.getStatus());
        }
        System.out.printf(separatorLine + "\n");
    }

}