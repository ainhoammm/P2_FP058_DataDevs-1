package modelo;
import java.sql.Timestamp;


public class Pedido {
	private int numeroPedido;
	private Cliente cliente;
	private Articulo articulo;
	private int cantidad;
	private Timestamp fecha;
	
	public boolean pedidoEnviado() {
		return false;
	}

	public float precioEnvio() {
		return 0;
	}

	public Pedido(int numeroPedido, Cliente cliente, Articulo articulo, int cantidad, Timestamp fecha) {
		this.numeroPedido = numeroPedido;
		this.cliente = cliente;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", cliente=" + cliente + ", articulo=" + articulo
				+ ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
	}
	
	
	

}
