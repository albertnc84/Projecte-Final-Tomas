package Model;


public class BegudaSnack {

  public int codi;

  public String descripcio;

  public int preu;

public BegudaSnack(int codi, String descripcio, int preu) {
	super();
	this.codi = codi;
	this.descripcio = descripcio;
	this.preu = preu;
}

public int getCodi() {
	return codi;
}

public void setCodi(int codi) {
	this.codi = codi;
}

public String getDescripcio() {
	return descripcio;
}

public void setDescripcio(String descripcio) {
	this.descripcio = descripcio;
}

public int getPreu() {
	return preu;
}

public void setPreu(int preu) {
	this.preu = preu;
}

  
}