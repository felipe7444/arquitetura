import java.util.*;
import java.util.List;

public class ToDoAction {
	String text;
	Status status;
	List<ToDoAction> toDoList = new ArrayList<ToDoAction>();
	Scanner sc = new Scanner(System.in); 
	
	public void add() {
		ToDoAction toDo = new ToDoAction(); 
		
		System.out.println("Digite a ação: ");
		toDo.text = sc.nextLine();
		toDo.status = Status.em_aberto;
		
		toDoList.add(toDo);
	}
	
	public void changeStatus() {
		System.out.println("Digite o id da ação para mudar stauts: ");
		try {
			int index = sc.nextInt();
			toDoList.get(index).status = Status.concluido;
		}
		catch (Exception ex) {
			System.out.println("Index não encontrado!");
		}
	}
	
	public void showToDoList() {
		int counter = 0;
        for(ToDoAction item : toDoList) {
        	String status = item.status == Status.concluido ? "Concluido" : "Em aberto";
            System.out.print("Id: " + (counter) + " - Status: [" + status + "] - Texto: " + item.text + "\n");
            counter++;
        }
	}
}
