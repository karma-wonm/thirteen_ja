package RadioSetting;


import lombok.*;


public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentVolume;
    private int size = 10;
    public Radio(int maxStation, int minStation, int currentStation, int minVolume, int maxVolume, int currentVolume, int size) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.size = size;
    }
}

