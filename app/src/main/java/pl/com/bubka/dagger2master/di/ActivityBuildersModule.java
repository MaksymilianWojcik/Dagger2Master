package pl.com.bubka.dagger2master.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import pl.com.bubka.dagger2master.di.auth.AuthViewModelsModule;
import pl.com.bubka.dagger2master.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    //Musimy dodac @ContributesAndroidInejctor dla kazdej activity jaka bedziemy dodawac
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class}
    ) //wszedzie gdzie to uzywamy to klasa musi byc abstrackyjna
    abstract AuthActivity contributeAuthActivity();

}
