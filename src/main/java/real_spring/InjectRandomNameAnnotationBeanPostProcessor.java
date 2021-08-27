package real_spring;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class InjectRandomNameAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        for (Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                field.setAccessible(true);
                String name = new Faker().name().firstName();
                field.set(bean, name);
            }
        }
        return bean;
    }
}
