import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateHelper {
    public static final String FORMAT_VMOIS_ANNEE = "MMMM yyyy";
    public static final String FORMAT_VJOUR_MOIS_ANNEE = "d MMMM yyyy";
    public static final String FORMAT_FR_SLASH = "dd/MM/yyyy";
    public static final String FORMAT_URL = "yyyyMMdd";

    /**
     * Renvoit la date formatée
     *
     * @param p_date   Date a formater
     * @param p_format Format de la date (SHORT_FORMAT_DATE | FORMAT_DATE)
     * @return String
     */
    public static String getFormattedDate(Date p_date, String p_format) {
        SimpleDateFormat df = new SimpleDateFormat(p_format, Locale.FRANCE);
        return df.format(p_date);
    }
}
