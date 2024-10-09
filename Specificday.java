public class SpecificDay extends Day {
    public SpecificDay(WeekDay day) {
        super(day);
    }

    @Override
    public void displayDay() {
        System.out.println("Today is " + getDay());
    }
}
