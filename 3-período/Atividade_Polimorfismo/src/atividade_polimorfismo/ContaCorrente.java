/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_polimorfismo;

/**
 *
 * @author host
 */
public class ContaCorrente extends Conta {

private double saldo;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
}
