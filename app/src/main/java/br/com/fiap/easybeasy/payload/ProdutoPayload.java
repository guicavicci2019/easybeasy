package br.com.fiap.easybeasy.payload;

public class ProdutoPayload {

    private Long id;
    private String nome;
    private String categoria;
    private String valor;
    private String nomeLoja;
    private String ruaLoja;
    private Integer numeroLoja;
    private String telLoja;
    private Double nota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getRuaLoja() {
        return ruaLoja;
    }

    public void setRuaLoja(String ruaLoja) {
        this.ruaLoja = ruaLoja;
    }

    public Integer getNumeroLoja() {
        return numeroLoja;
    }

    public void setNumeroLoja(Integer numeroLoja) {
        this.numeroLoja = numeroLoja;
    }

    public String getTelLoja() {
        return telLoja;
    }

    public void setTelLoja(String telLoja) {
        this.telLoja = telLoja;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
