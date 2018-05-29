package md.asem;

public class ClassA {
    String whatever;

    public ClassA(final String whatever) {
        this.whatever = whatever;
    }

    public String getWhatever() {
        return whatever;
    }

    public void setWhatever(final String whatever) {
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "whatever='" + whatever + '\'' +
                '}';
    }
}
