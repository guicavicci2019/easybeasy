package br.com.fiap.easybeasy;

import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

import br.com.fiap.easybeasy.model.Produto;

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoCategoria;
    private final EditText campoValor;
    private final EditText campoNomeLoja;
    private final EditText campoRuaLoja;
    private final EditText campoNumLoja;
    private final EditText campoTelLoja;
    private final RatingBar campoNota;

    public FormularioHelper (FormularioActivity activity) {

        campoNome = activity.findViewById(R.id.formulario_nome);
        campoCategoria = activity.findViewById(R.id.formulario_categoria);
        campoValor = activity.findViewById(R.id.formulario_valor);
        campoNomeLoja = activity.findViewById(R.id.formulario_loja);
        campoRuaLoja = activity.findViewById(R.id.formulario_end_loja);
        campoNumLoja = activity.findViewById(R.id.formulario_numero_loja);
        campoTelLoja = activity.findViewById(R.id.formulario_telefone_loja);
        campoNota = activity.findViewById(R.id.formulario_nota);

    }

    public Produto getProduto() {
        Produto produto = new Produto();
        produto.setNome(campoNome.getText().toString());
        produto.setCategoria(campoCategoria.getText().toString());
        produto.setValor(campoValor.getText().toString());
        produto.setNomeLoja(campoNomeLoja.getText().toString());
        produto.setRuaLoja(campoRuaLoja.getText().toString());
        produto.setNumeroLoja(Integer.getInteger(String.valueOf(campoNumLoja.getText())));
        produto.setTelLoja(campoTelLoja.getText().toString());
        produto.setNota(Double.valueOf(campoNota.getProgress()));
        return produto;

    }
}
