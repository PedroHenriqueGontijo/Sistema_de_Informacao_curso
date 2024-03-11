package model;
        public class produto {
        private String nome;
        private int quantidade;
        private double preco_Venda;
        private double preco_custo;


        
        public produto(String nome, int quantidade, double preco_Venda, double preco_custo) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco_Venda = preco_Venda;
            this.preco_custo = preco_custo;
        }
        
        public produto() {
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
        public double getPreco_Venda() {
            return preco_Venda;
        }
        public void setPreco_Venda(double preco_Venda) {
            this.preco_Venda = preco_Venda;
        }
        public double getPreco_custo() {
            return preco_custo;
        }
        public void setPreco_custo(double preco_custo) {
            this.preco_custo = preco_custo;
        }
    
    
    }