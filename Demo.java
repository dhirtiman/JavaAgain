public class Demo {
    public static void main(String[] args) {

        VampireKing Karrs = new VampireKing("Karrs");
        Karrs.showInfo();

        while (Karrs.getLives() > 0) {
            if(Karrs.dodges()){
                continue;
            }
            if (Karrs.runAway()) {
                System.out.println(Karrs.getName() + " Ran Away");
                break;
            } else {
                Karrs.takeDamage(50);
                Karrs.showInfo();
            }
        }

    }

}
