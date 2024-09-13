package ejercicio3.ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ejercicio3.ejercicio3.*;
@SuppressWarnings("unused")
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double resultado = 0;
		for (Item aux : this.items) {
			resultado += aux.costo();
		}
		return resultado;
	}
}
