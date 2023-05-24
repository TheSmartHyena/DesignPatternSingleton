public class Compteur {
    private int total = 0;

    public void click() {
        this.total += 1;
    }

    public int getTotal() {
        return this.total;
    }
}
