public enum Ptype {
    BOEING737(189),
    BNISLANDER(8);

    private final int capacity;

    Ptype(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
