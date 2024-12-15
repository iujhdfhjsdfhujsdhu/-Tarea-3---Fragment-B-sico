package com.example.tarea3_fragmentbsico;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;
    private Button buttonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos de la UI
        editTextInput = findViewById(R.id.editTextInput);
        buttonUpdate = findViewById(R.id.buttonUpdate);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el texto del formulario
                String inputText = editTextInput.getText().toString();

                // Crear instancia del Fragment y pasar el texto como argumento
                Bundle bundle = new Bundle();
                bundle.putString("textKey", inputText);

                MyFragment fragment = new MyFragment();
                fragment.setArguments(bundle);

                // Reemplazar el contenedor con el Fragment
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .commit();
            }
        });
    }
}
