package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Flight {
    private @Getter @Setter Airport destination;
    private @Getter @Setter Airport origin;
    private @Getter @Setter Date departureDateTime;
    private @Getter @Setter Date arrivalDateTime;
    private @Getter @Setter String airline;
    private @Getter @Setter Enum Status;

    public Flight() {
    }

    public Flight(Airport destination, Airport origin, Date departureDateTime, Date arrivalDateTime, String airline, Enum status) {
        this.destination = destination;
        this.origin = origin;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.airline = airline;
        Status = status;
    }
}
