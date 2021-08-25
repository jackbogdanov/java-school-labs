package my_spring;

import lombok.Setter;
import my_spring.annotations.InjectRandomInt;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {

    @InjectRandomInt(min = 4, max = 5)
    private int volume;

    @Override
    public void speak(String message) {
        System.out.println(message + " " + volume);
    }
}
