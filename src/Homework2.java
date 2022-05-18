public class Homework2 {
    public static void main(String[] args) {

        int g = 15;
        for (int j = 1; j <= g; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int k = 15;
        for (int i = k; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();

        }

        //Task 1
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2;
            System.out.print(array[i]);
        }
        System.out.println();

        //Task 2
        int[] numbers = new int[100];
        int x = 0;
        while (x <= numbers.length) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        //Task 3
        int[] odd = new int[20];
        for (int i = -19; i < odd.length; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 4
        int[] d = {10, 24, 5, 15, 12, 40, 56, 88, 90, 111, 120, 47};
        for (int i = 0; i < d.length; i++) {
            if (d[i] % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Task 5
        double[] e = new double[444];
        for (double i = 24.12; i < 467.23; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 7
        int n = 12;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 1; j++) {
                if (0 < n && n < 21) {
                    System.out.println(n + " * " + i + " = " + n * i);
                }
            }
        }


        //Reverse
        int[] anArray = {12, 324, 69, 128, 354, 1024};
        int[] reverse = new int[anArray.length];
        String one = "";
        for (int i = 0; i < anArray.length; i++) {
            int m = 0;
            one += anArray[i] + " ";
            while (anArray[i] != 0) {
                m = m * 10 + anArray[i] % 10;
                anArray[i] = anArray[i] / 10;
                reverse[i] = m;
            }
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
        System.out.println(one);
    }
}

