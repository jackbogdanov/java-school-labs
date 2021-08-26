package my_spring;

import my_spring.annotations.Inject;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @Inject
    private Speaker speaker;
    @Inject
    private Cleaner cleaner;

    public void init() {
        speaker.speak("INIT");
    }

    public void cleanRoom(){
        speaker.speak("Я начал работать");
        cleaner.clean();
        speaker.speak("Я закончил работать");
    }
}
