package lab3;

import lab3.builders.*;
import lab3.entities.Hero;
import lab3.entities.heroes_impl.Elf;
import lab3.entities.heroes_impl.Hobbit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HeroBuilder> builders = new ArrayList<>();

        builders.add(new HobbitBuilder());
        builders.add(new ElfBuilder());
        builders.add(new KingBuilder());
        builders.add(new KnightBuilder());

        HeroFactory factory = new HeroFactory(builders);

        Hero hero1 = factory.createHero();
        Hero hero2 = factory.createHero();

        GameManager manager = new GameManager();

        manager.fight(hero1, hero2);
    }
}
