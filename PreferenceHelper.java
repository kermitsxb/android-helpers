import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class PreferenceHelper {
    private static final String LOG_TAG = PreferenceHelper.class.getSimpleName();
    private static final String MODIFICATION_DATE = "_modificationdate";
    private static final String PREF_NAME = "app_pref";

    /**
     *
     * @param context
     * @param key
     * @param value
     */
    public static void setPreference(Context context, String key, String value)
    {
        Log.d(LOG_TAG, "setPreference("+key+", "+value+")");
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.putString(key + MODIFICATION_DATE, String.valueOf(System.currentTimeMillis()));
        editor.commit();
    }

    /**
     *
     * @param context
     * @param key
     * @return
     */
    public static boolean hasPreference(Context context, String key){
        Log.d(LOG_TAG, "hasPreference("+key+")");
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPref.contains(key);
    }

    /**
     *
     * @param context
     * @param key
     */
    public static void removePreference(Context context, String key){
        Log.d(LOG_TAG, "removePreference("+key+")");
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sharedPref.edit().remove(key).commit();
    }

    /**
     *
     * @param context
     * @param key
     * @return
     */
    public static String getPreference(Context context, String key){
        Log.d(LOG_TAG, "getPreference("+key+")");
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPref.getString(key, null);
    }

    /**
     *
     * @param context
     * @param key
     * @return
     */
    public static String getPreferenceModificationDate(Context context, String key){
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPref.getString(key + MODIFICATION_DATE, null);
    }
}
