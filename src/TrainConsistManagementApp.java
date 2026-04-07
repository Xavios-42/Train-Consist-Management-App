import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieIDs = {"BG309","BG101","BG550","BG205","BG412"};

        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        binarySearch(bogieIDs, "BG309");
        binarySearch(bogieIDs, "BG999");
        binarySearch(bogieIDs, "BG101");
        binarySearch(bogieIDs, "BG550");
    }

    public static void binarySearch(String[] arr, String key) {
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