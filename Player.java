public class Player {
    private String handleName;
    private int lives, levels, score;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player() {
        this("PlayerMan");
    }

    public Player(String handle){
        this(handle, 1);
        // handleName = handle;
        // lives = 3;
        // levels = 1;
        // score = 0;

    }

    public Player(String handle, int startingLevel){
        handleName = handle;
        lives = 3;
        levels = startingLevel;
        score = 0;
    }

    public String getHandleName(){
        return handleName;
    }
    public void setHandleName(String handle){
        if (handle.length()<3){
            System.out.println("To Short!");
            return;
        }
        handleName = handle;
    }
    


}
