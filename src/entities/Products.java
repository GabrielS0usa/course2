package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Products {
	
	private String name;
	private Double price;
	private Integer qtd;
	
	public Products() {
	}
	
	public Products(String name, String price, String qtd) {
		this.name = name;
		this.price = Double.parseDouble(price);
		this.qtd = Integer.parseInt(qtd);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = Double.parseDouble(price);
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = Integer.parseInt(qtd);
	}
	
	public double total() {
		return price * qtd;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ", " + String.format("%.2f", total()));
		return sb.toString();
	}
	
	public void summary(String path2) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {
			 bw.write(toString());
			 bw.newLine();
		}
	}	
}
