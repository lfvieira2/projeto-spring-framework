package com.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(0, "Pessoa Física"),
	PESSOAJURIDICA(1, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDesc() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente obj : TipoCliente.values()) {
			if(cod.equals(obj.getCod())) {
				return obj;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
		
	}
}
