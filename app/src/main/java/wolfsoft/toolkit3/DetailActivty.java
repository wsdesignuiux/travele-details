package wolfsoft.toolkit3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by admin on 5/3/2016.
 */
public class DetailActivty extends Activity implements View.OnClickListener {

    LinearLayout location;
    TextView changeLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        changeLocation = (TextView) findViewById(R.id.changeLocation);
        location =(LinearLayout) findViewById(R.id.location);



        location.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        final CharSequence[] items = {
                "Afghanistan", "Africa", "Argentine", "Brazil", "Canada", "China", "France", "Germany", "Hong-Kong",
                "India", "Japan", "Mexico", "Nepal", "New Zealand", "Pakistan", "Philippines","Saudi Arabia","South Africa"
                ,"Spain","United States","Zambia","Zimbabwe"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Change Your Location");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                // Do something with the selection
                changeLocation.setText(items[item]);
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

    }
}