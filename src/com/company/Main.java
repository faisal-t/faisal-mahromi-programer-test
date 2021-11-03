package com.company;

public class Main {




    public static void main(String[] args) {
        // Soal No 1
        int x[] = {12,444,54643,3155,667543,8637,0,369,7516,335};
        int y = 4;
        int temp = 0;
        String result = "";

        for (int i = 0; i < x.length; i++) {
            if (x[i] < 10){
                result = "*****" + String.valueOf(0);;
            }
            else if(x[i] < 100){
                result = "****" + String.valueOf(x[i]);
            }
            else if(x[i] < 1000){
                result = "***" + String.valueOf(x[i]);
            }
            else if(x[i] < 10000){
                result = "**" + String.valueOf(x[i]);
            }
            else if(x[i] < 100000){
                result = "*" + String.valueOf(x[i]);
            }
            else if(x[i] < 1000000){
                result = String.valueOf(x[i]);
            }

            temp += 1;

            // perulangan untuk +========+
            //            for (int j = 0; j<y; j++){
            //                System.out.print("+=======+");
            //
            //            }


            if (temp > y){
                System.out.println("");
                temp = 1;
            }

            System.out.print("| " + result + " |");

        }


        //Soal No 2
        System.out.println();
        System.out.println();
        int arr[] = {3,-1,-5,-5,2,4,7,5,1,1,1,4};
        Solution(arr);

    }

    public static void Solution(int[] arr) {
        Integer prev = null;
        Integer curr = null;
        int total = 0;

        for (int n : arr) {
            if (curr == null) {
                curr = n;
            } else {
                if (n != curr) {
                    if (prev != null) {
                        if ((prev < curr && n < curr) || (prev > curr && n > curr)) {
                            total += 1;
                        }
                    } else {

                        total += 1;
                    }
                    prev = curr;
                    curr = n;
                }
            }
        }

        if (prev != curr) {
            total += 1;
        }

        System.out.println(total);

    }

    
}



