public class Demo {
    public static void main(String[] args) {
        Player dk = new Player();
        System.out.println(dk.getHandleName());


        dk.setNameAndLevel("Dhirtiman",5);
        System.out.println(dk.getHandleName());
        System.out.println("Level: " + dk.getlevel());
        System.out.println("Lives: " + dk.getLives());

    }

}
