public class StringHelper {
    /**
     * Met le premier caractere d'une chaine en majuscule, le reste en minscule
     *
     * @param chaine
     * @return Chaine
     * @author Valentin
     */
    public static String ucfirst(String chaine) {
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
    }
}
