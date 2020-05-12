package israelontanilla.es.formdaggermvpexample.root;

import android.app.Application;

import israelontanilla.es.formdaggermvpexample.Form.FormModule;

public class App extends Application {

    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        // instancio el componente, con los modulos que voy a emplear
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .formModule(new FormModule())
                .build();
    }


    public ApplicationComponent getApplicationComponent(){ return component; }

}
