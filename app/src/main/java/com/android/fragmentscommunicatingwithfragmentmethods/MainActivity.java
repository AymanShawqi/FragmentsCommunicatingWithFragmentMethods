package com.android.fragmentscommunicatingwithfragmentmethods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.fragmentscommunicatingwithfragmentmethods.myFragments.DemoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DemoFragment mDemoFragment;
    private EditText nameEditText;
    private EditText ageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState==null){
            mDemoFragment=new DemoFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frg_container,mDemoFragment)
                    .commit();
        }
        nameEditText=findViewById(R.id.name_editText);
        ageEditText=findViewById(R.id.age_editText);
        Button submitBtn=findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name=nameEditText.getText().toString();
        String ageStr=ageEditText.getText().toString();
        int age=0;
        if (!ageStr.isEmpty()){
            age=Integer.parseInt(ageStr);
        }
        mDemoFragment.sayHello(name,age);
    }
}
