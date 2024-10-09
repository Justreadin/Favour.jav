public abstract class Day {
    private WeekDay day;

    public Day(WeekDay day) {
        this.day = day;
    }

    public WeekDay getDay() {
        return day;
    }

    public abstract void displayDay();
}
