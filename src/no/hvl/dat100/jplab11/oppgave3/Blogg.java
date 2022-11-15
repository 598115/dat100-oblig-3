package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] inleggtabell;
	protected int nesteledig;

	public Blogg() {
		inleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		inleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return inleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		int posisjon = -1;

		for (int i = 0; i < nesteledig; i++) {
			
		    if (inleggtabell[i].erLik(innlegg)) {
		    	posisjon = i;
		    }
		    else {i++;}			
		}
		return posisjon;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		
        for (int i = 0; i < nesteledig; i++) {
			
		    if (inleggtabell[i].erLik(innlegg)) {
		    	return true;
		    }
		    else {		  	
		    i++;
		    }		   
		}
        return finnes;
	}

	public boolean ledigPlass() {
			    		    
	    if (nesteledig < inleggtabell.length) {	    	
	    	return true;	    	
	    }
	        else {
	    	 return false;
	        }
	    
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
	boolean ny = true;	
		
	if (finnes(innlegg)) {ny = false;}			
		
	if (ledigPlass() && ny) {
		
	   inleggtabell[nesteledig] = innlegg;		
		nesteledig++;
		return true;
	}
	else {
		return false;
	}
			
	}
	
	public String toString() {
		
	int antallInlegg = nesteledig;
	
	String print = antallInlegg + "\n";
	
	for(int i = 0; i < nesteledig; i++) {
		
		print += inleggtabell[i].toString();
	}
	
	return print;
			
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}