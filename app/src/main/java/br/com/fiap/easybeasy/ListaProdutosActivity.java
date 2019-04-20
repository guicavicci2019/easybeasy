package br.com.fiap.easybeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaProdutosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produtos);

        String[] produtos = {"Tenis Adidas", "Jaqueta de Couro"};
        ListView listaProdutos = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, produtos);
        listaProdutos.setAdapter(arrayAdapter);

        Button novoAluno = findViewById(R.id.novo_produto);
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToForm = new Intent(ListaProdutosActivity.this, FormularioActivity.class);
                startActivity(intentGoToForm);
            }
        });

    }


}
