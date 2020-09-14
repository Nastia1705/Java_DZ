package com.company;

public class Main {

    private static int[][] randomarray(int[][] array){
        for(int i = 0; i<4; i++){
            for(int j = 0;j<4;j++){
                array[i][j] = (int) (Math.random()*10);
            }
        }
        return array;

    }

    private static void printarray(int[][] arr){
        for( int i = 0; i < 4 ; i++ ){
            for( int j = 0; j < 4 ; j++ ) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
    private static void printparni(int[] arr){
        for( int i = 0; i < 4 ; i++ ){
            if(arr[i]!=0) {
                System.out.print(arr[i] + "\t");
            }
        }

    }
    private static void printodnovumir(int[] arr,int b){
        for( int i = 0; i < b ; i++ ){
            System.out.print(arr[i] + "\t");
        }


    }
    private static int[] ParniChuslaDiagonal(int[][] arr){
        int[] PobDiagonal = new int[4];
        int a = 0;
        int[] ParPobDiagonal = new int[4];
        for(int i = 0, j =3 ; i < 4 && j > -1; i++,j--){
            PobDiagonal[i] = arr[i][j];
        }
        for(int i = 0 ; i < 4; i++){
            if(PobDiagonal[i] % 2 == 0 && PobDiagonal[i] != 0){
                ParPobDiagonal[a] = PobDiagonal[i];
                a++;
            }
        }
        return ParPobDiagonal;

    }

    private static int[] fillarr(int[] arr,int begin,int end,int step){

        for(int i = 0; begin <= end; i++,begin+=step){
            arr[i]= begin;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        array = randomarray(array);

        printarray(array);

        int[] parni = new int[3];

        System.out.print("Parni diagonal : " + "\n");

        parni = ParniChuslaDiagonal(array);

        printparni(parni);
        int b=5;
        int begin = 0,end = 8,step = 2;
        int[] arr = new int[b];

        arr = fillarr(arr,begin,end,step);
        System.out.print("\n" + "Fill arr : " + "\n");

        printodnovumir(arr,b);

    }
}
