package my.kmucs.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn01, btn02, btn03;
    Intent i1, i2, i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01 = (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);
        btn03 = (Button)findViewById(R.id.btn03);

        //장착
        btn01.setOnClickListener(btn01click);
        btn02.setOnClickListener(btn02click);
        btn03.setOnClickListener(btn03click);


        // i1 = new Intent(this, SubActivity.class); => 여기서하면 첫번째 인자에 this들어가도됌
    }

    View.OnClickListener btn01click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            //명시적 인텐트 : 권한도 풀어줘야함
            i1 = new Intent(getApplicationContext(), SubActivity.class);
            i1.putExtra("title", "인텐트로 값을 전달합니다"); //첫번째 인자는 그냥 값의 이름!
            i1.putExtra("friend", "차민준, 엄형근은 내친구");
            startActivity(i1);
        }
    };
    //암시적 인텐트(전화걸기)
    View.OnClickListener btn02click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-7453-3360"));
            startActivity(i2);
        }
    };

    //암시적 인텐트(웹페이지 이동)
    View.OnClickListener btn03click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
            startActivity(i3);
        }
    };
}
