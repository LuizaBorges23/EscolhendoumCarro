package carros;

public class Carro {
    private String marca;
    private int ano;
    private String cor;
    private double preco;
    public Carro(String marca, int ano, String cor, double preco) {
        this.ano=ano;
        this.cor=cor;
        this.marca=marca;
        this.preco=preco;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public double getPreco() {
        return preco;
    }
    @Override
        public String toString() {
            return this.marca+" - "
                    +this.ano+" - "
                    +this.cor+" - "
                    +this.preco;
        }
    
}
