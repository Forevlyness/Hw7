package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] heroes = createHeroes();
        applyAbility(heroes);
        for (Hero hero : heroes) {
            System.out.println(hero.getClass().getSimpleName()
                    + " health: " + hero.getHealth());
        }
    }


    private static void applyAbility(Hero heroes[]){
        for (Hero hero : heroes){
            hero.useAbility(heroes);
        }
    }


    private static Hero[] createHeroes(){
        Medic medic = new Medic(1500, 0);
        Magic magic = new Magic(1500, 500);
        Warrior warrior = new Warrior(2000, 300);
        Hero[] heroes ={medic, magic, warrior};
        return heroes;
    }

}