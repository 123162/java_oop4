
package tv;


public class Tvtest {
    private int channel;
    private int volumeLevel;
    private boolean on;
    
    
    public Tvtest(int channel,int volumeLevel,boolean on){
        this.channel=channel;
        this.volumeLevel=volumeLevel;
        this.on=on;
    }
    public void kanalDegistirme(){
         if(channel>120){
            System.out.print("daha fazla kanal yok");
        }else if(channel<120 && channel>1){
            System.out.print("açılan kanal:"+channel);
        }else{
            System.out.print("geçersiz kanal...");
        }
    }
    
    public void turnOn(){
       System.out.println("tv açık");
    }
    public void turnOf(){
       System.out.println("tv kapalı...");

    }

    public void setChannel(int channel) {
        if(channel>120){
            System.out.print("daha fazla kanal yok");
        }else if(channel<120 && channel>1){
            System.out.print("açılan kanal:"+channel);
        }else{
            System.out.print("geçersiz kanal...");
        }
    }

    public void setVolumeLevel(int volumeLevel) {
        if(volumeLevel>=7){
            System.out.println("daha fazla artamaz");
            
        }else if(volumeLevel>1 && volumeLevel<7){
            System.out.println("ses açık:"+volumeLevel);

        }else{
            System.out.print("geçersiz ayar");
        }
        
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    
    
}
