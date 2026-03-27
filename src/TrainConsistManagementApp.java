import java.util.*;

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return shape + " Bogie carrying " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid case

        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !(b.getShape().equals("Cylindrical") && !b.getCargo().equals("Petroleum")));

        System.out.println("Goods Bogies Safety Compliance Check:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(" - " + b);
        }
        System.out.println("Train Safety Status: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}