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

public class name4Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name4);
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
                "1.\t2 (8 ounce) cans pineapple tidbits in juice\n" +
                "\n" +
                "2.\t1 red bell pepper, seeded and cut into 1-inch pieces\n" +
                "\n" +
                "3.\t1 green bell pepper, seeded and cut into 1-inch pieces\n" +
                "\n" +
                "4.\t1 carrot, peeled and sliced diagonally\n" +
                "\n" +
                "5.\t½ red onion, cut into 1-inch pieces\n" +
                "\n" +
                "6.\t3 tablespoons avocado oil\n" +
                "\n" +
                "7.\tsalt and ground black pepper to taste\n" +
                "\n" +
                "8.\t1 ½ pounds skinless, boneless chicken breast, cut into 1-inch pieces\n" +
                "\n" +
                "9.\twater as needed\n" +
                "\n" +
                "10.\t2 tablespoons cornstarch\n" +
                "\n" +
                "11.\t½ cup light brown sugar\n" +
                "\n" +
                "12.\t⅓ cup rice vinegar\n" +
                "\n" +
                "13.\t3 tablespoons ketchup\n" +
                "\n" +
                "14.\t3 tablespoons soy sauce\n" +
                "\n" +
                "15.\t1 tablespoon chile-garlic sauce\n" +
                "\n" +
                "16.\t1 tablespoon ginger-garlic paste\n" +
                "\n" +
                "17.\t⅛ teaspoon ground white pepper\n" +
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
                "Drain pineapple tidbits and place juice into a 1-cup liquid measure. Place drained pineapple in a large mixing bowl; set aside.\n" +
                "\n" +
                "Step 3\n" +
                "\n" +
                "Add bell peppers, carrot, and onion to the pineapple tidbits. Pour 2 tablespoons avocado oil over top and sprinkle with salt and pepper. Stir until coated with oil and seasoning, then spread in a single layer on a sheet pan. Place chicken into the same bowl, drizzle with remaining 1 tablespoon oil, and season with salt and pepper. Toss to coat and nestle chicken pieces on the sheet pan between the pineapple and vegetable pieces.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Bake in the preheated oven until vegetables are tender and chicken is cooked through, about 25 minutes.\n" +
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
                "Step 5\n" +
                "\n" +
                "Meanwhile, add enough water to the reserved pineapple juice to make 1 cup liquid. Transfer 3 tablespoons of the liquid to a small bowl and add cornstarch. Stir with a fork or whisk until smooth.\n" +
                "\n" +
                "Step 6\n" +
                "\n" +
                "Pour remaining liquid into a saucepan with brown sugar, rice vinegar, ketchup, soy sauce, chile-garlic sauce, ginger-garlic paste, and white pepper. Bring to a boil, stirring occasionally, over medium-high heat. Slowly add cornstarch mixture, whisking briskly. Return to a boil and allow to thicken, whisking constantly, about 1 minute.\n" +
                "\n" +
                "Step 7\n" +
                "\n" +
                "Drizzle chicken, pineapple, and vegetables with sauce to serve.\n" +
                "\n" +
                "\n" +
                "Special Note: \n" +
                "You can use any neutral-flavored cooking oil for avocado oil. To save time, instead of making the sauce, you may also use canned Asian sweet and sour sauce."+
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