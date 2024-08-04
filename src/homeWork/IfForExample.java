package homeWork;

public class IfForExample {
    public static void main(String[] args) {
        ////1
        for (int i = 0; i < 11; i++) {
            System.out.print(i +" ");
        }

        System.out.println();

        ////2
        int x = 0;
        for (int i = 0; i < 101; i++) {
            x = x + i;
        }
        System.out.print(x);

        System.out.println();

        ////3
        for (int i = 50; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        ////4
        for (int i = 1; i < 21; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        ////5
        int count = 0;
        for (int i = 2; i < 100; i+=2) {
            count += 1;
        }
        System.out.print(count);
    }

}
