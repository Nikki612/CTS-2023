package Sem_2.cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

	protected static int pragAcceptare;

	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatus() {
		System.out.println("Aplicantul " + this.nume + " " + this.prenume +
				((this.punctaj > Aplicant.pragAcceptare) ? "": " nu")+" a fost acceptat.");
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void setDenumireProiect(String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = new String[nrProiecte];
		for(int i = 0; i< nrProiecte; i++)
		{
			this.denumireProiect[i]=denumireProiect[i];
		}
	}
	public int getNrProiecte() {
		return nrProiecte;
	}
	public void setNrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumireProiect=new String[nrProiecte];
		for(int i = 0; i< nrProiecte; i++)
		{
			this.denumireProiect[i]=denumireProiect[i];
		}
	}

	public abstract void afiseazaFinantarea();

	@Override
	public String toString() {
		return ("Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect));
	}

	protected String afisareFinantare(int sumaFinantata)
	{
		return (this.nume+" "+this.prenume+" primeste "+sumaFinantata+ " Euro/zi in proiect.");
	}
}

