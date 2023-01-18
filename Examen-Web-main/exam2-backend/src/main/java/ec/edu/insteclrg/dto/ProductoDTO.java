package ec.edu.insteclrg.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long id;

	private String nombre;
	
	CategoriaDTO category;
}
