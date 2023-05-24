public class Main {
    public static void main(String[] args) {
        Entite a = new Entite();
        Entite b = new Entite();
        Entite c = new Entite();

        a.click();
        a.click();

        b.click();

        for (int i = 0; i < 10; i++) {
            c.click();
        }

        System.out.println(SCompteur.getInstance().getTotal());
    }
}