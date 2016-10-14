package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    Button btn_previous, btn_next;
    ViewFlipper flipper;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = (ViewFlipper)findViewById(R.id.flipper);

        for(int i=0 ; i<4; i++){
            ImageView img = new ImageView(this);
            //img.setImageResource(R.mipmap.game0+i);
        }

        //왼쪽에서 슬라이드가 들어오는걸 보여준다. 에니메이션 구현한것.
        //ViewFlipper가 View를 교체할 때 애니메이션이 적용되도록 설정
        //android.R.anim.slide_in_left 안드로이드가 기본으로 보유한 애니메이션
       Animation showIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        //flipper에 에니메이션을 장착하는 것이다.
        flipper.setInAnimation(showIn);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

        //자동으로 넘어가는 toggle
        toggleButton = (ToggleButton)findViewById(R.id.toggle_Auto);
        //ToggleButton에 toggle상태 변경 리스터 셋팅
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            //TogglezButton의 선택 상태가 변경되면 자동으로 호출되는 메소드
            //첫번째인자 : 선택의 변화가 생긴 CompoundButton => 토글버튼을 뜻함
            //두번째인자 ; CompoundButton의 ture(On), false(Off) 상태, 기본은 false인데 한번 누르면 true이다......
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //자동으로 next
                    flipper.setFlipInterval(1 * 1000); // 플리핑간격격
                    flipper.startFlipping();
               }
                else{
                    //stop
                    flipper.stopFlipping();
                }
            }
        });


    }

    public void mOnClick(View v){
        switch(v.getId()){
            case R.id.btn_Previous:
                flipper.showPrevious();
                break;
            case R.id.btn_Next:
                flipper.showNext();
                break;
        }
    }
}
