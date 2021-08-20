package lab7.alarms;

import lab7.alarms.Alarm;

public class BasicAlarm implements Alarm {
    @Override
    public void setTime() {
        System.out.println("some logic");
    }

    @Override
    public void stop() {
        System.out.println("alarm stopped");
    }
}
