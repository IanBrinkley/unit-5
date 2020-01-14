public class Die implements Lockable {
    private int face;
    private int key;
    private boolean locked;

    public Die() {
        roll();
        key = 0;
        locked = false;
    }
    public Die(int key) {
        roll();
        this.key = key;
        locked = false;
    }

    public void roll() {
        if (!locked) face = (int)(Math.random()*5+1);
    }
    public int getFace() {
        return face;
    }
    public String toString() {
        return "Face: " + face;
    }


    public void setKey(int key) {
        this.key = key;
    }
    public void lock(int key) {
        this.locked = true;
    }
    public void unlock(int key) {
        this.locked = false;
    }
    public boolean locked() {
        return this.locked;
    }
}
