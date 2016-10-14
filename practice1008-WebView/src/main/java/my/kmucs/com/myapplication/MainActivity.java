package my.kmucs.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnBack, btnFoward, btnGo;
    WebView webview;
    EditText et01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBack = (Button)findViewById(R.id.btnBack);
        btnFoward = (Button)findViewById(R.id.btnForward);
        btnGo = (Button)findViewById(R.id.btnGo);
        webview = (WebView)findViewById(R.id.webview);
        et01 = (EditText)findViewById(R.id.et01);

        //장착
        webview.setWebViewClient(new HelloWebViewClient());

        //webView에서 사용될 셋팅에 대한 정보
        WebSettings set = webview.getSettings();
        //자바스크립트사용정보 사용할래 안할래
        set.setJavaScriptEnabled(true);
        //줌인을 건다?
        set.setBuiltInZoomControls(true);

        btnGo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String url = et01.getText().toString();
                webview.loadUrl(url);
            }
        });

        btnFoward.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //webciew.canGoForward면 앞으로 갈수 있는 것이 있을때 활성화된다.
                webview.goForward();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                webview.goBack();
            }
        });

    }

    private class HelloWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
