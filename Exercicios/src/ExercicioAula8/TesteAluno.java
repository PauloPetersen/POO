package ExercicioAula8;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
	
	public static void main(String[] args) {		
		List <Aluno> listaDeAlunos  = new ArrayList<>();
		
		listaDeAlunos.add(new Aluno("Barbara", 6.0, 8.0));
		listaDeAlunos.add(new Aluno("Paulo", 9.0, 7.0));
		listaDeAlunos.add(new Aluno("Poema", 8.0, 4.0));
		listaDeAlunos.add(new Aluno("Leandro", 3.0, 2.0));
		listaDeAlunos.add(new Aluno("Jose", 2.0, 1.0));
		
		for (Aluno aluno2 : listaDeAlunos) {
			System.out.println(aluno2);
		}
		
		
	}
	

}
