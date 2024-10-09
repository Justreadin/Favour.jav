public class Main {
    public static void main(String[] args) {
        WeekDay[] days = WeekDay.values();

        for (WeekDay day : days) {
            SpecificDay specificDay = new SpecificDay(day);
            specificDay.displayDay();
        }
    }
}
