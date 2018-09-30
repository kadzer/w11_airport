import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Plane plane1;

    @Before
    public void setUp() {
        plane = new Plane(Ptype.DORNIER328,"Loganair");
        plane1 = new Plane(Ptype.SAAB2000, "Loganair");
        flight = new Flight("LM474","Kirkwall",plane);
    }

    @Test
    public void canShowNumber() {
        assertEquals("LM474", flight.getNumber());
    }

    @Test
    public void canShowPlaneCapacity() {
        assertEquals(32, this.plane.returnCapacity());
    }
}
