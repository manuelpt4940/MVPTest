package com.example.manuel.mvptest.main;

/**
 * Defines the contract between the View (MainActivity)
 * and the Presenter (MainPresenter)
 */
public interface MainContract {
    interface MvpView{
        void showSignInScreen();
        void showSignUpScreen();
    }
    interface Presenter{
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }
}
