package rbaasland.com.toughchoice;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    ListView mChoiceListView;
    String[] mValues = new String[] { "Android List View",
            "1. Adapter implementation",
            "2. Simple List View In Android",
            "3. Create List View Android",
            "4. Android Example",
            "5. List View Source Code",
            "6. List View Array Adapter",
            "7. Android Example",
            "8. List View Source Code",
            "9. List View Array Adapter",
            "10. Android Example List View",
            "11. Android Example",
            "12. List View Source Code",
            "13. List View Array Adapter",
            "14. Android Example List View",
            "15. Android Example",
            "16. List View Source Code",
            "17. List View Array Adapter",
            "18. Android Example List View",
            "19. Android Example List View"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChoiceListView = getListView();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, mValues);

        mChoiceListView.setAdapter(adapter);


        mChoiceListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition     = position;
                String  itemValue    = (String) mChoiceListView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

}