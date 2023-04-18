package design.patterns.mateuslima.Observer;

import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro {
    @Override
    public void frente() {
        System.out.println("Viatura segue em frente.");
    }

    @Override
    public void direita() {
        System.out.println("Viatura vira a direita.");
    }

    @Override
    public void esquerda() {
        System.out.println("Viatura vira a esquerda");
    }

    @Override
    public void para() {
        System.out.println("Viatura para.");
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        CarroRoubado carroObservado = (CarroRoubado)arg0;
        String acao = String.valueOf(arg1);

        if(acao.equals("frente")) this.frente();
        else if(acao.equals("direita")) this.direita();
        else if(acao.equals("esquerda")) this.esquerda();
        else if(acao.equals("para")) this.para();

    }
}
