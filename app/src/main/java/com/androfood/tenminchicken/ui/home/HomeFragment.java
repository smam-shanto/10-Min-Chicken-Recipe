package com.androfood.tenminchicken.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.androfood.tenminchicken.R;
import com.androfood.tenminchicken.name10Activity;
import com.androfood.tenminchicken.name11Activity;
import com.androfood.tenminchicken.name12Activity;
import com.androfood.tenminchicken.name1Activity;
import com.androfood.tenminchicken.name2Activity;
import com.androfood.tenminchicken.name3Activity;
import com.androfood.tenminchicken.name4Activity;
import com.androfood.tenminchicken.name5Activity;
import com.androfood.tenminchicken.name6Activity;
import com.androfood.tenminchicken.name7Activity;
import com.androfood.tenminchicken.name8Activity;
import com.androfood.tenminchicken.name9Activity;
import com.google.android.gms.ads.AdView;

public class HomeFragment<root> extends Fragment {

    private HomeViewModel homeViewModel;
    private AdView mAdView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        Button button1 = (Button) root.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name1Activity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) root.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name2Activity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) root.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name3Activity.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) root.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name4Activity.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) root.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name5Activity.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) root.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name6Activity.class);
                startActivity(intent);
            }
        });
        Button button7 = (Button) root.findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name7Activity.class);
                startActivity(intent);
            }
        });
        Button button8 = (Button) root.findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name8Activity.class);
                startActivity(intent);
            }
        });
        Button button9 = (Button) root.findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name9Activity.class);
                startActivity(intent);
            }
        });
        Button button10 = (Button) root.findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name10Activity.class);
                startActivity(intent);
            }
        });
        Button button11 = (Button) root.findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name11Activity.class);
                startActivity(intent);
            }
        });
        Button button12 = (Button) root.findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), name12Activity.class);
                startActivity(intent);
            }
        });


        return root;
    }


    }
