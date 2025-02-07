public class Mahabharata {
    public static void main(String[] args) {
        
        System.out.println("PANDAVS:");
        Arjun arjun = new Arjun();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        Bheem bheem = new Bheem();
        bheem.fight();
        bheem.obey();
        bheem.kind();

      
        System.out.println("\nKAURAVS:");
        Duryodhan duryodhan = new Duryodhan();
        duryodhan.fight();
        duryodhan.obey();

        Vikarn vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
