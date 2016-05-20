package syamsul.unsyiah.ac.id.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String listCountry[]=new String[]{"afghanistan","bangladesh","china",
    "india","japan","nepal","nkorea","pakistan","skorea","srilanka"
    };
    Integer imageName[]={R.drawable.afghanistan,R.drawable.bangladesh,R.drawable.china,R.drawable.india
    ,R.drawable.japan,R.drawable.nepal,R.drawable.nkorea,R.drawable.pakistan,R.drawable.skorea,R.drawable.srilanka};

    ListView listView;
    List<RowItem> rowItems;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rowItems = new ArrayList<RowItem>();
        for(int i=0; i<listCountry.length;i++){
            RowItem item = new RowItem(imageName[i],listCountry[i]);
            rowItems.add(item);
        }

        listView= (ListView) findViewById(R.id.listView);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,R.layout.list_view,rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast toast = Toast.makeText(getApplicationContext(),"Item"+(position+1)+": "+rowItems.get(position),Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();

    }
}
