import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives, level, score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player() {
        this("PlayerMan");
    }

    public Player(String handle) {
        this(handle, 1);
        // handleName = handle;
        // lives = 3;
        // level = 1;
        // score = 0;

    }

    public Player(String handle, int startingLevel) {
        // this.handleName = handle;
        // this.lives = 3;
        // this.level = startingLevel;
        // this.score = 0;
        setHandleName(handle);
        setLives(3);
        setlevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();

    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            System.out.println(handle + " To Short!");
            return;
        }
        this.handleName = handle;

    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setNameAndLevel(String name, int level) {
        // this.handleName = name;
        // this.level = level;
        setHandleName(name);
        setlevel(level);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getlevel() {
        return level;
    }

    public void setlevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    // public void setInventory(ArrayList<Loot> inventory) {
    // this.inventory = inventory;
    // }

    public void pickUpLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public Boolean dropLoot(Loot loot) {
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;

    }

    public Boolean dropLoot(String lootName) {
        for (Loot currentLoot : inventory) {
            if (lootName.equals(currentLoot.getName())) {
                inventory.remove(currentLoot);
                return true;
            }
        }
            return false;

    }

    public void showInventory() {
        for (Loot item : inventory) {
            System.out.println(item.getName());
        }
        System.out.println("=========================================");
    }

    public int score() {

        int total = 0;
        // for (int i = 0; i < inventory.size(); i++) {
        // Loot currenLoot = inventory.get(i);
        for (Loot currentLoot : inventory) {
            System.out.println(currentLoot.getName() + " is worth " + currentLoot.getValue());
            total = total + currentLoot.getValue();
        }
        return total;

    }

}
