package lab3.entities.heroes_impl;

import lab3.entities.BaseHero;
import lab3.entities.Hero;

public class Elf extends BaseHero {


    public Elf(String name) {
        super(name, 10, 10);
    }

    @Override
    public void kick(Hero enemy) {
        StringBuilder log = new StringBuilder();
        log.append("Elf ").append(name);

        if (enemy.getPower() < power) {
            int damage = enemy.getHp();
            log.append(" deliver ").append(damage)
                    .append(" damage to ").append(enemy.getName());
            enemy.deliverDamage(damage);
        } else {
            log.append(" reduces power of ").append(enemy.getName())
                    .append(" by ").append(1);
            enemy.reducePower(1);
        }

        System.out.println(log);
    }

    @Override
    public String getName() {
        return "Elf " + super.getName();
    }
}
