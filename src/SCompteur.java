public class SCompteur {
    private static Compteur instance;

    private SCompteur() {}

    public static Compteur getInstance() {
        if (instance == null) {
            instance = new Compteur();
        }
        return instance;
    }
}

