package com.company;

import java.util.Random;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void useAbility(Hero[] heroes) {
        int isAvailable = new Random().nextInt(2);
        if(isAvailable == 1){
            int randomDamage = new Random().nextInt(100) + 150;
            this.damage = this.damage + randomDamage;
            System.out.println("Magic boosted his damage on: " + randomDamage);
        }
    }
}