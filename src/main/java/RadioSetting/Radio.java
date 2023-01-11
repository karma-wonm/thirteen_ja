package RadioSetting;


import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void next() {
        if (getCurrentStation() < maxStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void prev() {
        if (getCurrentStation() > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void increaseVolume() {
        if (getCurrentVolume() < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = currentVolume;
        }
    }
    public Radio(int size){
        this.maxStation = size - 1;
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = currentVolume;
        }
    }
}


