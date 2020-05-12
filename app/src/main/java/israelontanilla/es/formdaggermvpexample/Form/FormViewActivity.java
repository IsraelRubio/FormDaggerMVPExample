package israelontanilla.es.formdaggermvpexample.Form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import israelontanilla.es.formdaggermvpexample.R;
import israelontanilla.es.formdaggermvpexample.root.App;

public class FormViewActivity extends AppCompatActivity implements FormMVP.View {

    EditText editName, editLastName, editAge, editNumber;
    Button button_enter;

    // Inyecto las dependecias del presenter, que posee las dependencias del modelo, que es el proveedor de datos
    // y este a su vez de su interfaz
    @Inject
    FormMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Injecto la activity a la app, para poder inyectar dependencias
        ((App)getApplication()).getApplicationComponent().injectView(this);

        editName = findViewById(R.id.editName);
        editLastName = findViewById(R.id.editLastName);
        editAge = findViewById(R.id.editAge);
        editNumber = findViewById(R.id.editNumber);

        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickButtonEnter();
            }
        });

    }

    @Override
    public String getNameText() {
        return editName.getText().toString();
    }

    @Override
    public String getLastNameText() {
        return editLastName.getText().toString();
    }

    @Override
    public int getAgeText() {
        return Integer.getInteger(editAge.getText().toString());
    }

    @Override
    public int getNumberText() {
        return Integer.getInteger(editNumber.getText().toString());
    }

    @Override
    public void setNameText(String nameText) {
        editName.setText(nameText);
    }

    @Override
    public void setLastNameText(String lastNameText) {
        editLastName.setText(lastNameText);
    }

    @Override
    public void setAgeText(int ageText) {
        editAge.setText(ageText);
    }

    @Override
    public void setNumberText(int numberText) {
        editNumber.setText(numberText);
    }

    @Override
    public void showErrorDataForm() {
        Toast.makeText(this, "Error en el formulario", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorDataUser() {
        Toast.makeText(this, "Error al ingresar el usuario", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFormSuccesfull() {
        Toast.makeText(this, "El ingreso a sido exitoso", Toast.LENGTH_SHORT).show();
    }
}
