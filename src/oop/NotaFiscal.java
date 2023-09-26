package oop;

import java.util.Date;
import java.util.ArrayList;

public class NotaFiscal {
    
    private int numero;
    private int serie;
    private int tipoNota;
    private int cnpjEmissor;
    private int cpfCnpjDestinatario;
    private Date dataEmissao;;
    private double valorTotal;
    private ArrayList<ItemNota> itens = new ArrayList<>();

    public NotaFiscal(){ }

    public NotaFiscal(int numero, int serie){
        setNumero(numero);
        setSerie(serie);
        Date data = new Date();
        setDataEmissao(data);
    }

    public void addItem(String codigo, int quantidade, double valorUnitario){
        
        ArrayList<ItemNota> itens = new ArrayList<>();
        itens=getItens();

        ItemNota item = new ItemNota(codigo,quantidade,valorUnitario);
        itens.add(item);

        double valorTotalItem=quantidade*valorUnitario;

        double valorTotalNota=getValorTotal();
        valorTotalNota+=valorTotalItem;

        setValorTotal(valorTotalNota);
        setItens(itens);
    }

    public void removeItem(String codigo, int quantidade, double valorUnitario){
        
        ArrayList<ItemNota> itens = new ArrayList<>();
        itens=getItens();

        ItemNota item = new ItemNota(codigo,quantidade,valorUnitario);
        
        double valorTotalNota=getValorTotal();

        if(itens.contains(item)){
            itens.remove(item);
            double valorTotalItem=quantidade*valorUnitario;
            valorTotalNota+=valorTotalItem;
        }
       
        setValorTotal(valorTotalNota);
        setItens(itens);
    }

    public String imprimir(){
        String impressao="";
        String numeroSerie=this.toString();
        impressao=numeroSerie+"\nEmissor: "+getCnpjEmissor();

        return impressao;
    }

    public int getCnpjEmissor() {
        return cnpjEmissor;
    }

    public void setCnpjEmissor(int cnpjEmissor) {
        this.cnpjEmissor = cnpjEmissor;
    }

    public int getCpfCnpjDestinatario() {
        return cpfCnpjDestinatario;
    }

    public void setCpfCnpjDestinatario(int cpfCnpjDestinatario) {
        this.cpfCnpjDestinatario = cpfCnpjDestinatario;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ArrayList<ItemNota> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemNota> itens) {
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(int tipoNota) {
        this.tipoNota = tipoNota;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString(){

        Integer numero=getNumero();
        Integer serie=getSerie();

        String descricao=serie.toString()+" || "+numero.toString();

        return descricao;
    }
}
