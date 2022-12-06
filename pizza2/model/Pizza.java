package model;

public class Pizza {
    private String sabor;
    private char tamanho;
    private Double valor;
    
    
    public Pizza(String sabor, char tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        calcularValor();
    }

    public void calcularValor(){
        if (tamanho == 'p') {
            setValor(20.0);
        }
        if (tamanho == 'm') {
            setValor(30.0); 
        }
        if (tamanho == 'g') {
            setValor(40.0);
        }
    }

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public char getTamanho() {
        return tamanho;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Pizza [Sabor: %s, Tamanho: %s, Valor: %.2f]",
         getSabor(), getTamanho(), getValor());
    }
    
}