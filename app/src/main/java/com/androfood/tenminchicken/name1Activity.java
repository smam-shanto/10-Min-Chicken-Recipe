package com.androfood.tenminchicken;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class name1Activity extends AppCompatActivity {
    TextView textView;
    Button button;
    private Object CalendarView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name1);
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
                "1.\t¼ cup lemon juice\n" +
                "\n" +
                "2.\t¼ cup wok oil\n" +
                "\n" +
                "3.\t⅛ cup red wine vinegar\n" +
                "\n" +
                "4.\t1 tablespoon onion flakes\n" +
                "\n" +
                "5.\t1 tablespoon minced garlic\n" +
                "\n" +
                "6.\t1 lemon, zested\n" +
                "\n" +
                "7.\t1 teaspoon Greek seasoning\n" +
                "\n" +
                "8.\t1 teaspoon poultry seasoning\n" +
                "\n" +
                "9.\t1 teaspoon dried oregano\n" +
                "\n" +
                "10.\t1 teaspoon ground black pepper\n" +
                "\n" +
                "11.\t½ teaspoon dried thyme\n" +
                "\n" +
                "12.\t3 skinless, boneless chicken breasts, or as needed, cut into 1-inch pieces\n" +
                "\n" +
                "13.\t8 bamboo skewers, or as needed, soaked in water for 30 minutes\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Whisk lemon juice, oil, vinegar, onion flakes, garlic, lemon zest, Greek seasoning, poultry seasoning, oregano, pepper, and thyme together in a bowl and pour into a resealable plastic bag.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Add chicken, coat with the marinade, squeeze out excess air, and seal the bag. Marinate in the refrigerator for at least 2 hours.\n" +
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
                "Preheat the oven to 350 degrees F (175 degrees C).\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Remove chicken from the marinade and shake off excess; thread onto skewers. Discard the remaining marinade. Place the skewers on a baking sheet.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Roast in the preheated oven until golden brown, about 20 minutes.\n" +
                "\n" +
                "\n" +
                "Special Note: \n" +
                "The skewers can also be cooked on the grill. Preheat an outdoor grill for medium heat and lightly oil the grate. Cook skewers on the preheated grill, turning occasionally, until an instant-read thermometer inserted into the center reads at least 165 degrees F (74 degrees C).\n"+
                "\n" +
                "\n" +
                "\n";
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