package ex6;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FuncionariosException {


        Funcionario murilo = new Funcionario();
        murilo.setNome("Murilo");
        murilo.setSalario(100);
        murilo.setDataAdmissao(LocalDate.now());

        Funcionario anaryel = new Funcionario();
        anaryel.setNome("Anaryel");
        anaryel.setSalario(100);
        anaryel.setDataAdmissao(LocalDate.of(2023, 04, 9));

        Departamento gecap12 = new Departamento();
        gecap12.setNome("DITEC - GECAP12");
        gecap12.adicionarFuncionarios(anaryel);
        
        Departamento gecap7 = new Departamento();
        gecap7.setNome("DITEC - GECAP 7");
        gecap7.adicionarFuncionarios(murilo);
        

        Empresa bancoDoBrasil = new Empresa();
        bancoDoBrasil.setCnpj("48008089000148");
        bancoDoBrasil.setNome("Banco do Brasil");
        bancoDoBrasil.adicionarDepartamentos(gecap7);
        bancoDoBrasil.adicionarDepartamentos(gecap12);
        System.out.println(bancoDoBrasil);
        bancoDoBrasil.aumentoSalarial(gecap7);
        System.out.println(bancoDoBrasil);


        



    }
}
