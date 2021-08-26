package my_spring.factory;

import lombok.Getter;
import lombok.SneakyThrows;
import my_spring.Config;
import my_spring.annotations.*;

import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();
    private HandlerProvider provider = new BaseAnnotationsHandlerProvider();

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.getDeclaredConstructor().newInstance();

        for (AnnotationsHandler handler : provider.getHandlers()) {
            handler.handle(t);
        }

        init(t);
        return t;
    }

    @SneakyThrows
    private void init(Object o) {
        Method[] methods = o.getClass().getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("init")) {
                method.invoke(o);
            }
        }
    }


}
