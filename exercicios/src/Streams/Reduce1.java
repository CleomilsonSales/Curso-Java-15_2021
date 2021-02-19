package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		//reduce � uma api que facilitar a transforma��o de um sequencia dados em outra diferente
		//recebe um acumulado � um fator
		 List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 
		 //Fun��o acumuladora
		 BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		 
		 //quando usa o stream ele inicar o valor inicial apenas uma vez
		 Integer total1 = nums.stream().reduce(soma).get();
		 System.out.println(total1);
		 
		 //paralletstream ele inicia o valor incial todas as vezes
		 Integer total2 = nums.parallelStream().reduce(100,soma);
		 System.out.println(total2);
		 Integer total3 = nums.stream().reduce(100,soma);
		 System.out.println(total3);
		 
		 //Resultado foi um Opcional<Integer>...
		 nums.stream()
		 	.filter(n -> n > 5)
		 	.reduce(soma)
		 	.ifPresent(System.out::println);
	}
}
