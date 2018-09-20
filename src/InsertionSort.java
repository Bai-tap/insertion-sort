import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        System.out.println("Enter " + size + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println("Your list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();

        System.out.println("List after sort:");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > temp; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
    }
}
