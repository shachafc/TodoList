package il.ac.hit.todolist;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	//	WebView webView = (WebView) this.findViewById(R.id.webView);
		WebView wv = new WebView(this);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setDomStorageEnabled(true);
		wv.loadUrl("file:///android_asset/index.html");
		setContentView(wv);
		
	}
}
