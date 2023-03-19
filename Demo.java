public class Demo {
    public static void main(String[] args) {
        Player dk = new Player("Dhirti",8);
        System.out.println(dk.getHandleName());



        System.out.println("Level: " + dk.getlevel());
        System.out.println("Lives: " + dk.getLives());
        

        System.out.println(dk.getWeapon().getName());
        Weapon ak = new Weapon("AK-47", 90, 900);
        dk.setWeapon(ak);
        System.out.println(dk.getWeapon().getName());



    }

}
