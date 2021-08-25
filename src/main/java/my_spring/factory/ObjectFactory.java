package my_spring.factory;

import lection.adapter_lab.RandomUtil;
import lombok.Getter;
import lombok.SneakyThrows;
import my_spring.Config;
import my_spring.annotations.AnnotationsEnum;
import my_spring.annotations.Inject;
import my_spring.annotations.InjectRandomInt;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.getDeclaredConstructor().newInstance();

        for (AnnotationsEnum annotation : AnnotationsEnum.values()) {
            annotation.runHandler(t);
        }

        return t;
    }




}
