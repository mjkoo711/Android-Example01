package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar01;
    RatingBar ratingBar05;
    TextView tv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar01 = (RatingBar)findViewById(R.id.ratingBar01);
        ratingBar05 = (RatingBar)findViewById(R.id.ratingBar05);
        tv01 = (TextView)findViewById(R.id.tv01);

        //별 움직이는 단위
        ratingBar01.setStepSize((float)1);

        //ratingbar05의 속성 정하기 -=>좀이상함..
        ratingBar05.setNumStars(7);
        ratingBar05.setRating((float)3); //이건안되는데? =>float를 넣어줘야
        ratingBar05.setStepSize((float)0.5);
        ratingBar05.setIsIndicator(true);
        //ratingBar05.setMax(7);

        ratingBar01.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv01.setText("평점 : " + rating);
            }
        });
    }
}
