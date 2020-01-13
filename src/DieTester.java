public class DieTester {
    public static void main(String[] args) {
        Die d1 = new Die(123);

        System.out.println("initial value:");
        System.out.println(d1.getFace());

        d1.lock(123);

        d1.roll();
        System.out.println("after attempting to roll while locked:");
        System.out.println(d1.getFace());

        d1.setKey(321);
        d1.unlock(321);

        d1.roll();
        System.out.println("after rolling when unlocked:");
        System.out.println(d1.getFace());

    }
}
