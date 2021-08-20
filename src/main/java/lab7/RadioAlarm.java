package lab7;

import lab7.alarms.Alarm;
import lab7.radios.Radio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class RadioAlarm implements Radio, Alarm {

    private Radio radio;
    private Alarm alarm;


    @Override
    public void setTime() {
        alarm.setTime();
    }

    @Override
    public void stop() {
        alarm.stop();
    }

    @Override
    public void radioPlay() {
        radio.radioPlay();
    }

    @Override
    public void radioStop() {
        radio.radioStop();
    }
}
