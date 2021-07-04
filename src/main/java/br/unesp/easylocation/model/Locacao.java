package br.unesp.easylocation.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author frank
 */
public class Locacao {

    private long idLocacao;
    private boolean status;
    private Pessoa pessoa;
    private List<ItemLocacao> itemLocacao;
    private Fatura fatura;

    public Locacao() {
        this.itemLocacao = new ArrayList<>();
    }

    public long getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(long idLocacao) {
        this.idLocacao = idLocacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<ItemLocacao> getItemLocacao() {
        return itemLocacao;
    }

    public void setItemLocacao(List<ItemLocacao> itemLocacao) {
        this.itemLocacao = itemLocacao;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.idLocacao ^ (this.idLocacao >>> 32));
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
        final Locacao other = (Locacao) obj;
        if (this.idLocacao != other.idLocacao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locacao{" + "idLocacao=" + idLocacao + ", status=" + status + 
                ", pessoa=" + pessoa + ", itemLocacao=" + itemLocacao + 
                ", fatura=" + fatura + '}';
    }

}
