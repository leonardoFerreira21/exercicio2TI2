package com.ti2cc;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		Scanner entrada = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);
		
		int menu;
		int cod=0;
		String cpf="",nome="";
		char sexo='*';
		
		do{
			System.out.println("Digite 1 para inserir um aluno");
			System.out.println("Digite 2 para alterar um aluno");
			System.out.println("Digite 3 para excluir um aluno");
			System.out.println("Digite 4 para mostrar todos os alunos");
			System.out.println("Digite 0 para sair");
			menu = entrada.nextInt();
			new Scanner(System.in);
			switch(menu) {
			case 1:
				System.out.println("Digite o codigo do aluno");
				cod = entrada.nextInt();
				System.out.println("Digite o nome do aluno");
				nome = entrada.nextLine();
				new Scanner(System.in);
				System.out.println("Digite o cpf do aluno");
				cpf = entrada.nextLine();
				System.out.println("Digite o sexo do aluno");
				sexo = entrada.next().charAt(0);
				Aluno aluno = new Aluno (cod,nome,cpf,sexo);
				dao.inserirAluno(aluno);
				new Scanner(System.in);
				break;
			case 2:
				System.out.println("digite o cod do aluno a ser alterado");
				cod = entrada.nextInt();
				Aluno aluno2 = new Aluno(cod,"","",'M');
				System.out.println("Digite um novo cpf para o aluno");
				cpf = entrada.nextLine();
				aluno2.setCpf(cpf);
				dao.atualizarAluno(aluno2);
				new Scanner(System.in);
				break;
			case 3:
				System.out.println("Digite o codigo do aluno a ser exluido");
				cod = entrada.nextInt();
				dao.excluirAluno(cod);
				new Scanner(System.in);
				break;
			case 4:
				Aluno[] alunos;
				alunos = dao.getAlunos();
				System.out.println("==== Mostrar usuários === ");		
				for(int i = 0; i < alunos.length; i++) {
					System.out.println(alunos[i].toString());
				}
				
				break;
				
			}	
			
		}while(menu != 0);
		dao.close();
		
	}
}
