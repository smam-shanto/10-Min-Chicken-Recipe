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

public class name3Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name3);
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
                "1.\t3 tablespoons apricot preserves\n" +
                "\n" +
                "2.\t1 teaspoon fresh ginger paste (such as Gourmet Garden™)\n" +
                "\n" +
                "3.\t½ teaspoon minced fresh rosemary\n" +
                "\n" +
                "4.\t2 (8 ounce) boneless, skinless chicken breasts\n" +
                "\n" +
                "5.\t1 teaspoon vegetable oil\n" +
                "\n" +
                "6.\tsalt and ground black pepper to taste\n" +
                "\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Stir apricot preserves, ginger paste, and rosemary together in a small bowl. Microwave for about 20 seconds to make preserves easier to spread.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Pound chicken breasts to uniform thickness and pat dry with a paper towel. Rub with oil and season with salt and pepper.\n" +
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
                "Air fry for 4 minutes. Flip and rotate the position of the chicken breasts. Brush with the apricot mixture. Return basket to the air fryer and cook until chicken is no longer pink in the center and the juices run clear, 8 to 12 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Transfer chicken to a plate, cover loosely with aluminum foil, and let sit for 5 minutes. Cut chicken breasts into slices and serve.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Transfer chicken to a plate, cover loosely with aluminum foil, and let sit for 5 minutes. Cut chicken breasts into slices and serve.\n" +
                "\n" +
                "\n" +
                "Special Note: \n" +
                "You can use 1/8 teaspoon dried rosemary instead of fresh. You will find ginger paste in a tube in the fresh produce section of your grocery store."+
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