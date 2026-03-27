import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String type;
    private String name;
    private int capacity;

    public Bogie(String type, String name, int capacity) {
        this.type = type;
        this.name = name;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Passenger", "Sleeper", 72));
        bogies.add(new Bogie("Passenger", "AC Chair", 56));
        bogies.add(new Bogie("Passenger", "First Class", 24));
        bogies.add(new Bogie("Goods", "Rectangular", 100));
        bogies.add(new Bogie("Goods", "Cylindrical", 80));
        bogies.add(new Bogie("Passenger", "Sleeper", 70)); // duplicate type example

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}