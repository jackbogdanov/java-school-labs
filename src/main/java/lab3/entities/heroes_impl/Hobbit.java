package lab3.entities.heroes_impl;

import lab3.entities.BaseHero;
import lab3.entities.Hero;

public class Hobbit extends BaseHero {

    public Hobbit(String name) {
        super(name, 0, 3);
    }

    @Override
    public void kick(Hero enemy) {
        crying();
    }

    private void crying() {
        System.out.println("Hobbit " + name + " is crying...");
    }

    @Override
    public String getName() {
        return "Hobbit " + super.getName();
    }
}
