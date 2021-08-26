package my_spring.proxy;

import lombok.AllArgsConstructor;
import my_spring.Cleaner;
import my_spring.CleanerImpl;

@AllArgsConstructor
public class TimerCleanerProxy implements Cleaner {

    private final CleanerImpl cleaner;

    @Override
    public void clean() {

        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}
