package kmutnb.polwatthana.natthawut.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Ecplicit
    private ListView trafficListView;
    private Button aboutMeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();
    }  // Main Method

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonmediaplayer = MediaPlayer.create(getBaseContext(),
                        R.raw.bird_maxican);
                buttonmediaplayer.start();

                //Intent to ActionView
                Intent objintent = new Intent(Intent.ACTION_VIEW);
                objintent.setData(Uri.parse("https://youtu.be/BxuY9FET9Y4"));
                startActivity(objintent);



            } // Event
        });
    }  // buttonController

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}  // Main Class
