package design.patterns.mateuslima.proxy;

public class Image implements Graphic{

    @Override
    public void draw() {
        System.out.println("Executou o draw");
    }

    @Override
    public void getExtent() {
        System.out.println("Executou o getExtent");
    }
}
