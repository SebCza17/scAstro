package com.example.sebastian.scastro;

import android.content.Intent;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;
import com.example.sebastian.scastro.databinding.Fragment1LayoutBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Sebastian on 16.05.2018.
 */

public class Fragment1 extends Fragment {

    private TextView textViewSunSet;
    private TextView textViewSunBefore;
    private TextView textViewDateTime;
    private Button button3;



    private Fragment1LayoutBinding fragment1LayoutBinding;
    Sun sun = new Sun();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragment1LayoutBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment1_layout, container, false);

        View view = fragment1LayoutBinding.getRoot();

        fragment1LayoutBinding.setSun(sun);

        textViewSunSet = (TextView) view.findViewById(R.id.textViewSunSet);
        textViewSunBefore = (TextView) view.findViewById(R.id.textViewBefore);
        textViewDateTime = (TextView) view.findViewById(R.id.textViewDateTime);

        button3 = (Button) view.findViewById(R.id.button3);



        return view;
    }
}
