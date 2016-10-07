package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker)findViewById(R.id.datepicker);
        timePicker = (TimePicker)findViewById(R.id.timepicker01);
        textView = (TextView)findViewById(R.id.tv01);

        datePicker.init(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), new DatePicker.OnDateChangedListener(){

            @Override
            //연도, 일자 => 시작점 모른다
            //월만 배열의 형태로 되어있다. => 10월을 표시하려면 인덱스는 9이다.
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String msg = String.format("%d / %d / %d",year, monthOfYear+1, dayOfMonth);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText(String.format("현재 시간은 %d : %d 입니다." , hourOfDay,minute));
            }
        });
    }
}
