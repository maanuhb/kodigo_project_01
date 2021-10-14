package menus;

import helpers.Find;
import helpers.Menu;
import helpers.RequestInfo;
import model.Flight;

import java.util.List;
import java.util.Scanner;

public class MenuFlight {
    private static Scanner sc = new Scanner(System.in);

    public static void viewFlightLoop(int option, List<Flight> flightList){

        switch(option){
            case 1:
                Menu.printObjectList(flightList);
                break;
            case 2:
                Flight flight = RequestInfo.requestFlight(flightList);
                flight.enterFlight(flightList, flight);
                break;
            case 3: RequestInfo.requestChangeState(flightList);
                break;
            case 4: RequestInfo.requestCancelFlight(flightList);
                break;
            case 5:
                break;
        }
    }
}