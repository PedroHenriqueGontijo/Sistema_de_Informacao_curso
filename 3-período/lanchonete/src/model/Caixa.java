package model;
import Cliente;
public class Caixa {
    
    private String form_pagamento;
    private Float qtd_produtosvend;
    private Float valor_total;

Cliente cliente =  new Cliente();

public void nota_fiscal () {

     
}
    public Caixa(String form_pagamento, Float qtd_produtosvend, Float valor_total) {
        this.form_pagamento = form_pagamento;
        this.qtd_produtosvend = qtd_produtosvend;
        this.valor_total = valor_total;
    }
     



public String getForm_pagamento() {
        return form_pagamento;
    }
    public void setForm_pagamento(String form_pagamento) {
        this.form_pagamento = form_pagamento;
    }
    public Float getQtd_produtosvend() {
        return qtd_produtosvend;
    }
    public void setQtd_produtosvend(Float qtd_produtosvend) {
        this.qtd_produtosvend = qtd_produtosvend;
    }
    public Float getValor_total() {
        return valor_total;
    }
    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

 }
