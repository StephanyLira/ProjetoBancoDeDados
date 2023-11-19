package model;

public class Usuario {
    private int id;
    private String email;
    private String senha;
    private String nome;
    private String nomeSocial;
    private String DDD;
    private String celular;
    private String dia;
    private String mes;
    private String ano;
    private String endereco;
    private String CEP;
    private String estado;
    private String numero;
    
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email) {
        this.email = email;
    }
  
    public Usuario(int id, String email, String senha, String nome, String nomeSocial, String DDD, String celular, String dia, String mes, String ano, String endereco, String CEP, String estado, String numero) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.DDD = DDD;
        this.celular = celular;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.endereco = endereco;
        this.CEP = CEP;
        this.estado = estado;
        this.numero = numero;
    }

    public Usuario(String email, String senha, String nome, String nomeSocial, String DDD, String celular, String dia, String mes, String ano, String endereco, String CEP, String estado, String numero) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.DDD = DDD;
        this.celular = celular;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.endereco = endereco;
        this.CEP = CEP;
        this.estado = estado;
        this.numero = numero;
    }

    public Usuario(String senha, String nome, String nomeSocial, String DDD, String celular, String dia, String mes, String ano, String endereco, String CEP, String estado, String numero) {
        this.senha = senha;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.DDD = DDD;
        this.celular = celular;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.endereco = endereco;
        this.CEP = CEP;
        this.estado = estado;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
