package lab3.entities.heroes_impl;

import lab3.entities.BaseHero;
import lab3.entities.Hero;
import lab3.entities.heroes_impl.kick_tactics.Tactic;

public class Knight extends BaseHero {

    Tactic tactic;

    public Knight(String name, Tactic tactic) {
        super(name, (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2));
        this.tactic = tactic;
    }

    @Override
    public void kick(Hero enemy) {
        tactic.useTactic(this, enemy);
    }

    @Override
    public String getName() {
        return "Knight " + super.getName();
    }
}
