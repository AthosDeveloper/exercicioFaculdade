package faculdade;

import java.util.Scanner;

public class Univercidade {
    public static void main(String[] args) {

        Professor professor = new Professor("16116116-01", "166166613", "55635635", "36366526", 1500.0, "Pós-graduação", "matemática", 30);


        System.out.println(professor);


        professor.setSalario(1510.0);
        professor.aplicarReembolco();
        System.out.println(professor.getSalario());


        System.out.println(professor.aplicarReembolco());

        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo("16116116-01", "166166613", "55635635", "36366526", 1500.0, "auxiliar administrativo", "especialista");
        System.out.println(funcionario);
        funcionario.setSalario(1500.0);
        System.out.println(funcionario.getSalario());

        System.out.println(funcionario.aplicarReembolco());

        System.out.println(dadosCadastro);
    }
         }








