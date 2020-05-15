package Exercicio1;

public class Exercicio_2 {
	public static void man(String [] args) {
		for(int i = 1000; i < 2000; i++) {
			System.out.println(i);
			if(i%11== 0 || i%11==5) {
				System.out.println(i + "é divisivel por 11 ou resto é 5");
			}
		}
	}
}
