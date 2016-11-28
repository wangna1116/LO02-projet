package control;

import java.util.Scanner;

public class JoueurPhysique extends Joueur {
	
	/**
	 * 选择玩家人数
	 * 提示玩家输入总人数
	 * 扫描输入的数据
	 * 返回总玩家人数
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
	 * 玩家强制退出
	 */
	public void terminerForce(){
		
	}

}
