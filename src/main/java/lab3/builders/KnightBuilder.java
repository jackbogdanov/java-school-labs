package lab3.builders;

import lab3.entities.Hero;
import lab3.entities.heroes_impl.Knight;
import lab3.entities.heroes_impl.kick_tactics.RandomTactic;

public class KnightBuilder implements HeroBuilder{
    @Override
    public Hero makeHero(String name) {
        return new Knight(name, new RandomTactic());
    }
}
