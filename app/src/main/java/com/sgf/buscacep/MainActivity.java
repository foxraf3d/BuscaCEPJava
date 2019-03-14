package com.sgf.buscacep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sgf.buscacep.Modelo.Endereco;
import com.sgf.buscacep.Servico.ViaCEPServico;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity {

    private EditText CEP;
    private Button buscarCEP;
    private TextView resultadoCEP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CEP = findViewById(R.id.editCepID);
        buscarCEP = findViewById(R.id.btnBuscaCepID);
        resultadoCEP = findViewById(R.id.txtResultadoID);

        buscarCEP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Endereco endereco;
                try {
                    endereco = new ViaCEPServico(CEP.getText().toString()).execute().get();
                    resultadoCEP.setText(endereco.toString());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
