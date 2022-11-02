package RadioSetting;


import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentVolume;
    private int size = 10;

}

