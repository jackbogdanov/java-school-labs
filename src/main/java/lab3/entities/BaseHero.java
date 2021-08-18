package lab3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class BaseHero implements Hero {


    protected String name;
    protected int power;
    protected int hp;

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void deliverDamage(int damage) {
        hp -= damage;
    }

    @Override
    public void reducePower(int points) {
        power -= points;
    }
}
