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

public class name7Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name7);
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
                "\n" +
                "1.•\t2 skinless chicken leg quarters\n" +
                "\n" +
                "2.1 large clove garlic, crushed\n" +
                "\n" +
                "3.2 tablespoons dried rosemary, divided\n" +
                "\n" +
                "4.salt and freshly ground pepper to taste\n" +
                "\n" +
                "5.1 cup beer\n" +
                "\n" +
                "6.3 tablespoons cornstarch\n" +
                "\n" +
                "7.3 tablespoons olive oil\n" +
                "\n" +
                "8.1 medium yellow onion, halved and cut into 1/4-inch-thick slices\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Put the chicken in a large bowl with crushed garlic, 1 tablespoon rosemary, salt, and pepper. Pour beer over top and let rest for at least 30 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Remove chicken from the marinade and pat dry with paper towels. Sprinkle cornstarch over the chicken to coat it completely. Reserve the marinade.\n" +
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
                "\n" +
                "Step 3\n" +
                "\n" +
                "Heat oil in a Dutch oven over medium heat. Add chicken and brown on all sides, about 3 minutes per side. Add onion. Remove garlic from the marinade and add to the Dutch oven with a bit of marinade to keep everything from burning. Saute until onion is tender and translucent, about 5 minutes.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Add remaining marinade and remaining 1 tablespoon rosemary. Scrape the bottom of the pot to remove any browned bits. Lower the heat and simmer until the sauce has reduced and thickened and the chicken is no longer pink inside, about 15 minutes. Serve hot.\n"+
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