import java.util.regex.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String trainId1 = "TRN-1234";
        String trainId2 = "TRAIN12";
        String cargoCode1 = "PET-AB";
        String cargoCode2 = "PET-ab";

        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        validateInput("Train ID", trainId1, trainIdPattern);
        validateInput("Train ID", trainId2, trainIdPattern);
        validateInput("Cargo Code", cargoCode1, cargoCodePattern);
        validateInput("Cargo Code", cargoCode2, cargoCodePattern);
    }

    private static void validateInput(String label, String input, Pattern pattern) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(label + " \"" + input + "\" is VALID");
        } else {
            System.out.println(label + " \"" + input + "\" is INVALID");
        }
    }
}