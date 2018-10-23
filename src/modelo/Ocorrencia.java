package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.IDInterface;

public class Ocorrencia implements IDInterface{
	private Integer id;
	private String descricao;
	private Date data;
	private String solucao;
	private Site site;
	private List<Tecnico> tecnicos = new ArrayList<Tecnico>();
	
	public Ocorrencia(String descricao, Site site) {
		super();
		setDescricao(descricao);
		setSite(site);
		setData(new Date());
	}
	
	public void solucao(String s) {
		setSolucao(s);
	}
	
	public void adicionarTecnicos(Tecnico t) {
		tecnicos.add(t);
	}
	
	public void removerTecnicos(Tecnico t) {
		tecnicos.remove(t);
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String texto = "Ocorrencia ["
			+ "id=" + id
			+ ", descricao=" + descricao
			+ ", data=" + data.toString()
			+ ", solucao=" + solucao
			+ ", site=";
		if(site != null)
			texto += site.getAlias();
		else
			texto += " vazio";
			
		texto += ", tecnicos=";
		if (tecnicos.isEmpty())
				texto += " vazio";
		else
			for (Tecnico tecnico : tecnicos) 
				texto += " " + tecnico.getNome();
		return texto + "]";	
	}
}
