package com.android.fragmentscommunicatingwithfragmentmethods.myFragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.fragmentscommunicatingwithfragmentmethods.R;

public class DemoFragment extends Fragment {

    private TextView mTextView;

    public DemoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView=view.findViewById(R.id.welcome_msg);
    }

    public void sayHello(String name,int age){
        StringBuilder builder=new StringBuilder("Welcome ");
        builder.append(name);
        builder.append(" Your Age is ");
        builder.append(age);
        mTextView.setText(builder.toString());
    }
}
