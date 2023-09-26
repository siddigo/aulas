package oop;

public class ItemNota {
    
    private String codigo;
    private int quantidade;
    private double valorUnitario;

    public ItemNota(){}

    public ItemNota(String codigo, int quantidade, double valorUnitario){

        setCodigo(codigo);
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

}
