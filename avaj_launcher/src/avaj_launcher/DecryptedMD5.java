package avaj_launcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;



public class DecryptedMD5 {
	
	public ArrayList<String> allLines = new ArrayList<String>();
	
	public ArrayList<String> generateAllLines(BufferedReader buff) throws IOException, NoSuchAlgorithmException {
		String sCurrentLine;
		String sTmpLine = null;
		Crypted crypted = new Crypted();
		int i = 0;
		
		//voir si besoin de supprimer la 1ere ligne ou si le buffer garde en memoire la lecture de la 1ere ligne dans leader
		while ((sCurrentLine = buff.readLine()) != null) {
			if (i == 0)
				allLines.add(crypted.hashNumberToString(256, sCurrentLine));
			else if (allLines != null && i == 1) {
				sTmpLine = crypted.hashBlocToString(sCurrentLine) + ' ';
				
				System.out.println("debug " + sTmpLine);
			}
			else if (allLines != null && i == 4) {
				sTmpLine = sTmpLine + crypted.hashNumberToString(999, sCurrentLine);
				allLines.add(sTmpLine);
				sTmpLine = null;
				i = 0;
			}
			else if (allLines != null && i > 1) {
				sTmpLine = sTmpLine + crypted.hashNumberToString(999, sCurrentLine) + ' ';
			}
			i++;
		}
		
		System.out.println("allLine : " + allLines);
		return allLines;
	}
}
