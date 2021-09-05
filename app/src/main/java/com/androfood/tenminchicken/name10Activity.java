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

public class name10Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name10);
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
                "1.\t1 tablespoon olive oil, or as desired\n" +
                "\n" +
                "2.6 chicken breasts, cut in half lengthwise (butterflied)\n" +
                "\n" +
                "3.salt and ground black pepper to taste\n" +
                "\n" +
                "4.\t ¾ cup all-purpose flour\n" +
                "\n" +
                "5.1 tablespoon paprika\n" +
                "\n" +
                "6.2 eggs, beaten\n" +
                "\n" +
                "7.2 cups seasoned bread crumbs\n" +
                "\n" +
                "8.1 large lemon, zested\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Preheat oven to 425 degrees F (220 degrees C). Line a large baking sheet with aluminum foil and drizzle olive oil over foil. Place baking sheet in preheated oven.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Flatten chicken breasts so they are all about 1/4-inch thick. Season chicken with salt and pepper.\n" +
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
                "Mix flour and paprika together on a large plate. Beat eggs with salt and pepper in a shallow bowl. Mix bread crumbs and lemon zest together on a separate large plate. Dredge each chicken piece in flour mixture, then egg, and then bread crumbs mixture and set aside in 1 layer on a clean plate. Repeat with remaining chicken.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Remove baking sheet from oven and arrange chicken in 1 layer on the sheet. Drizzle more olive oil over each piece of coated chicken.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Bake in the preheated oven for 5 to 6 minutes. Flip chicken and continue baking until no longer pink in the center and the breading is lightly browned, 5 to 6 minutes more. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n" +
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