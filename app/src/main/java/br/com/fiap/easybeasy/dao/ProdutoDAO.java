package br.com.fiap.easybeasy.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import br.com.fiap.easybeasy.model.Produto;

public class ProdutoDAO extends SQLiteOpenHelper {

    public ProdutoDAO(Context context) {
        super(context, "easybeasy", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Produtos (id INTEGER PRIMARY KEY, nome TEXT, categoria TEXT, valor TEXT, nome_loja TEXT, rua_loja TEXT, numero_loja INTEGER," +
                " telefone_loja TEXT, nota REAL);";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Produtos";
        db.execSQL(sql);
        onCreate(db);

    }

    public void add(Produto produto) {

        SQLiteDatabase db = getWritableDatabase();
        ContentValues produtoDb = new ContentValues();
        produtoDb.put("nome", produto.getNome());
        produtoDb.put("categoria", produto.getCategoria());
        produtoDb.put("valor", produto.getValor());
        produtoDb.put("nome_loja", produto.getNomeLoja());
        produtoDb.put("rua_loja", produto.getRuaLoja());
        produtoDb.put("numero_loja", produto.getNumeroLoja());
        produtoDb.put("telefone_loja", produto.getTelLoja());
        produtoDb.put("nota", produto.getNota());


        db.insert("Produtos", null, produtoDb);

    }

    //public List<Produto> getProdutos() {

        //String


   // }
}
