package model;
public class estoque{

    private String qnome;
    private String qpreco_custo;
    private int qtd_disponivel;


    

    

    
    public estoque(String qnome, String qpreco_custo, int qtd_disponivel) {
        this.qnome = qnome;
        this.qpreco_custo = qpreco_custo;
        this.qtd_disponivel = qtd_disponivel;
    }
    public String getQnome() {
        return qnome;
    }
    public void setQnome(String qnome) {
        this.qnome = qnome;
    }
    public String getQpreco_custo() {
        return qpreco_custo;
    }
    public void setQpreco_custo(String qpreco_custo) {
        this.qpreco_custo = qpreco_custo;
    }


    public int getQtd_disponivel() {
        return qtd_disponivel;
    }


    public void setQtd_disponivel(int qtd_disponivel) {
        this.qtd_disponivel = qtd_disponivel;
    }



    
   
    
    
}
