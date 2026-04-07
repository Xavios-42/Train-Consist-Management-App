public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieIDs = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey1 = "BG309";
        String searchKey2 = "BG999";

        linearSearch(bogieIDs, searchKey1);
        linearSearch(bogieIDs, searchKey2);
    }

    public static void linearSearch(String[] arr, String key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                System.out.println("Bogie ID " + key + " found at position " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bogie ID " + key + " not found in the list.");
        }
    }
}