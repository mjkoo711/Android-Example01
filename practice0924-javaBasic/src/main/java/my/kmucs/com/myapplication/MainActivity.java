package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv01 = (TextView)findViewById(R.id.tv01);
        String str = "변하는 수 , 즉 변수";
        tv01.setText(str);

        String val = "변수 값을 변경했습니다.";
        tv01.setText(val);

        String[] arrMovie = {"캡틴 아메리카", "밀정", "아수라", "부산행"};
        for(int i=0 ; i<arrMovie.length ; i++) {
            if (arrMovie[i].equalsIgnoreCase("아수라"))
                Log.d("SBSLOG i :", arrMovie[i] + "");
        }
    }
}
