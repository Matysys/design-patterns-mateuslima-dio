package design.patterns.mateuslima.factory;
/*

Criando a classe que vai servir para usar o design pattern Factory

 */
public class PolygonFactory {

    public static Polygon createPolygon(int numberOfSides){
        if(numberOfSides == 3) return new Triangle();
        else if(numberOfSides == 4) return new Square();
        else if(numberOfSides == 5) return new Pentagon();

        return null;
    }

}
