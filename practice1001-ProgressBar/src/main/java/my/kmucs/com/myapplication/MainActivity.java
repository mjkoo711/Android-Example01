package my.kmucs.com.myapplication;

import android.os.RecoverySystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressBar pro01;
    Button btn01, btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pro01 = (ProgressBar)findViewById(R.id.pro01);
        btn01 = (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);

        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn01:
                pro01.incrementProgressBy(5);
                break;
            case R.id.btn02:
                pro01.incrementSecondaryProgressBy(5);
                break;
        }
    }
}
