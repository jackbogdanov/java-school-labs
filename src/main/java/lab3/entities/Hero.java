package lab3.entities;

public interface Hero {

    void kick(Hero enemy);
    boolean isAlive();

    String getName();
    int getPower();
    int getHp();
    void deliverDamage(int damage);
    void reducePower(int points);
}
