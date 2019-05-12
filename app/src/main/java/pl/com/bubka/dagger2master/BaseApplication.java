package pl.com.bubka.dagger2master;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import pl.com.bubka.dagger2master.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build(); //ta .application to jest ta metoda application wewnatrz AppComponent
    }

}
