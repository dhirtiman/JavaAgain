public class Demo {
    public static void main(String[] args) {
        Player dk = new Player();
        System.out.println(dk.getHandleName());
        dk.setHandleName("Dhirtiman");
        System.out.println(dk.getHandleName());
        System.out.println("Level: "+dk.getLevels());
        System.out.println("Lives: "+dk.getLives());

        Player pk = new Player("pkay");
        System.out.println(pk.getHandleName());
        pk.setLives(5);
        System.out.println("Level: "+pk.getLevels());
        System.out.println("Lives: "+pk.getLives());

        Player bk = new Player("bkay",6);
        System.out.println(bk.getHandleName());
        System.out.println("Level: "+bk.getLevels());
        System.out.println("Lives: "+bk.getLives());
    }
    
}
