package pl.com.bubka.dagger2master.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule { //ta juz nie bedzie abstract, bo w tej nie bedziemy uzywac @ContributresAndroidInjector
    // tutaj umieszczam dependency dla calej apki

    @Provides
    static String someString(){ //sttic jest bardziej efficient, pewnie daltego ze mniej kodu generuje :)
        return "this is a test string";
    }

    @Provides
    static boolean getApp(Application application){ //mamy dostep tu do application dzieki temu, ze w AppComponeni dalismy nad Applciation @BinsdInstnace i dalismy applciaiton jako argument`
        return application == null;
    }
}
