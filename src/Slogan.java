public class Slogan {
    private String slogan;
    private static int count = 0;
    public Slogan(String slogan) {
        this.slogan = slogan;
        count++;
    }
    public static int getCount() {
        return count;
    }
    public String toString() {
        return slogan;
    }
}
