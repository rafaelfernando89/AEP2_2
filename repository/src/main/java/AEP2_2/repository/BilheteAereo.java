package AEP2_2.repository;

import java.util.Date;

public class BilheteAereo {
	
	private int id;
	private Integer voo;
	private String origem;
	private Date data;
	
	public BilheteAereo (int id, Integer voo, String origem, Date data ) {
		this.id = id;
		this.voo = voo;
		this.origem = origem;
		this.data = data;
		
	}
	
	public int getId() {
		return id;
	}
	
	public Integer getVoo() {
		return voo;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public Date getData() {
		return data;
	}

}
