package chapterFour;

import java.util.Scanner;

public class TelevisionTest {
    public static void main(String[] args) {
        boolean isOn;
        int channel;
        int vol;
        Scanner keyboard = new Scanner(System.in);
        isOn = keyboard.nextBoolean();
        channel = keyboard.nextInt();
        vol = keyboard.nextInt();
       Television myTelevision = new Television(isOn,channel,vol);

        System.out.println(myTelevision.isOn());
        System.out.println(myTelevision.getChannelNumber());
        System.out.println(myTelevision.getVolume());
    }
}
