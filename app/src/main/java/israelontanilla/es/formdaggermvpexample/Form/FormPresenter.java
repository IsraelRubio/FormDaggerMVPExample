package israelontanilla.es.formdaggermvpexample.Form;

import israelontanilla.es.formdaggermvpexample.Form.Data.User;

public class FormPresenter implements FormMVP.Presenter {

    FormMVP.Model model;
    FormMVP.View view;
    User user;


    public FormPresenter(FormMVP.Model model) {
        this.model = model;
    }

    @Override
    public void getDataView() {
        user = new User(view.getNameText() ,
                view.getLastNameText(),
                view.getAgeText(),
                view.getNumberText());
    }

    @Override
    public void clickButtonEnter() {

       model.CreateUser(view.getNameText() ,
               view.getLastNameText(),
               view.getAgeText(),
               view.getNumberText());
    }

    @Override
    public User getDataModel() {
        return model.getUser(12);
    }
}
