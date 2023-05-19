package ex6;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    String nome;
    String cnpj;
    List<Departamento> departamentos = new ArrayList<>();
    
    void aumentoSalarial(Departamento departamento){
        departamento.aumentoSalarial();
    }
    
    void adicionarDepartamentos(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", departamentos=" + departamentos + "]";
    }

    
    

}
