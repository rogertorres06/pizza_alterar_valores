package model;

public class PizzaDoce extends Pizza{
  
    @Override
    public Double valorPizza() {
        Double valor = 0.0;

        if(getTamanho() == 'p'){
            valor = 18.0;
        }
        
        if (getTamanho() == 'm') {
            valor = 28.0;
        }
        if (getTamanho() == 'g') {
            valor = 38.0;
        }

        return valor;
    }

    @Override
    public String toString(){
        return "Pizza doce [Sabor: " + getSabor() + ", Tamanho: " + getTamanho() + ", Valor: " + valorPizza() + " ]";
    }
}
