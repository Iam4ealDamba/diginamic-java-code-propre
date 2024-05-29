package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/**
	 * Formate une date en une chaine de caractère selon le format passe en
	 * paramètre
	 * 
	 * @param date    la date à formater
	 * @param pattern le format de la chaine de caractère (Optionnel)
	 */
	public static String format(Date date, String... pattern) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern.length > 0 ? pattern[0] : "dd/MM/yyyy HH:mm:ss");
		return formateur.format(date);
	}
}
