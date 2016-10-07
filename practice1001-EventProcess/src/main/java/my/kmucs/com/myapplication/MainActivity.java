package my.kmucs.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements View.OnClickListener { //implemetns는 이 view에서 어디든 클릭해도 onclick함수로 가라고 정해준것.

    Button btn01, btn02, btn03;
    TextView tv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01 = (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);
        btn03 = (Button)findViewById(R.id.btn03);

        tv01 = (TextView)findViewById(R.id.tv01);




        //방법1. 리스너를 많이 등록할 때 유용하다.
       /* btn01.setOnClickListener(this);
        btn02.setOnClickListener(this); */




        /*방법2. 구현이벤트가 적고, 리스너를 [재사용]하지 않을 때
        btn01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tv01.setText("btn01 클릭");
            }
        });
        btn02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tv01.setText("btn02 클릭");
            }
        });
        */

        /* 방법3. 리스너를 [재사용]할 때 많이 사용 */
        btn01.setOnClickListener(btnListener);
        btn02.setOnClickListener(btnListener);
        btn03.setOnClickListener(btnListener);




    }


    //방법3의 구현
    View.OnClickListener btnListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn01:
                    tv01.setText("btn01 클릭");
                    break;
                case R.id.btn02:
                    tv01.setText("btn02 클릭");
                    break;
                case R.id.btn03:
                    tv01.setText("btn03 클릭");
                    break;

            }
        }
    };

    /* 4번째 방법 : xml에서 android:onClick="onclickBtn04"를 써주면 직접 클릭을 xml에서 지정할 수 있다.*/
    public void onclickBtn04(View v){
        tv01.setText("btn04 클릭");
    }


    //방법 1의 메소드
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn01:
                tv01.setText("btn01 클릭");
                break;
            case R.id.btn02:
                tv01.setText("btn02 클릭");
                break;

        }
    }

}