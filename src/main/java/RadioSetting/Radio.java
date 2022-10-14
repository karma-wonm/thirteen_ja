package RadioSetting;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int size){
        this.maxStation = size - 1;
    }
    public Radio(){

    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getMaxStation(){
        return maxStation;
    }

    public int getMinStation(){
        return minStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void next(int currentStation) {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void prev(int currentStation) {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = currentVolume;
        }
    }
}