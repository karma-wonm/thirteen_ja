package RadioSetting;

import RadioSetting.Radio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {



// //11 тестов
    @ParameterizedTest
    @CsvFileSource(resources = "/lombok")
public void currentStation(int currentStation, int expected) {
    Radio radio = new Radio();

    radio.setCurrentStation(currentStation);

    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
}

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void changeStationPlus(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/dataNext")
    public void nextStation(int currentStation, int expected) {
        Radio radio = new Radio(10);
        radio.setCurrentStation(currentStation);
        radio.next();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrev")
    public void prevStation(int currentStation, int expected) {
        Radio radio = new Radio(10);
        radio.setCurrentStation(currentStation);
        radio.prev();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/volumeIncrease")
    public void increaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/volumeDescrease")
    public void descreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/DifferentStation")
    public void createADifferentStation(int size,int expected){
        Radio radio = new Radio( size);

        assertEquals(expected, radio.getMaxStation());
        assertEquals(expected = 0,radio.getMinStation() );
    }
}
