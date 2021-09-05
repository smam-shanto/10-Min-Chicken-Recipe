package com.androfood.tenminchicken.ui.slideshow;

import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.androfood.tenminchicken.R;

public class SlideshowFragment extends Fragment {
    TextView textView;

    private SlideshowViewModel slideshowViewModel;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        TextView textView = root.findViewById(R.id.text_slideshow);

        Toolbar toolbar = (Toolbar) root.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        textView = (TextView) root.findViewById(R.id.textView);
        String pera = "10 min Chicken Recipe is an international food recipes app. This free recipe app provides a collection of a variety of yummy, delicious and healthy dishes from different regions of the world. Recipes may differ mainly depends on the region, festivals, some religious beliefs, etc. Instead of using cooking books you can use this all recipes app to explore tasty dishes. Cook some mouth-watering recipes and feel the joy of cooking.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Table of Contents\n" +
                "\n" +
                "Greek Chicken Skewers\n" +
                "\n" +
                "French Onion-Breaded Baked Chicken\n" +
                "\n" +
                "Air Fryer Apricot-Glazed Chicken Breasts\n" +
                "\n" +
                "Sheet Pan Sweet and Sour Chicken\n" +
                "\n" +
                "Broiled Paprika and Lemon-Pepper Chicken Breasts\n" +
                "\n" +
                "Anne's Chicken Chilaquiles Rojas\n" +
                "\n" +
                "Pollo alla Birra for Two\n" +
                "\n" +
                "Make-Ahead Freezer Chicken Parmesan\n" +
                "\n" +
                "Juicy Roasted Chicken\n" +
                "\n" +
                "Baked Chicken Schnitzel\n" +
                "\n" +
                "Aussie Chicken\n" +
                "\n" +
                "Winter Chicken Bake\n" +
                "\n" +
                "\n" +
                "\n" +
                "Cut down on the cooking time with these quick and easy to make food recipes. All recipes use simple ingredients that are easily available and inexpensive. If you are interesting in learning how to cook healthy and yet simple recipes, you are in the right place.\n" +
                "\n" +
                "\n" +
                "All recipes, text and photographs in this app are credited to their authors. Please address any copyright concerns to the developer email below.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "©10 min Chicken Recipe\n" +
                "\n" +
                "Developed by\n" +
                "Smam Shanto\n" +
                "sshanto005@gmail.com\n";
        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());
        return root;
    }
    private void setSupportActionBar(Toolbar toolbar) {

    }

}