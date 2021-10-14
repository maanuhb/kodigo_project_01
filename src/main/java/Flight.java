import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class Flight implements IUpdateFlight, ICancelFlight, IEnterFlight{
    private int flightNumber;
    private String airline;
    private String Status;
    private Airport destination;
    private Airport origin;
    private Date departureDateTime;
    private DateAndTime arrivalDateTime;

    @Override
    public void updateFlight() {

    }

    @Override
    public String cancelFlight() {

    }
}
