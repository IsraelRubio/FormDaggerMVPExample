package israelontanilla.es.formdaggermvpexample.Form.Data;

public interface DataRepository {
    void addUser_bbdd(User user);
    User getUser_ddbb(int number);
    void updateUser_ddbb(User user);
    void deleteUser_ddbb(User user);
}
