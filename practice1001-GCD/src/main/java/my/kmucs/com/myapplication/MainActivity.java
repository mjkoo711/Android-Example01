package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit01, edit02;
    TextView result;
    Button btnGcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit01 = (EditText)findViewById(R.id.edit01);
        edit02 = (EditText)findViewById(R.id.edit02);
        result = (TextView)findViewById(R.id.result);
        btnGcd = (Button)findViewById(R.id.btnGCD);

        btnGcd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnGCD:
                String val1 = edit01.getText().toString();
                String val2 = edit02.getText().toString();
                result.setText(gcd(val1, val2));
                break;

            default:
                break;
        }
    }

    public String gcd(String val1, String val2) {
        if(Pattern.matches("^[0-9]+$", val1) && Pattern.matches("^[0-9]+$", val2)){
            int a = Integer.parseInt(val1);
            int b = Integer.parseInt(val2);
            int temp = 0;
            while(a != 0){
                if(a < b){
                    temp = a;
                    a = b;
                    b = temp;
                }

                a = a - b;
            }
            return String.valueOf(b);
        }
        else{
            return "해당 값은 숫자가 아닙니다.";
        }
    }
}
