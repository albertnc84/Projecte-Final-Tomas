package Model;

import java.util.Vector;



public class Autobus {

  public String matricula;

  public String model;

  public int capacitat;

    public Companyia myCompanyia;
    public Vector  myTrajecte1;
    public Trajecte myTrajecte;
    
	public Autobus(String matricula, String model, int capacitat) {
		super();
		this.matricula = matricula;
		this.model = model;
		this.capacitat = capacitat;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(int capacitat) {
		this.capacitat = capacitat;
	}

  

}