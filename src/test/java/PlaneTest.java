import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(Ptype.BNISLANDER,"Aerlingus");
        ArrayList passengers = new ArrayList<Passenger>();
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
}
