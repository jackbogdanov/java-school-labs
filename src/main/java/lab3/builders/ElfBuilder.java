package lab3.builders;

import lab3.entities.Hero;
import lab3.entities.heroes_impl.Elf;

public class ElfBuilder implements HeroBuilder{

    @Override
    public Hero makeHero(String name) {
        return new Elf(name);
    }
}
