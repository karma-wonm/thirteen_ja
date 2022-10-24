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

    public Radio(){

    }


    public Radio(int maxStation, int minStation, int currentStation, int minVolume, int maxVolume, int currentVolume, int size) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.size = size;
    }

    public Radio(int size) {
        this.maxStation = size - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStationLombok(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
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

