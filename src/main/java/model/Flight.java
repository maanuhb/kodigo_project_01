package model;

import datalist.FlightList;
import interfaces.ICancelFlight;
import interfaces.IEnterFlight;
import interfaces.IUpdateFlight;
import interfaces.IUpdateState;
import lombok.Builder;
import lombok.Data;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;


@Data
public class Flight implements IUpdateFlight, ICancelFlight, IEnterFlight, IUpdateState {
    private int flightNumber;
    private String airline;
    private String Status;
    private AirPort destination;
    private AirPort origin;
    private Date departureDateTime;
    private Date arrivalDateTime;


    @Override
    public void enterFlight(List<Flight> flightList, Flight flight) {
        flightList.add(flight);
    }

    @Override
    public void updateFlight(Flight flight, Date departureDateTime, Date arrivalDateTime) {
        if(flight.getStatus().equals("delayed")){
            flight.setDepartureDateTime(departureDateTime);
            flight.setArrivalDateTime(arrivalDateTime);
        }
    }

    @Override
    public String cancelFlight(Flight flight) {
        flight.setStatus("Canceled");
        return "Vuelo cancelado";
    }

    @Override
    public void updateState( String status) {
        this.setStatus(status);
    }
}
