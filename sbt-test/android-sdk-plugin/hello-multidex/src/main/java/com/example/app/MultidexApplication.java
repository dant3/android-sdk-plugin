import android.content.Context;
import android.support.multidex.MultiDex;

public class MultidexApplication extends android.support.multidex.MultiDexApplication {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}