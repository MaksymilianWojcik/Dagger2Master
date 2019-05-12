package pl.com.bubka.dagger2master.di;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import pl.com.bubka.dagger2master.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    //Musimy dodac @ContributesAndroidInejctor dla kazdej activity jaka bedziemy dodawac
    @ContributesAndroidInjector //wszedzie gdzie to uzywamy to klasa musi byc abstrackyjna
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString(){
        return "this is a test string";
    }
}
