/**
 * 
 */
package apple.podcast.newspro.activity;

import apple.podcast.newspro.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import apple.podcast.newspro.app.Constants;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * @author yangsatiago
 *
 */

public class MainActivity extends FragmentActivity {

	private WebView web;
	private Button leftButton;
	private Button rightButton;
	private Context context;

	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		
		context = this;
		setContentView(R.layout.mainlayout);
		
		initWebView();
		initListener();
	}

	private void initListener() {
		// TODO Auto-generated method stub
		leftButton = (Button) findViewById(R.id.aboutButton);
		rightButton = (Button) findViewById(R.id.refreashButton);
		
		leftButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(context, AboutActivity.class);
				startActivity(i);
			}
		});
		
		rightButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				web.loadUrl(Constants.HOME_URL);
			}
		});
	}

	private void initWebView() {
		// TODO Auto-generated method stub
		//设置首页的网页显示
		web = (WebView) findViewById(R.id.webView);
		web.setWebViewClient(new WebViewClient());
		web.loadUrl(Constants.HOME_URL);
	}

	
}
