package bmrcalculator.bmicalculator.gul_raiz_ahmad.bmi_call_d;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bmicalculator.gul_raiz_ahmad.bmi_call_d.R;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class splashscreenactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
       getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreenactivity);
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(splashscreenactivity.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 2000);
    }
}
