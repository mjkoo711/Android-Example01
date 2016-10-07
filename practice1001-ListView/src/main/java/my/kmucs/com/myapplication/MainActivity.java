package my.kmucs.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.security.PolicySpi;

public class MainActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    //DB 데이터를 조회하는 부분
    public String[] arrMovieList = {"아수라", "밀정", "캡틴 아메리카", "부산행"};
    public String[] arrBookList = {"수학의 정석", "말하기 듣기", "채식주의자", "안드로이드책"};

    //객체생성
    Button movieBtn, bookBtn;
    ListView movieListView, bookListView;
    ArrayAdapter<String> adapter01, adapter02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieBtn = (Button)findViewById(R.id.movieBtn);
        bookBtn = (Button)findViewById(R.id.bookBtn);
        movieListView  = (ListView)findViewById(R.id.movieListView);
        bookListView = (ListView)findViewById(R.id.bookListView);

        //click
        movieBtn.setOnClickListener(this);
        bookBtn.setOnClickListener(this);

        //데이터를 장착 (adapter를 이용)
        adapter01 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arrMovieList);
        adapter02 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arrBookList);

        //ListView에 데이터를 장착
        movieListView.setAdapter(adapter01);
        bookListView.setAdapter(adapter02);

        //onitemclick 했을 시 이베트 장착
        movieListView.setOnItemClickListener(this);
        bookListView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.movieBtn:
                movieListView.setVisibility(View.VISIBLE);
                bookListView.setVisibility(View.GONE);
                break;
            case R.id.bookBtn:
                movieListView.setVisibility(View.GONE);
                bookListView.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemVal = parent.getAdapter().getItem(position).toString();
        Toast.makeText(getApplicationContext(),itemVal, Toast.LENGTH_SHORT).show();
    }
}
