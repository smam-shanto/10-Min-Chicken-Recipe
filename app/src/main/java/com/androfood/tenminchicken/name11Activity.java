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

public class name11Activity extends AppCompatActivity {
    TextView textView;
    private AdView mAdView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name11);
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
                "1.4 skinless, boneless chicken breast halves - pounded to 1/2 inch thickness\n" +
                "\n" +
                "2.2 teaspoons seasoning salt\n" +
                "\n" +
                "3.6 slices bacon, cut in half\n" +
                "\n" +
                "4.\t ½ cup prepared yellow mustard\n" +
                "\n" +
                "5.\t ½ cup honey\n" +
                "\n" +
                "6.\t ¼ cup light corn syrup\n" +
                "\n" +
                "7.\t ¼ cup mayonnaise\n" +
                "\n" +
                "8.1 tablespoon dried onion flakes\n" +
                "\n" +
                "9.1 tablespoon vegetable oil\n" +
                "\n" +
                "10.1 cup sliced fresh mushrooms\n" +
                "\n" +
                "11.2 cups shredded Colby-Monterey Jack cheese\n" +
                "\n" +
                "12.2 tablespoons chopped fresh parsley\n" +
                "\n" +
                "\n" +
                "How to cook? \n" +
                "\n" +
                "Step 1\n" +
                "\n" +
                "Rub the chicken breasts with the seasoning salt, cover and refrigerate for 30 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "\n" +
                "Preheat oven to 350 degrees F (175 degrees C). Place bacon in a large, deep skillet. Cook over medium high heat until crisp. Set aside.\n" +
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
                "In a medium bowl, combine the mustard, honey, corn syrup, mayonnaise and dried onion flakes. Remove half of sauce, cover and refrigerate to serve later.\n" +
                "\n" +
                "Step 4\n" +
                "\n" +
                "Heat oil in a large skillet over medium heat. Place the breasts in the skillet and saute for 3 to 5 minutes per side, or until browned. Remove from skillet and place the breasts into a 9x13 inch baking dish. Apply the honey mustard sauce to each breast, then layer each breast with mushrooms and bacon. Sprinkle top with shredded cheese.\n" +
                "\n" +
                "Step 5\n" +
                "\n" +
                "Bake in preheated oven for 15 minutes, or until cheese is melted and chicken juices run clear. Garnish with parsley and serve with the reserved honey mustard sauce.\n" +
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