/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_polimorfismo;

/**
 *
 * @author host1
 */
 public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }
    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
   
}
