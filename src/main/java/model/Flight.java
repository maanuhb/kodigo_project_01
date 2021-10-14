package model;

import interfaces.ICancelFlight;
import interfaces.IEnterFlight;
import interfaces.IUpdateFlight;
import lombok.Builder;
import lombok.Data;

import java.text.DateFormat;

@Builder
@Data
public class Flight implements IUpdateFlight, ICancelFlight, IEnterFlight {
    private int flightNumber;
    private String airline;
    private String Status;
    private AirPort destination;
    private AirPort origin;
    private DateFormat departureDateTime;
    private DateFormat arrivalDateTime;


    @Override
    public String cancelFlight() {
        return null;
    }

    @Override
    public void enterFlight(Flight flight) {

    }

    @Override
    public void updateFlight() {

    }
}
