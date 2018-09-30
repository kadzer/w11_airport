import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() {
        plane = new Plane(Ptype.BNISLANDER,"Aerlingus");
        ArrayList passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Boris Johnson");
        passenger2 = new Passenger("Theresa May");
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, plane.countPassengers());
    }

    @Test
    public void hasAirline() {
        assertEquals("Aerlingus", plane.getAirline());
    }

    @Test
    public void hasCapacity() {
        assertEquals(8, plane.returnCapacity());
    }

    @Test
    public void canAddPassengers() {
        plane.loadPassenger(passenger1);
        assertEquals(1, plane.countPassengers());
    }

    @Test
    public void canRemovePassenger() {
        plane.loadPassenger(passenger1);
        plane.loadPassenger(passenger2);
        plane.unloadPassenger(passenger1);
        assertEquals(1, plane.countPassengers());
    }

}
