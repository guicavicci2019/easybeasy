package br.com.fiap.easybeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.fiap.easybeasy.dao.ProdutoDAO;
import br.com.fiap.easybeasy.model.Produto;

public class FormularioActivity extends AppCompatActivity {

    private FormularioHelper formHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        formHelper = new FormularioHelper(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_formulario_ok:

                Produto produto = formHelper.getProduto();
                ProdutoDAO produtoDAO = new ProdutoDAO(this);
                produtoDAO.add(produto);
                produtoDAO.close();

                Toast.makeText(FormularioActivity.this, produto.getNome() + " salvo!", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
