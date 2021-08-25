package my_spring.annotations.handlers;

import lection.adapter_lab.RandomUtil;
import lombok.SneakyThrows;
import my_spring.annotations.AnnotationsHandler;
import my_spring.annotations.InjectRandomInt;

import java.lang.reflect.Field;

public class InjectRandomAnnotationHandler implements AnnotationsHandler {

    @Override
    @SneakyThrows
    public void handle(Object t) {
        for (Field field  : t.getClass().getDeclaredFields()) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            field.setAccessible(true);

            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();

                field.setInt(t, RandomUtil.between(min, max));
            }
        }
    }
}
