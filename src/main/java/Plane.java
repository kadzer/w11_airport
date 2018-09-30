import java.util.ArrayList;

public class Plane {
    private Ptype ptype;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(Ptype ptype, String airline) {
        this.ptype = ptype;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public String getAirline() {
        return airline;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public int returnCapacity() {
        return this.ptype.getCapacity();
    }

    public void loadPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void unloadPassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
