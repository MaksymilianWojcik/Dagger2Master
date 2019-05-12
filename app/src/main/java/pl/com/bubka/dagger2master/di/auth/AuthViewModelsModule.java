package pl.com.bubka.dagger2master.di.auth;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import pl.com.bubka.dagger2master.di.ViewModelKey;
import pl.com.bubka.dagger2master.ui.auth.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
