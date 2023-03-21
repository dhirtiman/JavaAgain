public class Hero {
    public static void main(String[] args) {
        Player dk = new Player("Dhirti",8);
        // System.out.println(dk.getHandleName());



        // System.out.println("Level: " + dk.getlevel());
        // System.out.println("Lives: " + dk.getLives());
        

        // System.out.println(dk.getWeapon().getName());
        Weapon ak = new Weapon("AK-47", 90, 900);
        dk.setWeapon(ak);
        // System.out.println(dk.getWeapon().getName());

        Loot rPotion = new Loot("Red Potion",LootType.POTION,7);
        dk.pickUpLoot(rPotion);
        dk.pickUpLoot(new Loot("+3 Chest Armor",LootType.ARMOR,80));
        dk.pickUpLoot(new Loot("Ring of Rizz",LootType.RING,40));
        dk.pickUpLoot(new Loot("Rizz Potion",LootType.POTION,35));
        
        dk.showInventory();

        // Loot bPotion = new Loot ("Blue Potion",LootType.POTION,6);
        boolean wasDeleted = dk.dropLoot(rPotion);
        System.out.println(wasDeleted);
        dk.showInventory();



    }
    
}
