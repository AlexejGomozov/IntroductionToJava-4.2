package Task1_5;

public enum Food {

	 BREAKFAST,
    NOT_INCLUDED,
    ALL_INCLUSIVE;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
