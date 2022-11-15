package no.hvl.dat100.jplab11.oppgave4;

import java.io.*;
import java.util.*;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
	boolean skrevet = false;	
		
    File fil = new File(mappe, filnavn);
		
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fil));
		writer.write(samling.toString());
		writer.close();
		skrevet = true;
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
    return skrevet;
	
 }
}