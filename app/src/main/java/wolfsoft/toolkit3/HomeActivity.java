package wolfsoft.toolkit3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {



    public int[] IMAGE = {R.drawable.hotel1, R.drawable.hotel4, R.drawable.hotel3, R.drawable.hotel2, R.drawable.hotel1, R.drawable.hotel6, R.drawable.hotel2, R.drawable.hotel3};
    public String[] CITY = {"New York","New Jersey","New Hampshire","Nebraska","Washignton","Oakland","San Francisco","Los Angeles"};
    public String[] HOTEL = {"250 Hotels", "320 Hotels","380 Hotels", "350 Hotels", "450 Hotels", "400 Hotels","410 Hotels","480 Hotels"};



    private ArrayList<BeanClassForHomeListView> beanClassArrayList;
    private HomelistViewAdapter homelistViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);


        ListView listview = (ListView) findViewById(R.id.homelistview);
        beanClassArrayList = new ArrayList<>();


        for (int i = 0; i < IMAGE.length; i++) {

            BeanClassForHomeListView beanClass = new BeanClassForHomeListView(IMAGE[i], CITY[i], HOTEL[i]);
            beanClassArrayList.add(beanClass);

        }
        homelistViewAdapter = new HomelistViewAdapter(HomeActivity.this, beanClassArrayList);
        listview.setAdapter(homelistViewAdapter);



    }
}
