package israelontanilla.es.formdaggermvpexample.root;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application){
        this.application = application;
    }

    // Creo un provides al que le retorno la app que asigno al crear el modulo
    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
