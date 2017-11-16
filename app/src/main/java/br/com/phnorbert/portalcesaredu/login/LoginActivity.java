package br.com.phnorbert.portalcesaredu.login;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import br.com.phnorbert.portalcesaredu.R;
import dagger.android.support.DaggerAppCompatActivity;

public class LoginActivity extends DaggerAppCompatActivity {

    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   }

}
