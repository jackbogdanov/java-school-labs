package lab3;

import lab3.entities.Hero;

public class GameManager {

    public void fight(Hero firstHero, Hero secondHero) {
        System.out.println("Fight starts soon..");
        System.out.println("Today heroes are: " + firstHero.getName() + " and " + secondHero.getName());

        int round = 0;

        while (firstHero.isAlive() && secondHero.isAlive()) {
            System.out.println();
            System.out.println("Round " + round + " starts:");

            firstHero.kick(secondHero);
            secondHero.kick(firstHero);

            round++;
        }

        System.out.println();
        System.out.println("Fight finished: ");

        if (!firstHero.isAlive()) {
            System.out.println(firstHero.getName() + " is dead");
        }

        if (!secondHero.isAlive()) {
            System.out.println(secondHero.getName() + " is dead");
        }
    }
}
