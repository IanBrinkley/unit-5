public class Num {
    int value;
    public Num (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean equals(Num num2) {
        return (num2.getValue() == this.value);
    }

    public String toString() {
        return value + "";
    }
}
