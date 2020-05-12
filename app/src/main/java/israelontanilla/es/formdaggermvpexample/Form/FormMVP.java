package israelontanilla.es.formdaggermvpexample.Form;

import israelontanilla.es.formdaggermvpexample.Form.Data.User;

public interface FormMVP {

    interface View{
        String getNameText();
        String getLastNameText();
        int getAgeText();
        int getNumberText();

        void setNameText(String nameText);
        void setLastNameText(String lastNameText);
        void setAgeText(int ageText);
        void setNumberText(int numberText);

        void showErrorDataForm();
        void showErrorDataUser();
        void showFormSuccesfull();

    }

    interface Presenter{
        void getDataView();
        void clickButtonEnter();
        User getDataModel();
    }

    interface Model{
        void CreateUser(String name, String lastName, int age, int number);
        User getUser(int number);
    }

}
