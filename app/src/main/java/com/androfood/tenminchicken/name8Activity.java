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

public class name8Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name8);
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
                "1.\t1 pound skinless, boneless chicken breast halves\n" +
                "\n" +
                "2.1 large egg, beaten\n" +
                "\n" +
                "3.\t ⅓ cup bread crumbs\n" +
                "\n" +
                "4.2 tablespoons grated Parmesan cheese\n" +
                "\n" +
                "5.\t ¾ teaspoon Italian seasoning\n" +
                "\n" +
                "6.\t ½ teaspoon garlic powder\n" +
                "\n" +
                "7.1 (8 ounce) can tomato sauce\n" +
                "\n" +
                "8.\t ¾ cup shredded mozzarella cheese\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Preheat the oven to 375 degrees F (190 degrees C). Grease a baking sheet.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Pound chicken breasts to 1/2-inch thickness or less.\n" +
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
                "Place beaten egg in a bowl. Combine bread crumbs, Parmesan cheese, Italian seasoning, and garlic powder in another bowl. Dip each chicken breast in egg, then roll in bread crumb mixture to coat evenly. Place on the prepared baking sheet.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Bake in the preheated oven for 10 minutes. Turn and continue to cook until chicken is no longer pink in the center and juices run clear, about 10 minutes more. Let cool, 20 to 30 minutes.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Freeze in a 1-gallon resealable bag with smaller bags of tomato sauce and mozzarella cheese.\n" +
                "\n" +
                "Step 6\n" +
                "\n" +
                "To serve: Thaw in the refrigerator overnight. Reheat chicken at 375 degrees F (190 degrees C) until heated through and crispy, 15 to 20 minutes. Top chicken with tomato sauce, sprinkle with mozzarella cheese, and bake until cheese is melted, an additional 3 minutes.\n"+
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