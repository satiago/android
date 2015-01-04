/**
 * 
 */
package apple.podcast.newspro.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import apple.podcast.newspro.R;
import apple.podcast.newspro.app.Constants;

/**
 * @author yangsatiago
 *
 */
public class UserActivity extends Activity {

	private TextView title;
	private Button leftButton;
	private WebView web;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.userlayout);
		
		title = (TextView) findViewById(R.id.titleView);
		leftButton = (Button) findViewById(R.id.backButton);
		web = (WebView) findViewById(R.id.webView);
		
		title.setText("用户信息");
		
		initWebView();
		initListener();
	}

	private void initListener() {
		// TODO Auto-generated method stub
		leftButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	private void initWebView() {
		// TODO Auto-generated method stub
		//设置首页的网页显示
		web = (WebView) findViewById(R.id.webView);
		web.setWebViewClient(new WebViewClient());
		web.loadUrl(Constants.USER_URL);
	}
}
