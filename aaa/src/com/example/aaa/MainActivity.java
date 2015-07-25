package com.example.aaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {

	private Spinner sp1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sp1 = (Spinner) findViewById(R.id.spinner1);

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("image", R.drawable.ic_launcher);
		map1.put("text", "dajaihao");

		list.add(map1);

		SimpleAdapter sa = new SimpleAdapter(this, list, R.layout.my_spinner,
				new String[] { "image", "text" }, new int[] { R.id.imageView1,
						R.id.textView1 });
		sp1.setAdapter(sa);

		sp1.setOnItemSelectedListener(this);

	}

	private void InitSp1() {

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		if (parent.getId() == R.id.spinner1) {
			Map<String, Object> data = (Map<String, Object>) parent
					.getItemAtPosition(position);
			;
			Toast.makeText(this, (CharSequence) data.get("text"), Toast.LENGTH_SHORT).show();;

		}

	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub

	}

}
