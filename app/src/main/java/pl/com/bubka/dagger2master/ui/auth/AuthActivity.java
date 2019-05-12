package pl.com.bubka.dagger2master.ui.auth;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import androidx.lifecycle.ViewModelProviders;
import dagger.android.support.DaggerAppCompatActivity;
import pl.com.bubka.dagger2master.R;
import pl.com.bubka.dagger2master.viewmodels.ViewModelProviderFactory;

public class AuthActivity extends DaggerAppCompatActivity {


    private static final String TAG = "AuthActivity";

    private AuthViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        viewModel = ViewModelProviders.of(this, providerFactory).get(AuthViewModel.class);

        setLogo();
    }

    private void setLogo() {
        requestManager
                .load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }
}
