package br.unesp.easylocation.model;

import java.util.Date;

/**
 * 
 * @author frank
 */
public class Parcela {

    private int idItemFatura;
    private int numeroParcela;
    private Date dataVencimento;
    private Date dataPagamento;
    private double valor;
    private double multa;
    private double juros;
    private Fatura fatura;

    public Parcela() {

    }

    public int getIdItemFatura() {
        return idItemFatura;
    }

    public void setIdItemFatura(int idItemFatura) {
        this.idItemFatura = idItemFatura;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.idItemFatura;
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
        final Parcela other = (Parcela) obj;
        if (this.idItemFatura != other.idItemFatura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parcela{" + "idItemFatura=" + idItemFatura + ", numeroParcela="
                + numeroParcela + ", dataVencimento=" + dataVencimento
                + ", dataPagamento=" + dataPagamento + ", valor=" + valor
                + ", multa=" + multa + ", juros=" + juros + ", fatura=" + fatura + '}';
    }

}
