package jogada;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Jogada {

		public int quant_dados_lancados;
		
		public int pontuacao_dado;
		
		public String cor_jogador;
		
		public int i;
		
		public int vetorjogada[];
		
		public int vetorjogadaataque[];
		
		public int vetorjogadadefesa[];
		
		
		public int jogadaAtaque ()
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Escolha a cor do jogador:");
			cor_jogador = input.nextLine();
			
			System.out.println("Quantos ex�rcitos vai usar?");
			quant_dados_lancados = input.nextInt();
			//A cada ex�rcito usado, um dado � lan�ado.
			
			
			while (quant_dados_lancados > 3) {
				System.out.println("O n�mero de ex�rcitos n�o pode ser maior que 3. Escolha outra quantidade:");
				quant_dados_lancados = input.nextInt();
			}
			//Cada jogador pode usar, no m�ximo, 3 ex�rcitos numa batalha.
			
			System.out.printf("Cor = %s, Quantidade de dados = %d", 
					cor_jogador, quant_dados_lancados);
			
			
			int vetorjogadaataque[] = new int[quant_dados_lancados];
			
			for (int i = 0; i < quant_dados_lancados; i++)
			{
				Random random = new Random();
				
				//jogada.pontuacao_dado = random.nextInt(6) + 1;
				
				//System.out.printf("\n\nPontua��o = %d", jogada.pontuacao_dado);
				
				vetorjogadaataque[i] = random.nextInt(6) + 1;
				
				vetorjogadaataque[i] = vetorjogadaataque[i] * -1; //� parte do procedimento para ordenar de maneira decrescente		
			
			}
			
			Arrays.sort(vetorjogadaataque); //� parte do procedimento para ordenar de maneira decrescente		
			
			for (int i = 0; i < quant_dados_lancados; i++)
			{
				vetorjogadaataque[i] = vetorjogadaataque[i] * -1; //� parte do procedimento para ordenar de maneira decrescente		
			}
			
			System.out.printf("\n\nPontua��o:");
			System.out.println(Arrays.toString(vetorjogadaataque));
			
			return vetorjogadaataque[i];

		}
		
		
		public int jogadaDefesa ()
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Escolha a cor do jogador:");
			cor_jogador = input.nextLine();
			
			System.out.println("Quantos ex�rcitos vai usar?");
			quant_dados_lancados = input.nextInt();
			//A cada ex�rcito usado, um dado � lan�ado.
			
			
			while (quant_dados_lancados > 3) {
				System.out.println("O n�mero de ex�rcitos n�o pode ser maior que 3. Escolha outra quantidade:");
				quant_dados_lancados = input.nextInt();
			}
			//Cada jogador pode usar, no m�ximo, 3 ex�rcitos numa batalha.
			
			System.out.printf("Cor = %s, Quantidade de dados = %d", 
					cor_jogador, quant_dados_lancados);
			
			
			int vetorjogadadefesa[] = new int[quant_dados_lancados];
			
			for (int i = 0; i < quant_dados_lancados; i++)
			{
				Random random = new Random();
				
				//jogada.pontuacao_dado = random.nextInt(6) + 1;
				
				//System.out.printf("\n\nPontua��o = %d", jogada.pontuacao_dado);
				
				vetorjogadadefesa[i] = random.nextInt(6) + 1;
				
				vetorjogadadefesa[i] = vetorjogadadefesa[i] * -1; //� parte do procedimento para ordenar de maneira decrescente		
			
			}
			
			Arrays.sort(vetorjogadadefesa); //� parte do procedimento para ordenar de maneira decrescente		
			
			for (int i = 0; i < quant_dados_lancados; i++)
			{
				vetorjogadadefesa[i] = vetorjogadadefesa[i] * -1; //� parte do procedimento para ordenar de maneira decrescente		
			}
			
			System.out.printf("\n\naaPontua��o:");
			System.out.println(Arrays.toString(vetorjogadadefesa));
			
			return vetorjogadadefesa[i];

		}
		
		public void comparar () 
		{
			System.out.printf("\n\nbbbbbbbbbbbbPontua��o:");
			System.out.println(Arrays.toString(vetorjogadadefesa));
			for (int i = 0; i < 3; i++)
			{
				if (vetorjogadaataque[i] > vetorjogadadefesa[i])
				{
					System.out.printf("\n\nVit�ria do invasor");
				}
				else
				{
					System.out.printf("\n\nVit�ria do defensor");
				}
			}
		}
	
	
		/*private int quant_dados_lancados;
		
		private int pontuacao_dado;
		
		private String tipo_jogada; //ataque ou defesa
		
		private String cor_jogador;
		
		public Jogada (int quant_dados_lancados, int pontuacao_dado, String tipo_jogada, String cor_jogador)
		{
			this.quant_dados_lancados  = quant_dados_lancados;
			this.pontuacao_dado  = pontuacao_dado;
			this.tipo_jogada  = tipo_jogada;
			this.cor_jogador  = cor_jogador;
		}
		
		public int getQuant_Dados_Lancados() {
			return quant_dados_lancados;
		}
		
		public void setQuant_Dados_Lancados(int quant_dados_lancados) {
			this.quant_dados_lancados  = quant_dados_lancados;
		}
		
		public int getPontuacao_Dado() {
			return pontuacao_dado;
		}
		
		public void setPontuacao_Dados(int pontuacao_dado) {
			this.pontuacao_dado  = pontuacao_dado;
		}
		
		public String getTipo_Jogada() {
			return tipo_jogada;
		}
		
		public void setTipo_Jogada(String tipo_jogada) {
			this.tipo_jogada  = tipo_jogada;
		}
		
		public String getCor_Jogador() {
			return cor_jogador;
		}
		
		public void setJogador(String cor_jogador) {
			this.cor_jogador  = cor_jogador;
		}*/
}
