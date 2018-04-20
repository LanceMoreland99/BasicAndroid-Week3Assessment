package com.example.rodneytressler.week3assessmentkey;

import android.accounts.Account;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.welcome_textView)
    protected TextView welcomeText;
    @BindView(R.id.worldFate_textView)
    protected TextView worldFateText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        welcomeText.setVisibility(View.INVISIBLE);
        worldFateText.setVisibility(View.INVISIBLE);

    }
    @Override
    protected void onStart(){
        super.onStart();
        AccountFragment accountFragment = AccountFragment.newInstance();
        accountFragment.attachParent(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.).commit();

    }
    @Override
    protected void userAccount(String userName, String accountClass){

        welcomeText.setVisibility(View.VISIBLE);
        welcomeText.setText(getString(R.string.what_is_your_name), R.string.are_you_a_mage_warrior_or_archer);

        worldFateText.setVisibility(View.VISIBLE);
        worldFateText.setText(getString(R.string.the_fate_of_the_world_is_in_your_hands));
    }

}
