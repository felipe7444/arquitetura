import java.util.Scanner;

public class ToDoList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		ToDoAction toDo = new ToDoAction();
		boolean stop = false;
		
		while(stop != true) {
			int op = 0;
			System.out.println("O que deseja fazer?\n1-Adicionar ação\n2-Mudar Status\n3-Visualizar ações\n4-Sair");
			
			try {
				op = sc.nextInt();
			}
			catch (Exception ex) {
				System.out.println("Valor invalido!");
			}
			
			switch (op) {
				case 1: toDo.add(); break;
				case 2: toDo.changeStatus(); break;
				case 3: toDo.showToDoList(); break;
				default: stop = true; break;
			}
		}
	}

}
