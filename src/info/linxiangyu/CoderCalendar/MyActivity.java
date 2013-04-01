package info.linxiangyu.CoderCalendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.*;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.example.CoderCalendar.R;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        WebView webView = (WebView) findViewById(R.id.webView);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        webView.loadUrl( "file:///android_asset/index.html");

    }
}
