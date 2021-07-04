package br.unesp.easylocation.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author frank
 */
public class Fatura {

    private long idFatura;
    private double valorTotal;
    private String tipoPagamento;
    private String status;
    private Locacao locacao;
    private List<Parcela> itemFatura;

    public Fatura() {
        this.itemFatura = new ArrayList<>();
    }

    public long getIdFatura() {
        return idFatura;
    }

    public void setIdFatura(long idFatura) {
        this.idFatura = idFatura;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public List<Parcela> getItemFatura() {
        return itemFatura;
    }

    public void setItemFatura(List<Parcela> itemFatura) {
        this.itemFatura = itemFatura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.idFatura ^ (this.idFatura >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fatura other = (Fatura) obj;
        if (this.idFatura != other.idFatura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fatura{" + "idFatura=" + idFatura + ", valorTotal=" + valorTotal + ", tipoPagamento=" + tipoPagamento + ", status=" + status + ", locacao=" + locacao + ", itemFatura=" + itemFatura + '}';
    }
    
    

}
