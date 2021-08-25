package my_spring;

import my_spring.factory.ObjectFactory;


public class Main {
    public static void main(String[] args) {

        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}
