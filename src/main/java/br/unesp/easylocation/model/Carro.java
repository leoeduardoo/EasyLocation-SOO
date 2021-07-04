package br.unesp.easylocation.model;

/**
 * 
 * @author frank
 */
public class Carro {

    private long idCarro;
    private String nome;
    private String placa;
    private String marca;
    private int ano;
    private double quilometragem;
    private boolean patrimonio;
    private String status;
    private int maxDiasLocacao;
    private ItemLocacao itemLocacao;
    private Categoria categoria;

    public Carro() {

    }

    public long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(long idCarro) {
        this.idCarro = idCarro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(boolean patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMaxDiasLocacao() {
        return maxDiasLocacao;
    }

    public void setMaxDiasLocacao(int maxDiasLocacao) {
        this.maxDiasLocacao = maxDiasLocacao;
    }

    public ItemLocacao getItemLocacao() {
        return itemLocacao;
    }

    public void setItemLocacao(ItemLocacao itemLocacao) {
        this.itemLocacao = itemLocacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.idCarro ^ (this.idCarro >>> 32));
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
        final Carro other = (Carro) obj;
        if (this.idCarro != other.idCarro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" + "idCarro=" + idCarro + ", nome=" + nome
                + ", placa=" + placa + ", marca=" + marca + ", ano="
                + ano + ", quilometragem=" + quilometragem + ", patrimonio="
                + patrimonio + ", status=" + status + ", maxDiasLocacao="
                + maxDiasLocacao + ", itemLocacao=" + itemLocacao
                + ", categoria=" + categoria + '}';
    }

}
