package oop;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class NotaFiscal {
    
    private int numero;
    private int serie;
    private int tipoNota;
    private int cnpjEmissor;
    private int cpfCnpjDestinatario;
    private Date dataEmissao;;
    private double valorTotal;
    private List<ItemNota> itens = new ArrayList<>();

    public NotaFiscal(){ }

    public NotaFiscal(int numero, int serie){
        setNumero(numero);
        setSerie(serie);
        Date data = new Date();
        setDataEmissao(data);
    }

    public void addItem(String codigo, String descricao, int quantidade, double valorUnitario){
        
        List<ItemNota> itens = new ArrayList<>();
        itens=getItens();

        ItemNota item = new ItemNota(codigo,descricao,quantidade,valorUnitario);
        itens.add(item);

        double valorTotalItem=quantidade*valorUnitario;

        double valorTotalNota=getValorTotal();
        valorTotalNota+=valorTotalItem;

        setValorTotal(valorTotalNota);
        setItens(itens);
    }

    public void removeItem(String codigo, String descricao, int quantidade, double valorUnitario){
        
        List<ItemNota> itens = new ArrayList<>();
        itens=getItens();

        ItemNota item = new ItemNota(codigo,descricao,quantidade,valorUnitario);
        
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

    public List<ItemNota> getItens() {
        return itens;
    }

    public void setItens(List<ItemNota> itens) {
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
        Double total=getValorTotal();

        List<ItemNota>itens= new ArrayList<>(getItens());

        String descricao="Nota Fiscal ";
        descricao+=serie.toString()+" || "+numero.toString();
        descricao+="\n\n";

        for (int i = 0; i < itens.size(); i++) {

            String codigo=itens.get(i).getCodigo();
            String name=itens.get(i).getDescricao();
            Integer quantidade=itens.get(i).getQuantidade();
            Double valorUnitario=itens.get(i).getValorUnitario();
            Double valorTotalItem=valorUnitario*quantidade;
            
            descricao+="( "+codigo+" ) "+name+" -\t"+quantidade+" x "+valorUnitario+"\t= "+valorTotalItem+"\n";

        }

        descricao+="\n";

        descricao+="Total = "+total.toString();
        return descricao;
    }
}
