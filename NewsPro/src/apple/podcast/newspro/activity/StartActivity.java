/**
 * 
 */
package apple.podcast.newspro.activity;

import apple.podcast.newspro.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author yangsatiago
 *启动页
 */
public class StartActivity extends Activity {

	private Thread thread;
	private Context context;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		context = this;
		setContentView(R.layout.startlayout);

		loadThread();
	}
	
	private void loadThread() {
		// TODO Auto-generated method stub
		thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);

					Intent i = new Intent();
					i.setClass(context, MainActivity.class);
					i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
					startActivity(i);
					finish();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread.start();
	}
}
