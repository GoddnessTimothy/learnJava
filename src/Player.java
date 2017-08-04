public class Player {
    private String handleName;
    private int lives, level, score;

    //constructor
    public Player() {
        //Default handle name
        this("unknown player");
//        handleName = "unknown player";
//        lives = 3;
//        level = 1;
//        score = 0;
    }

    public Player(String handle) {
        //default level
        this(handle, 1);
//        lives = 3;
//        level = 1;
//        score = 0;
    }

    public Player(String handle, int startingLevel) {
        handleName = handle;
        lives = 30;
        level = startingLevel;
        score = 0;
    }

    public String getHandleName() {

        return handleName;
    }

    public void setHandleName(String handleName) {
        if (handleName.length() < 4) {
            return;
        }
        this.handleName = handleName;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
