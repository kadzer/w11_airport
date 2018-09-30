public class Flight {
    private String number;
    private String destination;
    private Plane plane;

    public Flight(String number, String destination, Plane plane) {
        this.number = number;
        this.destination = destination;
        this.plane = plane;
    }

    public String getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public int getPlaneCapacity() {
        return this.plane.returnCapacity();
    }
}
