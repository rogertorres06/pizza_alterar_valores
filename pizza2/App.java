import model.PizzaDoce;
import model.PizzaSalgada;

public class App {

    public static void main(String[] args) {
        PizzaSalgada salgada = new PizzaSalgada();

        salgada.setSabor("frango");
        salgada.setTamanho('p');

        System.out.println("A pizza escolhida é: " + salgada);

        PizzaDoce doce = new PizzaDoce();
        
        doce.setSabor("chocolate");
        doce.setTamanho('g');

        System.out.println("A pizza escolhida é: " + doce);
    }
}