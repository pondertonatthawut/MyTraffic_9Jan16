package kmutnb.polwatthana.natthawut.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        
        //Bind Widget
        bindWidget();

        //Show View
        showView();
        
    } // Main Method

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);

        //Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailString = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(detailString[intIndex]);

    }  // showView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtShowTitle);
        detailTextView = (TextView) findViewById(R.id.txtShowDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvShowImage);

    }


} // Main Class
