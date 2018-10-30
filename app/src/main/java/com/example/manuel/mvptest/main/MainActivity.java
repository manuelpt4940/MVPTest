package com.example.manuel.mvptest.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.manuel.mvptest.R;

/**
 * Define the View
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
    }

    // MVPView Methods //
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Sign In Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Sign Up Screen", Toast.LENGTH_SHORT).show();
    }
    //https://www.youtube.com/watch?v=G1h1qDBakBQ
}
