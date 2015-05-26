package Model;

import java.util.Vector;


public class Reserva {

  public int preu;

  public int seient;

    /**
   * 
   * @element-type Passatger
   */
  
  
  public Vector  BegudaSnack;

  public Reserva(int preu, int seient, Vector begudaSnack) {
		super();
		this.preu = preu;
		this.seient = seient;
		BegudaSnack = begudaSnack;
	}


  public void reserva() {
  }


public int getPreu() {
	return preu;
}


public void setPreu(int preu) {
	this.preu = preu;
}


public int getSeient() {
	return seient;
}


public void setSeient(int seient) {
	this.seient = seient;
}


public Vector getBegudaSnack() {
	return BegudaSnack;
}


public void setBegudaSnack(Vector begudaSnack) {
	BegudaSnack = begudaSnack;
}

  
}