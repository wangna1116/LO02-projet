package control;

import java.util.Scanner;

public class JoueurPhysique extends Joueur {
	
	/**
	 * ѡ���������
	 * ��ʾ�������������
	 * ɨ�����������
	 * �������������
	 * @return
	 */
	
	public JoueurPhysique(){
		
	}
	
	public int choisirNombreJoueur(){
		
		System.out.println("Saisissez le nombre de joueur total.");
		Scanner console = new Scanner(System.in);
		int nbJoueur = console.nextInt();
		return nbJoueur;
	}
	
	
	/**
	 * ���ǿ���˳�
	 */
	public void terminerForce(){
		
	}

}
