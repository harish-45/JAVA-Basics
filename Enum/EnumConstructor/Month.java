package Enum.EnumConstructor;

public enum Month {

    JANAUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
    OCTOBER(31), NOVEMBER(30), DECEMBER(31);
    
    public final int days;

    // only private constructor allowed So No one can easily Modified Enum Constant
    private Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return this.days;
    }
}
