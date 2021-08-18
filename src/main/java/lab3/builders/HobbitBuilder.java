package lab3.builders;

import lab3.entities.Hero;
import lab3.entities.heroes_impl.Hobbit;

public class HobbitBuilder implements HeroBuilder{

    @Override
    public Hero makeHero(String name) {
        return new Hobbit(name);
    }
}
