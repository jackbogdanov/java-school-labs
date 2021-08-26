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


        return proxyPreprocess(t);
    }

    @SneakyThrows
    private void init(Object o) {
        Method[] methods = o.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("init")) {
                method.invoke(o);
            }
        }
    }

    @SneakyThrows
    private <T> T proxyPreprocess(T o) {
        Class<?> objectClass = o.getClass();
        Class<?> proxyClass = config.getProxyClass(objectClass);

        if (proxyClass != null) {
            return (T) proxyClass.getConstructor(objectClass).newInstance(o);
        }

        return o;
    }

}
