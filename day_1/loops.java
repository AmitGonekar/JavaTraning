package day_1;

public class loops {
    public static void main(String[] args) {

        // For loop
        for(int i=1; i <=100;i++){
            System.out.println(i);
        }

        System.out.println("-----------------While--------------------------");
        //While loop
        int i = 1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------DoWhile--------------------------");
        //DoWhile
        int j =1;
        do {
            System.out.println(j);
            j++;
        }while (j <=100);

    }
}
