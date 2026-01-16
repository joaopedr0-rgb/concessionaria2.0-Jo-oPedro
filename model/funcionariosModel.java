package model;

public class funcionariosModel {
    private String nome;

    private String cargo;

    private String email;

    private int idade;
    public funcionariosModel(String nome, String cargo, String email, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.idade = idade;
    }

    
    public String getNome(){    
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }


    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
