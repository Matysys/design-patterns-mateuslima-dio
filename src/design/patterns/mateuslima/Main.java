package design.patterns.mateuslima;

import design.patterns.mateuslima.Observer.CarroPolicia;
import design.patterns.mateuslima.Observer.CarroRoubado;
import design.patterns.mateuslima.factory.Polygon;
import design.patterns.mateuslima.factory.PolygonFactory;
import design.patterns.mateuslima.proxy.Graphic;
import design.patterns.mateuslima.proxy.Image;
import design.patterns.mateuslima.proxy.ImageProxy;

/**
 *
 * @Author Mateus Moreira Lima
 *
 */

public class Main {
    public static void main(String[] args) {

        /* FACTORY (padrão de criação) */
        System.out.println("Padrão FACTORY\n");

        //Insira o número de lados do polígono dentro dos parâmetros do método estático abaixo.
        Polygon polygon = PolygonFactory.createPolygon(3);
        Polygon polygon2 = PolygonFactory.createPolygon(4);
        Polygon polygon3 = PolygonFactory.createPolygon(5);

        //Mostra a descrição do polígono
        System.out.println(polygon.getDescription());
        System.out.println(polygon2.getDescription());
        System.out.println(polygon3.getDescription());

        //Pula linha para o próximo padrão
        System.out.println("");

        //--------------------------------------------------------

        /* PROXY (padrão estrutural) */
        System.out.println("Padrão PROXY\n");
        //Usando o proxy de Image
        Graphic g = new ImageProxy(new Image());
        g.draw();
        g.getExtent();

        //Sem utilizar o proxy de image
        Image i = new Image();
        i.draw();
        i.getExtent();

        //Pula linha para o próximo padrão
        System.out.println("");

        //---------------------------------------------------------

        /* OBSERVER (padrão comportamental) */
        System.out.println("Padrão OBSERVER\n");

        //Observador
        CarroPolicia carroPolicia = new CarroPolicia();

        //Observado
        CarroRoubado carroRoubado = new CarroRoubado();

        //Adicionar observador ao observado
        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.frente();
        carroRoubado.para();


    }
}