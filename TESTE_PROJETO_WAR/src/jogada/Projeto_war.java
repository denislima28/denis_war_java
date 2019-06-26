package jogada;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Projeto_war {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogada jogada = new Jogada();
		
		System.out.println("\n\nJOGADA DE ATAQUE");
		
		jogada.jogadaAtaque();
		
		
		//System.out.println(jogada.vetorjogadaataque);
		
		System.out.println("\n\nJOGADA DE DEFESA");
		
		jogada.jogadaDefesa();
		
		jogada.comparar();
		
		
		//System.out.println(jogada.vetorjogadadefesa);
		
		
		
	}

}


/*
 * 
 * JOGADA ATAQUE:

ESCOLHER JOGADOR

ESCOLHER NÚMERO DE DADOS E SALVAR ESSE NÚMERO

ROLAR

SALVAR PONTUAÇÃO DE CADA DADO

ORDENAR DO MAIOR PARA O MENOR


JOGADA DEFESA:

ESCOLHER JOGADOR

ESCOLHER NÚMERO DE DADOS E SALVAR ESSE NÚMERO

ROLAR

SALVAR PONTUAÇÃO

ORDENAR DO MAIOR PARA O MENOR E SALVAR ESSE NÚMERO



COMPARAR NÚMERO DE DADOS LANÇADOS DO ATAQUE E DA DEFESA.
SE UM DELES FOR MAIOR DO QUE O OUTRO, A QUANTIDADE MENOR 
DEVE SER SUBTRAÍDA DA MAIOR. O RESULTADO É A QUANTIDADE
DE DADOS QUE DEVE SER DESCARTADA DA ROLAGEM MAIOR

DESCARTAR OS DADOS COM AS MENORES PONTUAÇÕES*/