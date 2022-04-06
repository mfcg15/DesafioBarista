import java.util.ArrayList;

public class Pedido 
{
    private String nombre;
    private double total;
    private boolean listo;
    private ArrayList<Articulo> items = new ArrayList<Articulo>();


	public Pedido() 
    {
		this.nombre = "invitado";
		this.items = new ArrayList<Articulo>();
	}

	public Pedido(String nombre) 
    {
		this.nombre = nombre;
	}

    /*public Pedido(String nombre, double total, boolean listo, ArrayList<Articulo> items) 
    {
		this.nombre = nombre;
		this.total = total;
		this.listo = listo;
		this.items = items;
	}*/

    public String getNombre() 
    {
		return nombre;
	}

	public void setNombre(String nombre) 
    {
		this.nombre = nombre;
	}

	public double getTotal() 
    {
		return total;
	}

	public void setTotal(double total) 
    {
		this.total = total;
	}

	public boolean isListo() 
    {
		return listo;
	}

	public void setListo(boolean listo) 
    {
		this.listo = listo;
	}

	public ArrayList<Articulo> getItems() 
    {
		return items;
	}

	public void setItems(ArrayList<Articulo> items) 
    {
		this.items = items;
	}

	public void addArticulo(Articulo articulo)
	{
		getItems().add(articulo);
	}

	public String getStatusMessage()
	{
		if(isListo())
		{
			return "Tu pedido está listo";
		}
		else
		{
			return "Gracias por esperar.Tu pedido estará listo pronto.";
		}
	}

	public void display()
    {
		double totalPedido = 0;

		System.out.println("Nombre Cliente: "+getNombre());
        for(int i = 0; i < getItems().size() ; i++)
        {
            System.out.println(getItems().get(i).getNombre()+": $"+getItems().get(i).getPrecio());
        }

		totalPedido = getOrderTotal();
		setTotal(totalPedido);
		System.out.println("Total: $"+getTotal());
		System.out.print("\n");
    }

	public double getOrderTotal() 
    {
        double sumaPrecios = 0;
        for(int i = 0; i < getItems().size() ; i++)
        {
            sumaPrecios += getItems().get(i).getPrecio();
        }

        return sumaPrecios;
    }

}
