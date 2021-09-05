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

public class name6Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name6);
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
                "1. 1 (28 ounce) can whole peeled tomatoes, drained\n" +
                "\n" +
                "2. 2 chipotle chiles in adobo sauce, or more to taste\n" +
                "\n" +
                "3. 1½ tablespoons vegetable oil\n" +
                "\n" +
                "4. 1 large white onion, thinly sliced\n" +
                "\n" +
                "5. 3 cloves garlic, minced\n" +
                "\n" +
                "6. 1½ cups chicken broth\n" +
                "\n" +
                "7. 1 dash roasted ground cumin\n" +
                "\n" +
                "8. 1 dash dried oregano\n" +
                "\n" +
                "9. salt and ground black pepper to taste\n" +
                "\n" +
                "10. 1 (16 ounce) package tortilla chips\n" +
                "\n" +
                "11. 1 (8 ounce) package shredded Mexican cheese blend\n" +
                "\n" +
                "12. 5 ounces crumbled cotija cheese\n" +
                "\n" +
                "13. 1 whole cooked chicken, deboned and shredded\n" +
                "\n" +
                "14. ⅔ cup chopped green onions, divided\n" +
                "\n" +
                "15. 1 cup chopped cilantro, divided\n" +
                "\n" +
                "16. 1 (8 ounce) carton sour cream, divided\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Preheat the oven to 350 degrees F (175 degrees C). Grease a large (10x15-inch) casserole dish.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Combine drained tomatoes and chipotle chiles in adobo in a blender and puree until smooth.\n" +
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
                "Heat oil in a large skillet over medium heat. Saute onion in hot oil until brown, 5 to 7 minutes. Add garlic and saute 1 minute more. Add pureed tomato-chile sauce and simmer until mixture starts to thicken. Pour in chicken broth and stir in cumin, oregano, and salt; let simmer until mixture thickens. Remove from heat.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Mix tortilla chips and tomato-chile sauce, folding carefully to cover chips completely. You may have to do this in 2 batches.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Cover the bottom of the casserole dish with half of the chip/sauce mixture. Sprinkle a layer of Mexican cheese and cotija cheese over top. Add shredded chicken to cover all of the chips and cheese. Season chicken with salt and pepper, then sprinkle with 1/2 of the green onions and 1/2 of the cilantro. Spoon 3/4 of the sour cream evenly over top. Spread with the remaining tortilla mixture then top with remaining Mexican and cotija cheeses. Cover with aluminum foil.\n" +
                "\n" +
                "Step 6\n" +
                "\n" +
                "Bake in the preheated oven until mixture is bubbly and cheese is melted, 35 to 45 minutes. Remove from the oven and let sit for 5 minutes. Serve with sour cream, green onions, and cilantro.\n" +
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