package br.giovanninibarbosa.dogage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ageEdt;
    private TextView ageResultxt;
    private Button  calcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageEdt = (EditText)findViewById(R.id.insertage_edtxt);
        ageResultxt = (TextView)findViewById(R.id.txtView_result);
        calcBtn = (Button)findViewById(R.id.calcage_btn);


        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero = ageEdt.getText().toString();

                if (numero.isEmpty() ){


                } else {

                    int numeroDigitado = Integer.parseInt(numero);
                    int idadeDog = numeroDigitado * 7;
                    ageResultxt.setText("A idade do cachorro em anos humanos é: " + idadeDog + " anos.");

                }



            }
        });


    }
}
