package br.com.fiap.easybeasy;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.fiap.easybeasy.adapter.TesteAdapter;
import br.com.fiap.easybeasy.model.Teste;
import br.com.fiap.easybeasy.service.TesteRest;
import br.com.fiap.easybeasy.service.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaTesteActivity extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_teste);
        final ListView listaTeste = findViewById(R.id.lista_teste);


        final TesteRest testeRest = ServiceGenerator.createService(TesteRest.class);

        dialog = new ProgressDialog(ListaTesteActivity.this);
        dialog.setMessage("Carregando...");
        dialog.setCancelable(false);
        dialog.show();

        final Call<List<Teste>> teste = testeRest.getTeste();
        teste.enqueue(new Callback<List<Teste>>() {

            @Override
            public void onResponse(Call<List<Teste>> call, Response<List<Teste>> response) {
                final List<Teste> testeResponse = response.body();
                if(testeResponse != null){
                    TesteAdapter adapter = new TesteAdapter(getBaseContext(), testeResponse);
                    listaTeste.setAdapter(adapter);
                }
            }


            @Override
            public void onFailure(Call<List<Teste>> call, Throwable t) {

                Toast.makeText(getBaseContext(), "Problema", Toast.LENGTH_LONG);

            }
        });

    }

}
