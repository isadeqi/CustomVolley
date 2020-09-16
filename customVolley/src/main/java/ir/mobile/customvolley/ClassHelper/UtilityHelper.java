package ir.mobile.customvolley.ClassHelper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import java.util.concurrent.Callable;

public class UtilityHelper {
    private boolean startAgain=true;
    Context context;
    public void setSharedPreferences(String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }
    public String getSharedPreferences(String key) {
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = context.getSharedPreferences("MyPref", 0);
        } catch (Exception ignored) {
        }
        assert sharedPreferences != null;
        return sharedPreferences.getString(key, "");
    }
    public UtilityHelper (Context context){
        this.context=context;
    }
}
