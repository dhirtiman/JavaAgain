public class EnemyLegacy {
    public static void main(String[] args) {
         // Enemy enemy = new Enemy("boy", 10, 3);
        // enemy.showInfo();
        // enemy.takeDamage(5);
        // enemy.takeDamage(5);
        // enemy.showInfo();

        Troll uglyTroll = new Troll("TrollNiga");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        System.out.println();

        Vampire vlad =  new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        System.out.println();
    }
}
