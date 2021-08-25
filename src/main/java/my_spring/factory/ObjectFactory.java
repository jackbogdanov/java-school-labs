package my_spring.factory;

import lombok.Getter;
import lombok.SneakyThrows;
import my_spring.Config;
import my_spring.annotations.*;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();
    private AnnotationsHandlerProvider provider = new AnnotationsHandlerProvider();

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.getDeclaredConstructor().newInstance();

        for (AnnotationsHandler handler : provider.getHandlers()) {
            handler.handle(t);
        }

        return t;
    }




}
