package RadioSetting;

import RadioSetting.Radio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    //11 тестов

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void changeStationPlus(int newCurrentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(newCurrentStation);

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNext")
    public void nextStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.next(currentStation);

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrev")
    public void prevStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.prev(currentStation);

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/volumeIncrease")
    public void increaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.increaseVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/volumeDescrease")
    public void descreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.decreaseVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
