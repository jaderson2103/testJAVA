/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;

/**
 *
 * @author trollador
 */

import jenkins.Orcamento;
import java.io.PrintStream;

public class Imposto {
    public double calcula(Orcamento orcamento) {
        System.out.println("teste");
        return orcamento.getValor() * 0.1;
    }
}