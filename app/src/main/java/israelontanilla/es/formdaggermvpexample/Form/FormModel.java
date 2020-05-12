package israelontanilla.es.formdaggermvpexample.Form;

import israelontanilla.es.formdaggermvpexample.Form.Data.DataRepository;
import israelontanilla.es.formdaggermvpexample.Form.Data.User;

public class FormModel implements FormMVP.Model {

    DataRepository data;

    public FormModel(DataRepository dataRepository) {
        this.data = dataRepository;
    }


    @Override
    public void CreateUser(String name, String lastName, int age, int number) {
        data.addUser_bbdd(new User(name, lastName, age, number));
    }

    @Override
    public User getUser(int number) {
        return data.getUser_ddbb(number);
    }
}
