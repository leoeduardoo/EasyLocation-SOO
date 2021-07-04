package br.unesp.easylocation.model;

import java.util.Date;
import java.util.Objects;

/**
 * 
 * @author frank
 */
public class Fisica extends Pessoa {

    private String cpf;
    private Date dataNascimento;

    public Fisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cpf);
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
        final Fisica other = (Fisica) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------------------\n");
        sb.append("Fisica [cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]" + "\n");
        sb.append(super.toString());

        return sb.toString();
    }

}
