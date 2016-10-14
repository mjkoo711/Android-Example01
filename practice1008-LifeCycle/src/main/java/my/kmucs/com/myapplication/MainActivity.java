package my.kmucs.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String tag = "LifecycleLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "=========onCreate()==========");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(tag, "=========onStart()=========");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "========onStop()=======");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "========onRestart()=======");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "=========onDestroy=========");
    }
}
