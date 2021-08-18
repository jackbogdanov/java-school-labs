package lab3.builders;

import lab3.entities.Hero;
import lab3.entities.heroes_impl.King;
import lab3.entities.heroes_impl.kick_tactics.RandomTactic;

public class KingBuilder implements HeroBuilder{
    @Override
    public Hero makeHero(String name) {
        return new King(name, new RandomTactic());
    }
}
