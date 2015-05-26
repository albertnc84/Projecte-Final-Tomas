package Model;

import java.util.Date;
import java.util.Vector;


public class Trajecte {

  public String origen;

  public String desti;

  public String id_trajecte;

  public Date data_so;

  public String hora_so;

  public Date data_arr;

      public Autobus myAutobus;
      /**
   * 
   * @element-type Passatger
   */
  public Vector  Reserva;

  
  public Trajecte(String origen, String desti, String id_trajecte,
			Date data_so, String hora_so, Date data_arr, Vector reserva) {
		super();
		this.origen = origen;
		this.desti = desti;
		this.id_trajecte = id_trajecte;
		this.data_so = data_so;
		this.hora_so = hora_so;
		this.data_arr = data_arr;
		Reserva = reserva;
	}


public void trajecte() {
  }


public String getOrigen() {
	return origen;
}


public void setOrigen(String origen) {
	this.origen = origen;
}


public String getDesti() {
	return desti;
}


public void setDesti(String desti) {
	this.desti = desti;
}


public String getId_trajecte() {
	return id_trajecte;
}


public void setId_trajecte(String id_trajecte) {
	this.id_trajecte = id_trajecte;
}


public Date getData_so() {
	return data_so;
}


public void setData_so(Date data_so) {
	this.data_so = data_so;
}


public String getHora_so() {
	return hora_so;
}


public void setHora_so(String hora_so) {
	this.hora_so = hora_so;
}


public Date getData_arr() {
	return data_arr;
}


public void setData_arr(Date data_arr) {
	this.data_arr = data_arr;
}


public Vector getReserva() {
	return Reserva;
}


public void setReserva(Vector reserva) {
	Reserva = reserva;
}


}