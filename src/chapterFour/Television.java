
package chapterFour;


public class Television {
    private boolean isOn;
    private int channelNumber;
    private int volume;

    public Television(boolean isOn,int channelNumber,int volume){
        this.isOn = isOn;
        this.channelNumber = channelNumber;
        this.volume = volume;
    }

    public void setOn(boolean on) {

        isOn = on;
    }

    public int getChannelNumber() {

        return channelNumber;
    }

    public boolean isOn() {

        return isOn;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public void setVolume(int volume){
        if(volume > 50){
            System.out.println("invalid input");}
        this.volume = volume;
        }



    public int getVolume() {
            return volume;
        }

}
