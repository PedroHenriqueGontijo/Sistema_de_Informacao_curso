package model;
public class Cliente {
    private String nome_cliente;
    private float valorvend;
    private String datacompra;
    private String produtonome;


    
    public Cliente(String nome_cliente, float valorvend, String datacompra, String produtonome) {
        this.nome_cliente = nome_cliente;
        this.valorvend = valorvend;
        this.datacompra = datacompra;
        this.produtonome = produtonome;
    }
    
    public String getNome_cliente() {
        return nome_cliente;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public float getValorvend() {
        return valorvend;
    }
    public void setValorvend(float valorvend) {
        this.valorvend = valorvend;
    }
    public String getDatacompra() {
        return datacompra;
    }
    public void setDatacompra(String datacompra) {
        this.datacompra = datacompra;
    }
    public String getProdutonome() {
        return produtonome;
    }
    public void setProdutonome(String produtonome) {
        this.produtonome = produtonome;
    }
    
    
}

