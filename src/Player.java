import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    private ArrayList<Loot> inventory;



    //constructor
    public Player() {
        //Default handle name
        this("unknown player");
    }

    public Player(String handle) {
        //default level
        this(handle, 1);
    }

    public Player(String handle, int startingLevel) {
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        //Initialize the arrayList
        inventory = new ArrayList<>();
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        if (handleName.length() < 3) {
            System.out.println("The name " + handleName + " is too short!  Should be 8 characters or more");
            return;
        }
        this.handleName = handleName;
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Pickaxe", 10, 10);
    }

    public void setNameAndLevel(String name, int level) {
        setHandleName(name);
        setLives(3);
        setLevel(level);
        setScore(0);
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    public void pickUpLoot(Loot loot) {
        inventory.add(loot);
    }

    public boolean dropLoot(Loot loot) {
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public void showInventory() {
        for(Loot item : inventory) {
            System.out.println(item.getName());
        }
    }
}