package chapterfive;

public class ChristmasDoWhile {
    public static void main(String[] args) {
        int counter = 1;


        do{
            System.out.print("On the ");

            switch (counter) {
                case 1 -> {
                    System.out.print("1st ");
                    break;
                }
                case 2 -> {
                    System.out.print("2nd ");
                    break;
                }
                case 3 -> {
                    System.out.print("3rd ");
                    break;
                }
                case 4 -> {
                    System.out.print("4th ");
                    break;
                }
                case 5 -> {
                    System.out.println("5th ");
                    break;
                }
                case 6 -> {
                    System.out.print("6th ");
                    break;
                }
                case 7 -> {
                    System.out.print("7th ");
                    break;
                }
                case 8 -> {
                    System.out.print("8th ");
                    break;
                }
                case 9 -> {
                    System.out.print("9th ");
                    break;
                }
                case 10 -> {
                    System.out.print("10th ");
                    break;
                }
                case 11 -> {
                    System.out.print("11th ");
                    break;
                }
                case 12 -> {
                    System.out.print("12th ");
                    break;
                }
            }

            System.out.println("day of Christmas my true love gave to me");
            switch (counter) {
                case 12:
                    System.out.println("twelve drummers drumming");
                case 11:
                    System.out.println("eleven pipers piping");
                case 10:
                    System.out.println("ten lords a leaping");
                case 9:
                    System.out.println("nine ladies dancing");
                case 8:
                    System.out.println("eight maids a milking");
                case 7:
                    System.out.println("seven swarms a swimming");
                case 6:
                    System.out.println("six geese are laying");
                case 5:
                    System.out.println("five golden rings");
                case 4:
                    System.out.println("four calling birds");
                case 3:
                    System.out.println("three french hens");
                case 2:
                    System.out.println("two turtle doves");
                case 1:
                    System.out.println("a partridge in a pear tree");

                default:
                    System.out.println();
            }
            counter++;
        }while (counter <= 12);
    }


}


