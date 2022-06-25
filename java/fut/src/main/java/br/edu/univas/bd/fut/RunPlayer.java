package br.edu.univas.bd.fut;


import java.util.Scanner;

import br.edu.univas.bd.fut.dao.maintenancePlayer;

public class RunPlayer{
    
	static maintenancePlayer mp = new maintenancePlayer();
	
	public static void main( String[] args ){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

			System.out.print("1 - Cadastro Time\r"
							+"2 - Alterar Time\r"
							+"3 - Remover Time\r"
							+"4 - Pesquisar Times\r"
							+"9 - Sair\r\r");
			int op = input.nextInt();
			input.nextLine();
			
			
			if(op == 1) {
				mp.createPlayer("Lucas", "Brasileiro", "Pouso Alehgre", "1998", 9);
			}else if(op == 2) {
				mp.updatePlayer(7,"Lucas de Lima", "Brasileiro", "Pouso Alegre", "1995", 9);
			}else if(op == 3) {
				mp.removePlayer(8);
			}else if(op == 4) {	
				mp.queriesPlayer();
			}			

	}
}
