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

public class name2Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name2);
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
                "\n" +
                "Ingredients you need\n" +
                "\n" +
                "\n" +
                "1.\t1 cup bread crumbs\n" +
                "\n" +
                "2.\t1 (1 ounce) package dry French onion soup mix\n" +
                "\n" +
                "3.\t⅓ cup mayonnaise\n" +
                "\n" +
                "4.\t1 tablespoon garlic paste (Optional)\n" +
                "\n" +
                "5.\t4 skinless, boneless chicken breasts\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Preheat the oven to 425 degrees F (220 degrees C).\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Mix bread crumbs and dry soup mix together in a bowl.\n" +
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
                "Mix mayonnaise and garlic paste together in a separate bowl. Microwave on high to thin out consistency, 20 to 30 seconds.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Brush chicken breasts with the mayonnaise mixture. Cover with the crumb mixture. Place on a baking sheet.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Bake on the middle rack of the preheated oven until chicken is no longer pink in the center and juices run clear, about 20 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n" +
                "\n" +
                "\n" +
                "Special Note: \n" +
                "The Preheat an outdoor grill for medium heat and lightly oil the grate. Cook skewers on the preheated grill, turning occasionally, until an instant-read thermometer."+
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