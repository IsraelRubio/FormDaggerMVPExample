package israelontanilla.es.formdaggermvpexample.root;

import javax.inject.Singleton;

import dagger.Component;
import israelontanilla.es.formdaggermvpexample.Form.FormModule;
import israelontanilla.es.formdaggermvpexample.Form.FormViewActivity;

//Le indico al componente que modulos voy a usar
@Singleton
@Component(modules = {ApplicationModule.class, FormModule.class})
public interface ApplicationComponent {
    // inyecto el activity o fragment en el que voy a inyectar dependencias
    void injectView(FormViewActivity context);

}
