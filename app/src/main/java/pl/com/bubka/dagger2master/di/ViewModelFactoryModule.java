package pl.com.bubka.dagger2master.di;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import pl.com.bubka.dagger2master.viewmodels.ViewModelProviderFactory;

@Module
public abstract class ViewModelFactoryModule { //odpowiedzialen za tworzenie dependency dla viewmodelow

    @Binds //zamist tego moglibysmy uzyc normalnie @Provides, ale roznica taka ze to jest bardizej efficient szczegolnei ze nic w ciele tej metody tutaj nie robimy
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

}
