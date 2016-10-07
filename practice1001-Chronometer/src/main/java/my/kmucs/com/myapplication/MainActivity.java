package my.kmucs.com.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    Button btn01, btn02, btn03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer  = (Chronometer)findViewById(R.id.chron);
        btn01 = (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);
        btn03 = (Button)findViewById(R.id.btn03);

        //새로운 클릭 장착 방법
        btn01.setOnClickListener(clickListener);
        btn02.setOnClickListener(clickListener);
        btn03.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.btn01)
                chronometer.start();
            else if(v.getId() == R.id.btn02)
                chronometer.stop();
            else if(v.getId() == R.id.btn03)
                chronometer.setBase(SystemClock.elapsedRealtime());
        }
    };
}
