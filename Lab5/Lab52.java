package Lab5;

public class Lab52 {

    public static void getArray(int n) {
        int[] arr = new int[n];
        int i = n / 2, j = 0, c = 0, b = 0;
        while (j == 0) {

            if (b == 0) {
                arr[i] = c;
                c++;
                i++;
            }


            if (i == n) {
                i = 0;
                b++;
                c--;

            }

            if (b == 1) {

                arr[i] = c;
                i++;
                c--;
                if (i == n / 2) {
                    j++;
                }

            }

        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {
        int n = 9;
        getArray(n);

    }

}
