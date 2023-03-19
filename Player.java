public class Player {
    private String handleName;
    private int lives, level, score;

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

    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            System.out.println(handle+" To Short!");
            return;
        }
        this.handleName = handle;
    }

    public void setNameAndLevel(String name,int level){
        // this.handleName = name;
        // this.level = level;
        setHandleName(name);
        setlevel(level);
    }

}
