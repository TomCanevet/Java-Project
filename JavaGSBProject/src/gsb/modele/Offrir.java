package gsb.modele;

public class Offrir {
	   protected  Medicament unMedicament;
	   protected  Visite uneVisite;
	   protected  int qteOfferte;
	  
public Offrir(Medicament unMedicament, Visite uneVisite, int qteOfferte)
	{
		this.unMedicament = unMedicament;
		this.uneVisite = uneVisite;
		this.qteOfferte = qteOfferte;
	}
}
