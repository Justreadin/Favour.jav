// Define the interface with two methods
interface TimeCalculator {
    int calculateHoursInDay();
    void displayHours();
}

// Implement the interface in a class
class DayHoursCalculator implements TimeCalculator {
    // Implement the calculateHoursInDay method
    @Override
    public int calculateHoursInDay() {
        return 24; // There are always 24 hours in a day
    }

    // Implement the displayHours method
    @Override
    public void displayHours() {
        int hours = calculateHoursInDay();
        System.out.println("There are " + hours + " hours in a day.");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an instance of DayHoursCalculator
        DayHoursCalculator calculator = new DayHoursCalculator();
        
        // Display the hours in a day
        calculator.displayHours();
    }
}
