package lab3.entities.heroes_impl;

import lab3.entities.BaseHero;
import lab3.entities.Hero;
import lab3.entities.heroes_impl.kick_tactics.Tactic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class King extends BaseHero {

    Tactic tactic;

    public King(String name, Tactic tactic) {
        super(name, (int) (Math.random() * 10 + 5), (int) (Math.random() * 10 + 5));
        this.tactic = tactic;
    }

    @Override
    public void kick(Hero enemy) {
        tactic.useTactic(this, enemy);
    }

    @Override
    public String getName() {
        return "King " + super.getName();
    }
}
