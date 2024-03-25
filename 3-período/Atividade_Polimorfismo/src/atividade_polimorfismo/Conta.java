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
public class Conta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}


