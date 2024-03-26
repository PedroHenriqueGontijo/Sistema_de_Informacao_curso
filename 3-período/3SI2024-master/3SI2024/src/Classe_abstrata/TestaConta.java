/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe_abstrata;

/**
 *
 * @author tulio
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta c = new Conta() {
            @Override
            void atualiza(double taxa) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: "+adc.getSaldoTotal());

    }

}
