public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);
    }

    @Override
    //must match method in super class!!
    public void takeDamage(int damage) {
        int damageDone = damage/2;
        super.takeDamage(damageDone);


    }
}
