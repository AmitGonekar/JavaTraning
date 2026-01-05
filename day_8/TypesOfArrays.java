package day_8;

class TypesOfArrays {

    public static void main(String[] args) {
         //  ONE-DIMENSIONAL ARRAY

        // Declaration and initialization
        int[] oneD = {10, 20, 30, 40};

        for (int i : oneD){
            System.out.println(i);
        }

        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.println("Index " + i + " -> " + oneD[i]);
        }
        System.out.println("------------------------------------");
           // TWO-DIMENSIONAL ARRAY
          // (Matrix - rows & columns)

        // 2D array initialization
        int[][] twoD = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < twoD.length; i++) {          // rows
            for (int j = 0; j < twoD[i].length; j++) {   // columns
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


           // JAGGED ARRAY
           //(Each row has different size)

        // Declaration of jagged array
        int[][] jagged = new int[3][];

        // Initializing each row with different length
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6};

        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}