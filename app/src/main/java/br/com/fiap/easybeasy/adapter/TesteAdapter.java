package br.com.fiap.easybeasy.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

import br.com.fiap.easybeasy.R;
import br.com.fiap.easybeasy.model.Teste;

public class TesteAdapter extends ArrayAdapter<Teste> {

    private final Context context;
    private final List<Teste> teste;

    public TesteAdapter(Context context, List<Teste> teste) {
        super(context, R.layout.linha, teste);
        this.context = context;
        this.teste = teste;
    }
}
