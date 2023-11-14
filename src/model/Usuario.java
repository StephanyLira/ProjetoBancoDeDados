
package model;

/**
 *
 * @author steph
 */
public class Usuario {
    private int id;
    private String email;
    private String senha;
    private String nome;
    private String nomeSocial;
    private int DDD;
    private int celular;
    private int dia;
    private String mes;
    private int ano;
    private String endereco;
    private int CEP;
    private String estado;
    private int numero;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(int id, String email, String senha, String nome, String nomeSocial, int DDD, int celular, int dia, String mes, int ano, String endereco, int CEP, String estado, int numero) {
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
    
    
    public Usuario(String email, String senha, String nome, String nomeSocial, int DDD, int celular, int dia, String mes, int ano, String endereco, int CEP, String estado, int numero) {
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

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    
    
    
    
    
}
