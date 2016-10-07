package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //객체선언
        Button btn01 = (Button)findViewById(R.id.fbtn01);

        //버튼이 길게 클릭할 때 실행되는 부분
        btn01.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "롱 클릭", Toast.LENGTH_SHORT).show();
                return false; //false는 클릭과 롱클릭이 같이 일어난다.
            }
        });

        //버튼이 짧게 클릭할 때 실행되는 부분
        btn01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ImageView img01 = (ImageView)findViewById(R.id.fimg01);

                //조건문
                if(img01.getVisibility() == View.VISIBLE){
                    img01.setVisibility(View.INVISIBLE);

                    //Toast의 위치를 옮기고 싶을때,
                    Toast toast = Toast.makeText(getApplicationContext(), "조건이 참, 이미지 안보임", Toast.LENGTH_SHORT);
                    int offSetX = 0;
                    int offSetY = 0;
                    toast.setGravity(Gravity.CENTER, offSetX, offSetY);
                    toast.show();
                }
                else { //Image가 보이지 않고 있을때
                    img01.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "조건이 거짓, 이미지 보임", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
