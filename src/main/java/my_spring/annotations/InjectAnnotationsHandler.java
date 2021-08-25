package my_spring.annotations;


import lombok.SneakyThrows;
import my_spring.factory.ObjectFactory;

import java.lang.reflect.Field;

public class InjectAnnotationsHandler implements AnnotationsHandler {

    @Override
    @SneakyThrows
    public void handle(Object t) {
        for (Field field  : t.getClass().getDeclaredFields()) {
            Inject injectAnnotation = field.getAnnotation(Inject.class);

            if (injectAnnotation != null) {
                field.setAccessible(true);
                field.set(t, ObjectFactory.getInstance().createObject(field.getType()));
                field.setAccessible(false);
            }
        }
    }
}
