package br.edu.univas.bd.fut;


import java.util.Scanner;

import br.edu.univas.bd.fut.dao.maintenanceDetailTeams;

public class RunDeatilsTeam{
    
	static maintenanceDetailTeams mdt = new maintenanceDetailTeams();
	
	public static void main( String[] args ){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		do {
		
			System.out.print("1 - Cadastro Time\r"
							+"2 - Alterar Time\r"
							+"3 - Remover Time\r"
							+"4 - Pesquisar Times\r"
							+"9 - Sair\r");
			int op = input.nextInt();
			input.nextLine();
			
			
			if(op == 1) {
				mdt.createDetailTeam("SP", "SAO PAULO", "PAULISTA", "1990", 9);
			}else if(op == 2) {
				mdt.updateDetailTeam(5, "SÃO PAULO", "SANTO PAULO", "TRICOLOR", "1930");
			}else if(op == 3) {
				mdt.removeDetailTeam(6);
			}else if(op == 4) {
				mdt.queriesPlayer();
			}			
			
		}while(true);
		
		
	}
}
