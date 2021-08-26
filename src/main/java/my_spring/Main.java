package my_spring;

import lombok.SneakyThrows;
import my_spring.factory.ObjectFactory;
import my_spring.proxy.TimerCleanerProxy;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();

    }
}
