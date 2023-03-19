public class Classes {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOVer = (lives < 1);
        System.out.println(isGameOVer);
        
        if (isGameOVer) {
            System.out.println("Game over!");
        } else {
            System.out.println("You're still alive!");
        }

    }

}
