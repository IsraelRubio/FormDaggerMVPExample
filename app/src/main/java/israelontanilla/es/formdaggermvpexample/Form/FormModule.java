package israelontanilla.es.formdaggermvpexample.Form;

import dagger.Module;
import dagger.Provides;
import israelontanilla.es.formdaggermvpexample.Form.Data.DataRepository;
import israelontanilla.es.formdaggermvpexample.Form.Data.DataRepositoryImplements;

@Module
public class FormModule {

    //Creo los provides de las dependecias

    @Provides
    public FormMVP.Presenter providesFormPresenter(FormMVP.Model model){
        return new FormPresenter(model);
    }

    @Provides
    public FormMVP.Model providesFormModel(DataRepository repository){
        return new FormModel(repository);
    }

    @Provides
    public DataRepository providesRepository(){
        return new DataRepositoryImplements();
    }
}
