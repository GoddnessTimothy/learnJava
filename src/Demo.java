import java.util.ArrayList;

public class Demo {
//  psvm
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName());
//      sout
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());
//      System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Green Potion", LootType.POTION, 7);
        Loot chestArmor = new Loot("Chest Armor", LootType.ARMOR, 70);

        tim.pickUpLoot(redPotion);
        tim.pickUpLoot(chestArmor);
        tim.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 10));
        tim.showInventory();

        Loot bluePotion = new Loot("blue potion",LootType.POTION, 10);
        boolean wasDropped = tim.dropLoot(redPotion);
        System.out.println(wasDropped);
        tim.showInventory();

        System.out.println("|===========================================================|");
//        Enemy enemy = new Enemy("minion", 5, 1);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();

//        Troll uglyTroll = new Troll("ugly troll");
//        uglyTroll.takeDamage(30);
//        uglyTroll.showInfo();
//
//        Vampire vlad = new Vampire("vlad");
//        vlad.takeDamage(12);
//        vlad.showInfo();
//        System.out.println("|===========================================================|");

        VampireKing vladmire = new VampireKing("vladmire");
        vladmire.showInfo();
        vladmire.takeDamage(100);
        vladmire.showInfo();
    }

}