package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    //dummy 데이터
    String[] autoList = new String[]{
            "apple", "ahh", "aria", "account", "admin", "bee","cat", "dog"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adWord = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, autoList); //3번째 인자 : 장착될 인자들 (dummy data)

        AutoCompleteTextView autoCom01 = (AutoCompleteTextView)findViewById(R.id.autoCom01);
        autoCom01.setAdapter(adWord);
    }
}
