package com.example.navigationdrawerfragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyAccount extends AppCompatActivity implements NavigationFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        NavigationFragment.menuIndex = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
