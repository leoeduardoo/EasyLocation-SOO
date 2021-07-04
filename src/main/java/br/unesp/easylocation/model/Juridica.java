package br.unesp.easylocation.model;

import java.util.Objects;

/**
 * 
 * @author frank
 */
public class Juridica extends Pessoa {

    private String cnpj;

    public Juridica() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cnpj);
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
        final Juridica other = (Juridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------------------\n");
        sb.append("Juridica [cnpj=" + cnpj + "]" + "\n");
        sb.append("Pessoa=" + super.toString());

        return sb.toString();
    }
}
