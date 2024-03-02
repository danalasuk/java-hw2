import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] res = new int[5][3];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = random.nextInt(61) + 20;
            }
        }


        System.out.println("Случайный двумерный массив:");
        printArray(res);

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (res[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
