package my.kmucs.com.myapplication;

/**
 * Created by Koo on 2016-10-08.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends Activity{
    Button sub_btn01;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        sub_btn01 = (Button)findViewById(R.id.subbtn01);

        sub_btn01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        Intent getIntent = getIntent();
        /*
        String title = getIntent.getExtras().getString("title"); // 인자값은 아까 putExtra의 첫번쨰인자.
        Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();*/

        String friend = getIntent.getExtras().getString("friend","title");
        Toast.makeText(getApplicationContext(), friend, Toast.LENGTH_SHORT).show();
    }

    public void sOnClick(View v){
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("aaaa", "--------onDestroy()---------");
    }
}
