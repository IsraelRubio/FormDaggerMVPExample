package israelontanilla.es.formdaggermvpexample.Form.Data;

public class DataRepositoryImplements implements DataRepository {
    @Override
    public void addUser_bbdd(User user) {
        User user_bbdd = user;
    }

    @Override
    public User getUser_ddbb(int number) {
        return new User("Israel", "Rubio", 21, 75);
    }

    @Override
    public void updateUser_ddbb(User user) {
        user = new User("Israel", "Rubio", 21, 75);
    }

    @Override
    public void deleteUser_ddbb(User user) {
        user = null;
    }
}
