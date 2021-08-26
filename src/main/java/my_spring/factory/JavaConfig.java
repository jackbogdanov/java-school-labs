package my_spring.factory;

import my_spring.*;
import my_spring.proxy.TimerCleanerProxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {

    private Map<Class, Class> ifc2ImplClass = new HashMap<>();
    private Map<Class, Class> proxyClass = new HashMap<>();

    public JavaConfig() {
        ifc2ImplClass.put(Speaker.class, ConsoleSpeaker.class);
        ifc2ImplClass.put(Cleaner.class, CleanerImpl.class);

        proxyClass.put(CleanerImpl.class, TimerCleanerProxy.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2ImplClass.get(type);
    }

    public <T> Class<T> getProxyClass(Class<T> type) {
        return proxyClass.get(type);
    }
}





