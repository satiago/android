/**
 * 
 */
package apple.podcast.newspro.activity;

import apple.podcast.newspro.R;
import apple.podcast.newspro.ui.ListItemLayout;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * @author yangsatiago
 *
 */
public class AboutActivity extends Activity {

	private Button leftButton;
	private ListView list;
	private Context context;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		context = this;
		setContentView(R.layout.aboutlayout);
		
		leftButton = (Button) findViewById(R.id.backButton);
		list = (ListView) findViewById(R.id.listView);
		
		initListView();
		initListener();

	}

	private void initListView() {
		// TODO Auto-generated method stub
		final String[] titleArr = {"用户信息", "软件信息"};
//		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.listitemlayout, R.id.listTitle, titleArr);
		BaseAdapter listAdapter = new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				
				ListItemLayout listItemView = new ListItemLayout(context);
				
				//RelativeLayout listItemView = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.listitemlayout, parent, true);
				
				listItemView.setTitle(titleArr[position]);
				return listItemView;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return position;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return titleArr.length;
			}
		};
		
		list.setAdapter(listAdapter);
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
		
		list.setOnItemClickListener(new OnItemClickListener() {

			/* (non-Javadoc)
			 * @see android.widget.AdapterView.OnItemClickListener#onItemClick(android.widget.AdapterView, android.view.View, int, long)
			 */
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				if (position == 0)
				{
					Intent i = new Intent(context, UserActivity.class);
					startActivity(i);
				}
				
				if (position == 1) 
				{
					Intent i = new Intent(context, SoftActivity.class);
					startActivity(i);
				}
				
			}
		});
	}

	
}
