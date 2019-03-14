package com.sgf.buscacep.Servico;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.sgf.buscacep.Modelo.Endereco;
import com.sgf.buscacep.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ViaCEPServico extends AsyncTask<Void, Void, Endereco> {


    public static String CEP;

    public ViaCEPServico(String cep) throws MalformedURLException {
        CEP = cep;
    }

    @Override
    protected Endereco doInBackground(Void... params) {
        StringBuilder resposta = new StringBuilder();
        try {
            URL url = new URL("http://viacep.com.br/ws/"+CEP+"/json/");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Content-type", "application/json");
            urlConnection.setRequestProperty("Accept", "application/json");
            urlConnection.setDoOutput(true);
            urlConnection.setConnectTimeout(5000);
            urlConnection.connect();

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                resposta.append(scanner.next());
            }

            return new Gson().fromJson(resposta.toString(), Endereco.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
