public class SloganClient {
    public static void main(String[] args) {
        Slogan slogan1 = new Slogan("zach");
        Slogan slogan2 = new Slogan("is");
        Slogan slogan3 = new Slogan("very");
        Slogan slogan4 = new Slogan("ebic");

        System.out.println(slogan1);
        System.out.println(Slogan.getCount());
    }
}
