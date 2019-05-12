package pl.com.bubka.dagger2master.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import javax.inject.Singleton;

import androidx.core.content.ContextCompat;
import dagger.Module;
import dagger.Provides;
import pl.com.bubka.dagger2master.R;

@Module
public class AppModule { //ta juz nie bedzie abstract, bo w tej nie bedziemy uzywac @ContributresAndroidInjector
    // tutaj umieszczam dependency dla calej apki

    @Singleton
    @Provides
    static RequestOptions provideRequestOptions(){
        return new RequestOptions()
                .placeholder(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    @Singleton
    @Provides //mamy dostep do application w tym module dzieki @BidnsIntance w AppComponencie
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }

//    @Provides
//    static String someString(){ //sttic jest bardziej efficient, pewnie daltego ze mniej kodu generuje :)
//        return "this is a test string";
//    }
//
//    @Provides
//    static boolean getApp(Application application){ //mamy dostep tu do application dzieki temu, ze w AppComponeni dalismy nad Applciation @BinsdInstnace i dalismy applciaiton jako argument`
//        return application == null;
//    }
}
