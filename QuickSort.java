// QuickSort algorithm examplegit status
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {

        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(arr, left, j);
        }

        if (i < right) {
            quickSort(arr, i, right);
        }
    }

    public static void main(String[] args) {

        int[] data = {5, 3, 8, 1, 9, 2, 7};

        System.out.println("Before sorting:");

        for (int n : data) {
            System.out.print(n + " ");
        }

        quickSort(data, 0, data.length - 1);

        System.out.println("\nAfter sorting:");

        for (int n : data) {
            System.out.print(n + " ");
        }
    }
}