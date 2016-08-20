package io.donsaad.session3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> listValues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lv_names);

        listValues = new ArrayList<>();
        listValues.add("The Rock");
        listValues.add("Manchester United");
        listValues.add("ROONEY");
        listValues.add("Cantona");
        listValues.add("#POGBACK");
        listValues.add("#ZlatanTime");
        listValues.add("Android");
        listValues.add("Lollipop");
        listValues.add("Ice Cream Sandwich");
        listValues.add("Jelly Bean");
        listValues.add("Froyo");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,
                R.layout.list_item_name, listValues);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You clicked: " + listValues.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
