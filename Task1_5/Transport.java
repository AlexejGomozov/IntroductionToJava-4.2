package Task1_5;

public enum Transport {

	 TRAIN,
    PLANE,
    BUS,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
