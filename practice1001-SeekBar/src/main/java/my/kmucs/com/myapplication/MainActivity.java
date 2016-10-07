package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView tv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar)findViewById(R.id.seekbar);
        tv01 = (TextView)findViewById(R.id.tv01);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv01.setText("Now Volumn : " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {//손 댈때
                Toast.makeText(getApplicationContext(),"Start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { //손 땔때
                Toast.makeText(getApplicationContext(),"Stop", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
