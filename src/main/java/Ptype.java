public enum Ptype {
    SAAB2000(50),
    DORNIER328(32),
    BNISLANDER(8);

    private final int capacity;

    Ptype(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
