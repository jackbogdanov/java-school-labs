package lab3.entities.heroes_impl.kick_tactics;

import lab3.entities.Hero;

public class RandomTactic implements Tactic{

    @Override
    public void useTactic(Hero hero, Hero enemy) {
        StringBuilder log = new StringBuilder();

        int damage = (int) (Math.random() * hero.getPower());

        log.append(hero.getName()).append(" reduce hp of ")
                .append(enemy.getName()).append(" by ").append(damage);

        enemy.deliverDamage(damage);

        System.out.println(log);
    }
}
