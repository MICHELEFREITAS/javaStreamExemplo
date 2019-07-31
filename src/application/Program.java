package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		//lista de inteiros com esses valores
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//criando uma stream a partir da list
		//map aplica uma função a cada elemento da Stream. Vai multiplicar cada element. por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		//imprimir a stream na tela usa o toArray que converte stream para vetor
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Stream.of permite colocar elementos diretamente entre parenteses
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//iterate falo o primeiro elemento da Stream no caso 0 e depois a função iteração de geração dos elementos x que leva x+2
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		//imprimir o st3 com limite de 10 elementos. Gera uma nova stream e chama toArry para transformar vetor
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//fibonacci.  Primeiro elemento da stream é array com elemento 0 e 1. 
		//Função de geração vai ser o obj p que leva um novo long contendo 2 elementos, sendo primeiro o array anterior na posição 1 e o segundo o elemento anterior na posição 0 + elemento anterior posição 1
		//função map transforma pares em apenas 1 elemento. Para cada par eu pego o p na posição 0
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}
