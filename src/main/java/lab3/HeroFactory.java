package lab3;

import com.github.javafaker.Faker;
import lab3.builders.HeroBuilder;
import lab3.entities.Hero;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class HeroFactory {

    private List<HeroBuilder> builders;

    public void addNewHeroType(HeroBuilder newHeroBuilder) {
        builders.add(newHeroBuilder);
    }

    public Hero createHero() {
        int type = (int) (Math.random() * builders.size());
        String name = new Faker().name().firstName();

        return builders.get(type).makeHero(name);
    }

}
