//import java.util.ArrayList;

public class TestPedidos 
{
    public static void main(String[] args) 
    {
        Articulo articulo1 = new Articulo("moka",2.700);
        Articulo articulo2 = new Articulo("latte", 1.800);
        Articulo articulo3 = new Articulo("café de goteo", 1.200);
        Articulo articulo4 = new Articulo("capuchino", 2.800);
        
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido("Cindhuri");
        Pedido pedido4 = new Pedido("Noah");
        Pedido pedido5 = new Pedido("Sam");

        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);

        pedido2.addArticulo(articulo3);
        pedido2.addArticulo(articulo1);

        pedido3.addArticulo(articulo3);
        pedido3.addArticulo(articulo4);

        pedido4.addArticulo(articulo2);
        pedido4.addArticulo(articulo3);

        pedido5.addArticulo(articulo1);
        pedido5.addArticulo(articulo2);
        
        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();

        pedido1.setListo(true);
        pedido3.setListo(true);
        pedido5.setListo(true);

        System.out.println(pedido1.getStatusMessage());
        System.out.println(pedido3.getStatusMessage());
        System.out.println(pedido5.getStatusMessage());
    
    }
}
