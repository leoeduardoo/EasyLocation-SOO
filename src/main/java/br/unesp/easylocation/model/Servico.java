package br.unesp.easylocation.model;

/**
 * 
 * @author frank
 */
public class Servico {

    private long idServico;
    private String nome;
    private String descricao;
    private double preco;

    public Servico() {

    }

    public long getIdServico() {
        return idServico;
    }

    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.idServico ^ (this.idServico >>> 32));
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
        final Servico other = (Servico) obj;
        if (this.idServico != other.idServico) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servico{" + "idServico=" + idServico + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + '}';
    }

}
