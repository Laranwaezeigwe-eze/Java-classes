package chapterfive;

public class TrianglePrinting {

    public static void main(String[] args) {

        int stars = 1;
        for (int i = 0; i < 10; i++) {
            //condition needs to break, hence the j--;
            for (int j = stars; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }

        //triangle 2:
        for (int i = 1; i <= 10; i++) {
            for (int j = stars; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }

        //triangle 3:
        stars = 10;
        int space = 0;
        for (int i = 0; i < 10; i++) {
            for (int f = space; f > 0; f--) {
                System.out.print(" ");
            }
            space++;
            for (int s = stars; s > 0; s--) {
                System.out.print("*");
            }
            stars--;
            System.out.println();

//        triangle 4:
            stars = 10;
            space = 0;
            for ( i = 0; i < 10; i++) {
                for (int f = space; f <= 10; f++) {
                    System.out.print(" ");
                }
                space++;
                for (int s = stars; s <= 10; s++) {
                    System.out.print("*");
                }
                stars--;
                System.out.println();


            }
        }
    }
}