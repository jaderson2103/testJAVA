/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 /**
 *
 * @author trollador
 */
 
package jenkins;

/** importando os metodos de suas classes */
import jenkins.Imposto;
import jenkins.Orcamento;
import org.junit.Assert;
import org.junit.Test;

public class ImpostoTest {
    
    public void CalculaImpostoDeDezPorcento() {
        Orcamento orcamento = new Orcamento(100.0);
        Imposto imposto = new Imposto();
        Assert.assertEquals((double)10.0, (double)imposto.calcula(orcamento), (double)Double.MIN_VALUE);
    }
}
