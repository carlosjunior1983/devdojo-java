package br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.service;

import br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.domain.Computador;
import br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImpostoService {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto Computador!");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto tomate!");
        double imposto = tomate.calcularImposto();
        System.out.println("tomate: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }
}
