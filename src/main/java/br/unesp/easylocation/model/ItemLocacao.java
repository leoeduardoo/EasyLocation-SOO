package br.unesp.easylocation.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author frank
 */
public class ItemLocacao implements Serializable {

    private int idItemLocacao;
    private Date dataLocacao;
    private Date dataPrevistaDevolucao;
    private Date dataDevolucao;
    private double kmDevolucao;
    private double kmRetirada;
    private int numeroDiarias;
    private double valorUnitario;
    private Double totalPagar;
    private Locacao locacao;
    private Carro carro;
    private Servico servico;

    public ItemLocacao() {
    }

    public int getIdItemLocacao() {
        return idItemLocacao;
    }

    public void setIdItemLocacao(int idItemLocacao) {
        this.idItemLocacao = idItemLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getKmDevolucao() {
        return kmDevolucao;
    }

    public void setKmDevolucao(double kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    public double getKmRetirada() {
        return kmRetirada;
    }

    public void setKmRetirada(double kmRetirada) {
        this.kmRetirada = kmRetirada;
    }

    public int getNumeroDiarias() {
        return numeroDiarias;
    }

    public void setNumeroDiarias(int numeroDiarias) {
        this.numeroDiarias = numeroDiarias;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idItemLocacao;
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
        final ItemLocacao other = (ItemLocacao) obj;
        if (this.idItemLocacao != other.idItemLocacao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemLocacao{" + "idItemLocacao=" + idItemLocacao + 
                ", dataLocacao=" + dataLocacao + ", dataPrevistaDevolucao=" + 
                dataPrevistaDevolucao + ", dataDevolucao=" + dataDevolucao + 
                ", kmDevolucao=" + kmDevolucao + ", kmRetirada=" + kmRetirada + 
                ", numeroDiarias=" + numeroDiarias + ", valorUnitario=" + 
                valorUnitario + ", totalPagar=" + totalPagar + ", locacao=" + 
                locacao + ", carro=" + carro + ", servico=" + servico + '}';
    }

}
