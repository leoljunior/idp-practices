package br.inatel.labrest.myrestclient;

public class CursoDTO {

	private Long id;
	private String descricao;
	private Integer cargaHoraria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "CursoDTO [id=" + id + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}
}
