package gsb.modele.dao;

import gsb.modele.Localite;
import gsb.modele.Medicament;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;



public class MedicamentDao {
	public static Medicament rechercher(String codeMedicament){
		Medicament unMedicament=null;
		Localite uneLocalite= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from MEDECIN where CODEMED ='"+codeMedicament+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = LocaliteDao.rechercher(reqSelection.getString(6));
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getFloat(5), reqSelection.getInt(6), reqSelection.getString(7), reqSelection.getString(8));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from MEDECIN where CODEMED ='"+codeMedecin+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;

}
