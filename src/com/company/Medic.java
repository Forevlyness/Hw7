package com.company;

import java.util.Random;

public class Medic extends Hero{
    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void useAbility(Hero[] heroes) {
        int random = new Random().nextInt(1);
        if (random == 0) {
            int randomHealth = new Random().nextInt(800);
            int hero = new Random().nextInt(heroes.length);
            if (heroes[hero].health > 0) {
                heroes[hero].setHealth(heroes[hero].getHealth() + randomHealth);
                System.out.println("Medic healths " + getClass().getSimpleName() +  " on: " + randomHealth);
            }
        }
    }
}
