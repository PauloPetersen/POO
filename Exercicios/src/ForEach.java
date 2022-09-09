import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(3);
		numeros.add(10);
		numeros.add(80);
		//List<Integer> numero2 = Arrays.aslist(1,2,3,4);
		List<Integer> numero3 = List.of(5,6,7,8);
		
		//for (int i = 0; i < numeros.size(); i++) {
			//System.out.println(numeros.get(i));
		
		for (Integer i : numero3) {
		System.out.println(numeros.get(i));
		
		
		}

	}
}

