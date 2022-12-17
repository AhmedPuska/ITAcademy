package javaapplication287;

public class ElfMage extends BaseHero {

    @Override
    public void receiveHit() {
        this.health -= 30;
        this.dead = this.health <= 0;
    }

    @Override
    public void primaryFire() {
        this.mana -= 15;
        System.out.println("Firing primary!!!!!");
    }

    @Override
    public void secondaryFire() {
        this.mana -= 50;
        System.out.println("Firing secondary!!!!!");
    }

    public void show() {
        System.out.println(
                "Health: " + this.health
                + " Mana: " + this.mana
                + " Dead: " + this.dead
        );
    }

}
