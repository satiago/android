/**
 * 
 */
package apple.podcast.newspro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import apple.podcast.newspro.R;

/**
 * @author yangsatiago
 *
 */
public class ListItemLayout extends RelativeLayout {

	private Context context;
	private TextView text;
	
	public ListItemLayout(Context context) {
		this(context, null);
		// TODO Auto-generated constructor stub
	}

	public ListItemLayout(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
		// TODO Auto-generated constructor stub
	}

	public ListItemLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		this.context = context;
		
		LayoutInflater.from(context).inflate(R.layout.listitemlayout, this, true);
		
		text = (TextView) findViewById(R.id.listTitle);
	}

	/**
	 * @return the text
	 */
	public String getTitle() {
		return (String) this.text.getText();
	}

	/**
	 * @param text the text to set
	 */
	public void setTitle(String title) {
		this.text.setText(title);
	}
}
