package sujet2;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import sujet.RegistrationView;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale defaultLocale = Locale.getDefault();
		System.out.println(defaultLocale);
		try {
			ResourceBundle dico = ResourceBundle.getBundle("dico", defaultLocale);

			RegistrationView frame = new RegistrationView(dico.getString("form.titre"), dico);
			frame.setVisible(true);
			frame.setSize(800, 400);
			frame.setLocationRelativeTo(null);

		} catch (MissingResourceException mre) {
			System.err.println(mre.getMessage());
		}
	}

}
