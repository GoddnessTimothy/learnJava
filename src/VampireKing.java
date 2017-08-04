public class VampireKing extends Vampire {
    public VampireKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = damage/2;
        super.takeDamage(damageDone);
    }

    @Override
    public void setHitPoints(int hitPoints) {
        super.setHitPoints(hitPoints);
    }
}