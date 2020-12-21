package Lab5;

public class Lab52 {

    public static void getArray(int n) {
        int[] arr = new int[n];
        int j = 0;
        int i = n / 2;
        do {
            j++;
            arr[i] = j;
            if (arr[n - 1] != 0 && arr[0] == 0)
                i = -1;
            i++;
        } while (j != n);
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 9;
        getArray(n);
    }

}
