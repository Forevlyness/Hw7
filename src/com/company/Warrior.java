package com.company;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void useAbility(Hero[] heroes) {
        int isAvailable = new Random().nextInt(2);
        if(isAvailable == 1){
            int randomDamage = new Random().nextInt(501);
            this.damage = this.damage + randomDamage;
            System.out.println("Warrior boosted his damage on: " + randomDamage);
        }
    }
}