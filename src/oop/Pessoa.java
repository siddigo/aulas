package oop;

public class Pessoa {

    private String nome;
    private int idade;
    private char genero;

    public Pessoa(){}

    public Pessoa(String nome, int idade, char genero){
        
        setNome(nome);
        setIdade(idade);
        setGenero(genero);
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString(){
        String textoPessoa="";

        String nome=getNome();
        Integer idade=getIdade();
        Character genero=getGenero();

        textoPessoa=textoPessoa+"Nome:"+nome+"\n";
        textoPessoa=textoPessoa+"Idade:"+idade.toString()+"\n";
        textoPessoa=textoPessoa+"Nome:"+genero.toString();
        
        return textoPessoa;
    }

}
