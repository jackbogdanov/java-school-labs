package my_spring.annotations;

import lombok.Getter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AnnotationsHandlerProvider {

    private static final String PACKAGE_NAME = "my_spring.annotations.handlers";

    @Getter
    private final List<AnnotationsHandler> handlers = new ArrayList<>();

    public AnnotationsHandlerProvider() {
        loadData();
    }

    @SneakyThrows
    private void loadData() {
        Reflections reflections = new Reflections(PACKAGE_NAME);
        Set<Class<? extends AnnotationsHandler>> allHandlers = reflections.getSubTypesOf(AnnotationsHandler.class);

        for (var h : allHandlers) {
            handlers.add(h.getDeclaredConstructor().newInstance());
        }
    }

}
