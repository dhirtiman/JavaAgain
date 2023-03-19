public class Weapon {
    private String name;
    private int damageInflicted,hitPoints;

    public Weapon(String name, int damageInflicted, int hitPoints) {
        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitPoints = hitpoints;
    }

}
