package com.androfood.tenminchicken;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class name5Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name5);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView = (TextView) findViewById(R.id.textView);
        String pera = "\n" +
                "Ingredients you need\n" +
                "\n" +
                "1.\t2 ½ tablespoons extra-virgin olive oil, divided\n" +
                "\n" +
                "2.\t2 skinless, boneless chicken breast halves\n" +
                "\n" +
                "3.\t2 tablespoons paprika\n" +
                "\n" +
                "4.\t1 tablespoon lemon-pepper seasoning\n" +
                "\n" +
                "5.\t1 tablespoon kosher salt\n" +
                "\n" +
                "6.\t2 cloves garlic, smashed and finely chopped\n" +
                "\n" +
                "7.\t½ medium onion, chopped\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Set an oven rack about 6 inches from the heat source and preheat the oven's broiler. Grease a broiler pan with 1/2 tablespoon olive oil.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Rinse chicken breasts and pat dry. Brush with remaining olive oil until coated. Sprinkle each piece evenly on both sides with paprika, lemon-pepper, and salt. Place on the prepared broiler pan, sprinkle garlic over top, and sprinkle onions around the base of the chicken, with several smaller pieces on top.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Step 3\n" +
                "\n" +
                "Cook under the preheated broiler for 5 minutes. Flip and continue to cook, checking often, until no longer pink in the center and the juices run clear, 5 to 10 more minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n" +
                "\n" +
                "\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
    private void setSupportActionBar(Toolbar toolbar) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBodyText = "Check it out. Your message goes here";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}