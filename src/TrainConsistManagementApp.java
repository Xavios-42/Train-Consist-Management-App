public class TrainConsistManagementApp {
    public static void main(String[] args) {
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        rectangularBogie.assignCargo("Petroleum");
        cylindricalBogie.assignCargo("Petroleum");
        rectangularBogie.assignCargo("Coal");
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe assignment: Petroleum cannot be stored in Rectangular bogie.");
            }
            this.cargo = cargo;
            System.out.println("Cargo " + cargo + " assigned safely to " + shape + " bogie.");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Validation completed for cargo assignment.");
        }
    }
}

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}