package model;

public class PizzaSalgada extends Pizza{

    @Override
    public Double valorPizza(){
        Double valor = 0.0;

        if(getTamanho() == 'p'){
            valor = 28.0;
        }
        
        if (getTamanho() == 'm') {
            valor = 38.0;
        }
        if (getTamanho() == 'g') {
            valor = 48.0;
        }

        return valor;
    }
    
    @Override
    public String toString() {
        String pizzaSalgada = "Pizza salgada [Sabor: " + getSabor() + ", Tamanho: " + getTamanho() + ", Valor: " + valorPizza() + " ]"; 
        return pizzaSalgada;
    }
    
}
