package io.donsaad.session3;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    private List<String> listValues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listValues = new ArrayList<>();
        listValues.add("The Rock");
        listValues.add("Manchester United");
        listValues.add("ROONEY");
        listValues.add("Cantona");
        listValues.add("#POGBACK");
        listValues.add("Android");
        listValues.add("Lollipop");
        listValues.add("Ice Cream Sandwich");
        listValues.add("Jelly Bean");
        listValues.add("Froyo");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, listValues);

        setListAdapter(myAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position == 0)
            Toast.makeText(this, "You can't click THE ROCK!",Toast.LENGTH_SHORT).show();
        else
        Toast.makeText(this, "You clicked: " + listValues.get(position),Toast.LENGTH_SHORT).show();

    }
}
