package chapterfive;

public class Exercise {
    public static void main(String[] args) {
        int counter = 1;
         counter = ++ counter  +  ++counter;
        System.out.println(counter);

        counter = counter++ +
               ++counter;
        System.out.println(counter);

        counter = counter++ +
               counter++;
        System.out.println(counter);

       counter = ++counter +
             counter++;
       System.out.println(counter);
    }
}
