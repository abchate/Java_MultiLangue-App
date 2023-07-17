package sujet;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToCSV {

	public SaveToCSV(String name, String mobile, String gender, String date, String address) {
		String csvFile = "enregistrement.csv";
		FileWriter writer = null;

		String path = "C:\\Users\\ABCHATI\\eclipse-workspace\\AbchateAliIbrahim\\src\\enregistrement.csv";
		try {
			writer = new FileWriter(path, true);

			writer.append(name);
			writer.append(",");
			writer.append(mobile);
			writer.append(",");
			writer.append(gender);
			writer.append(",");
			writer.append(date);
			writer.append(",");
			writer.append(address);
			writer.append("\n");

			System.out.println("Données enregistrées avec succès dans " + csvFile);

		} catch (IOException e) {
			System.out.println("Erreur lors de l'enregistrement des données dans " + csvFile + ": " + e.getMessage());
		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				System.out.println("Erreur lors de la fermeture du fichier CSV: " + e.getMessage());
			}
		}
	}

}
