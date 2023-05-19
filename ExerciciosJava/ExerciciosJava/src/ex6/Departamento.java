package ex6;

import java.util.ArrayList;
import java.util.List;

public class Departamento{
    
    String nome;
    List<Funcionario> funcionarios = new ArrayList<>();

    
    public void aumentoSalarial(){
        for (Funcionario f : funcionarios) {
            f.setSalario(f.getSalario() * 1.1);
        }
    }

    public void adicionarFuncionarios(Funcionario funcionario) throws FuncionariosException{
        if(this.funcionarios.size() == 1)        {
            throw new FuncionariosException("Quantidade máxima de funcionários já atingida!");
        }
        this.funcionarios.add(funcionario);

    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    


    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }


    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }


    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
