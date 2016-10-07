package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01 = (Button)findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText et01 = (EditText)findViewById(R.id.et01);
                String str = et01.getText().toString();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

                ImageView img01 = (ImageView)findViewById(R.id.image01);

                if(img01.getVisibility() == View.VISIBLE){
                    img01.setVisibility(View.INVISIBLE);
                }
                else{
                    img01.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
