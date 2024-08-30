package br.com.aula.text;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void calcular(View view) {
        // Instanciamento dos elementos Views
        TextInputEditText inputNome = findViewById(R.id.textInputEditNome);
        TextInputEditText inputPeso = findViewById(R.id.textInputEditPeso);
        TextInputEditText inputAltura = findViewById(R.id.textInputEditAltura);

        TextView textoResult1 = findViewById(R.id.textoResultado1);
        TextView textoResult2 = findViewById(R.id.textoResultado2);
        TextView textoResult3 = findViewById(R.id.textoResultado3);

        // Extrair String dos objetos de texto
        String nome = inputNome.getText().toString();
        String textoPeso = inputPeso.getText().toString();
        String textoAltura = inputAltura.getText().toString();

        // Fazendo a verificação dos dados, se forem inválidos, o código reconhecerá e rodará o catch, se forem válidos, rodará normalmente
        try {
            // Converter de String pra int
            double peso = Double.parseDouble(textoPeso);
            double altura = Double.parseDouble(textoAltura);
            double numImc = peso/(altura*altura);

            // Lógica para descobrir em qual categoria está o IMC
            if(numImc <= 18.5){
                textoResult3.setText("Baixo Peso");
            } else if(numImc <= 24.9){
                textoResult3.setText("Peso Normal");
            } else if(numImc <=  29.9){
                textoResult3.setText("Sobrepeso");
            } else if(numImc <= 34.9){
                textoResult3.setText("Obesidade Grau 1");
            } else if(numImc <=  39.9){
                textoResult3.setText("Obesidade Grau 2");
            } else if(numImc >=  40.0){
                textoResult3.setText("Obesidade Extrema");
            }

            // Converter o resultado e retornar os valores
            String imc = String.valueOf(numImc);
            DecimalFormat df = new DecimalFormat("#.##");
            imc = df.format(numImc);

            textoResult1.setText(nome+", seu IMC é:");
            textoResult2.setText(imc);
        } catch (Exception e) {
            // Definindo o texto de erro
            textoResult2.setText("ERRO");
            textoResult3.setText("ENTRADA INVÁLIDA");

            // Definindo a cor do texto de erro para vermelha, para dar mais destaque
            textoResult2.setTextColor(Color.RED);
            textoResult3.setTextColor(Color.RED);
        }
    }

    public void limpar(View view) {
        // Instanciamento dos elementos Views
        TextInputEditText inputNome = findViewById(R.id.textInputEditNome);
        TextInputEditText inputPeso = findViewById(R.id.textInputEditPeso);
        TextInputEditText inputAltura = findViewById(R.id.textInputEditAltura);

        TextView textoResult1 = findViewById(R.id.textoResultado1);
        TextView textoResult2 = findViewById(R.id.textoResultado2);
        TextView textoResult3 = findViewById(R.id.textoResultado3);

        // Limpando todos as entradas e saídas de texto
        inputNome.setText("");
        inputPeso.setText("");
        inputAltura.setText("");
        textoResult1.setText("");
        textoResult2.setText("");
        textoResult3.setText("");

        // Retornando a cor dos textos para preto, pois em caso de erro, estarão vermelhos
        textoResult2.setTextColor(Color.BLACK);
        textoResult3.setTextColor(Color.BLACK);
    }
}