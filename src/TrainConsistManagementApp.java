import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieIDs = {};

        try {
            binarySearch(bogieIDs, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] validBogieIDs = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(validBogieIDs);

        try {
            binarySearch(validBogieIDs, "BG205");
            binarySearch(validBogieIDs, "BG999");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void binarySearch(String[] arr, String key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                System.out.println("Bogie ID " + key + " found at position " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Bogie ID " + key + " not found in the list.");
        }
    }
}