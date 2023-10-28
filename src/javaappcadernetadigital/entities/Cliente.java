package javaappcadernetadigital.entities;

import java.util.List;
import java.util.Objects;
import javaappcadernetadigital.enums.TipoCliente;

public class Cliente {
    private Long id;
    private String nome;
    private String CPF;
    private String telefone;
    private String email;
    private TipoCliente tipo;
    //private List<Venda> venda;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String CPF, String telefone, String email, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    public void consultarCliente(){
        System.out.println("===============================");
        System.out.println("========== CLIENTE ============");
        System.out.println("Nome----: "+this.getNome());
        System.out.println("CPF-----: "+this.getCPF());
        System.out.println("Telefone: "+this.getTelefone());
        System.out.println("Email---: "+this.getEmail());
        System.out.println("Tipo----: "+this.getTipo()); 
    }
}
