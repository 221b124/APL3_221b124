public class Main {
    public static void main(String[] args) {
        System.out.println("Duck Game");

        RubberDuck rd = new RubberDuck();
        WoodenDuck wd = new WoodenDuck();
        RedHeadDuck rhd = new RedHeadDuck();
        LakeDuck ld = new LakeDuck();

        rd.swim();
        rd.squeak();

        wd.swim();

        rhd.swim();
        rhd.fly();
        rhd.quack();

        ld.swim();
        ld.fly();
        ld.quack();
    }
}
