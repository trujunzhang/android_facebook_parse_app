package androidhive.info.materialdesign;

import com.facebook.FacebookSdk;

/**
 * Created by wang on 2015/5/22.
 */
public class Application extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();

        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
