public class TrainConsistManagementApp {
    public static void main(String[] args) {
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        display(capacities);

        bubbleSort(capacities);

        System.out.println("Sorted Capacities:");
        display(capacities);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}