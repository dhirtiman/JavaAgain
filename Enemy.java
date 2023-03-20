public class Enemy {
    private String name;
    private int hitPoints, fullHitPoints, lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.fullHitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingHitPoints = this.hitPoints - damage;
        if (remainingHitPoints < 0) {
            remainingHitPoints = 0;
        }
        setHitPoints(remainingHitPoints);
        System.out.println(
                this.name + " took " + damage + " points damage, remaining hitpoints: " + remainingHitPoints);
        if (remainingHitPoints <= 0) {
            this.lives = this.lives - 1;
            if (this.lives <= 0) {
                System.out.println(this.name + " Dies...");
            } else {
                System.out.println(this.name + " has lost a life, "+this.lives+" Lives left");
                setHitPoints(this.fullHitPoints);
            }
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + " HitPoints: " + this.hitPoints + " Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
