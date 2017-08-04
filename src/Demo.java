public class Demo {
    //psvm
    public static void main(String[] args) {
//        Player tim = new Player();
//        tim.setHandleName("Tim");
//        System.out.println(tim.getHandleName());

        Player tim = new Player();
        tim.setHandleName("timmy");
        tim.setLevel(5);
        tim.setLives(15);
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());
        System.out.println("Handle: " + tim.getHandleName());

        Player mousey = new Player("mousey");
        mousey.setLives(2);
        mousey.setLevel(9);
        System.out.println("Level: " + mousey.getLevel());
        System.out.println("Lives: " + mousey.getLives());
        System.out.println("Handle: " + mousey.getHandleName());

        Player razore = new Player("razore", 3);

        System.out.println("Level: " + razore.getLevel());
        System.out.println("Lives: " + razore.getLives());
        System.out.println("Handle: " + razore.getHandleName());


    }
}
