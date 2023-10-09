package oop;

public class ItemNota {
    
    private String codigo;    
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public ItemNota(){}

    public ItemNota(String codigo,String descricao, int quantidade, double valorUnitario){

        setCodigo(codigo);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setValorUnitario(valorUnitario);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
