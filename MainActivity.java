package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declarção das variaveis para os obletos e dos dados //

    int peso;
    float altura;
    float imc;
    String mensagem = " ";

    // Declarando os objetos//

    EditText editPeso;
    EditText editAltura;
    TextView txtResultado;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = (EditText)findViewById(R.id.peso);
        editAltura = (EditText)findViewById(R.id.altura);
        txtResultado = (TextView) findViewById(R.id.Resultado);
        btnCalcular = (Button) findViewById(R.id.calcul);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // recuperando os valores//

                peso = Integer.parseInt(editPeso.getText().toString());
                altura = Float.parseFloat(editAltura.getText().toString());

                // Calculando IMC//

                imc = peso / (altura * altura);

                //Faixas de Pesos(usando if)//


                if (imc < 19) {
                    mensagem = "Abaixo do Peso";

                } else if ((imc >= 19) && (imc < 25)) {
                    mensagem = "Abaixo do Peso";
                } else if ((imc >= 20) && (imc < 24.9)) {
                    mensagem = "Peso Ideal";
                } else if ((imc >= 25) && (imc < 29.9)) {
                    mensagem = "Obesidade Leve";
                } else if ((imc >= 30) && (imc < 39.9)) {
                    mensagem = "Obesidade Moderada";
                }


                if ((imc >= 43)) {
                    mensagem = "Obesidade Morbida";

                }else if(false == imc.isCheked() && mulher.isCheked() == true){
                    if(imc < 19){
                        mensagem = "Abaixo do Peso";
                    }else if((imc >= 19) && (imc < 23.9)){
                        mensagem = "Peso Ideal";
                    }else if((imc >= 24) && (imc < 28.9)){
                        mensagem = "Obesidade Leve";
                    }else if((imc >=29) && (imc < 38.9)){
                        mensagem = "Obesidade Moderada";
                    }if((>= 39))
                        mensagem = "Obesidade Morbida";
                }





                // resultado para o usuario//
                {
                    txtResultado.setText("IMC:"String.valueOf(imc) + "\nMensagem: " + mensagem);
                }
            }
        });





    }
}
