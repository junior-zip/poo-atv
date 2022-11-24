package br.edu.ifs.academico;

import java.util.Scanner;

public class Aplicativo {

	public final static void clearConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		Menu menu = new Menu();
		String nome;
		String dataNascimento;
		String localNascimento;
		char sexo;
		Aluno[] alunos = new Aluno[10];
		int contadorAlunos = 0;

		Professor[] professores = new Professor[10];
		int contProfessores = 0;
		Coordenador[] coordenadores = new Coordenador[10];
		int contCoordenadores = 0;
		Estagiario[] estagiarios = new Estagiario[10];
		int contEstagiarios = 0;
		Pesquisador[] pesquisadores = new Pesquisador[10];
		int contPesquisadores = 0;
		Psicologo[] psicologos = new Psicologo[10];
		int contPsicologos = 0;

		Tecnico[] tecnicos = new Tecnico[10];
		int contadorTecnicos = 0;
		System.out.println(menu.getMenu());
		int opcao = src.nextInt();

		Bolsista[] bolsistas = new Bolsista[10];
		int contBolsista = 0;


		Fornecedor[] fornecedores = new Fornecedor[10];
		int contFornecedor = 0;

		while (opcao != 0) {

			switch (opcao) {
				case 1: {
					double nota1;
					double nota2;
					double nota3;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Aluno aluno = new Aluno(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					aluno.setSexo(sexo);

					System.out.println("data de nascimento? ");
					dataNascimento = src.next();
					aluno.setDataNascimento(dataNascimento);
					System.out.println("local de nascimento: ");
					localNascimento = src.next();
					aluno.setLocalNascimento(localNascimento);
					System.out.println("Informe sua 1º nota: ");
					nota1 = src.nextDouble();
					aluno.setNota1(nota1);

					System.out.println("Informe sua 2º nota: ");
					nota2 = src.nextDouble();
					aluno.setNota2(nota2);

					System.out.println("Informe sua 3º nota: ");
					nota3 = src.nextDouble();
					aluno.setNota3(nota3);

					alunos[contadorAlunos] = aluno;

					contadorAlunos++;

					break;
				}
				case 2: {
					if (contadorAlunos != 0) {
						for (int i = 0; i < contadorAlunos; i++) {
							System.out.println((i + 1) + "º Nome: " + alunos[i].getNome() + ", Sexo: " + alunos[i].getSexo()
									+ ", Data de nascimento: " + alunos[i].getDataNascimento() + ", Local de nascimento: "
									+ alunos[i].getLocalNascimento() + ", 1º Nota: " + alunos[i].getNota1() + ", 2º Nota: "
									+ alunos[i].getNota2() + ", 3º Nota: " + alunos[i].getNota3());
						}
					} else {
						System.out.println("Não tem aluno a ser listado!");
					}

					break;
				}
				case 3: {

					String formacao;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Professor professor = new Professor(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					professor.setSexo(sexo);

					System.out.println("Qual a sua data de nascimento? ");
					dataNascimento = src.next();
					professor.setDataNascimento(dataNascimento);

					System.out.println("Qual seu local de nascimento?");
					localNascimento = src.next();
					professor.setLocalNascimento(localNascimento);

					System.out.println("Insira sua formação: ");
					formacao = src.next();
					professor.setFormacao(formacao);

					professores[contProfessores] = professor;

					contProfessores++;

					break;
				}
				case 4: {

					if (contProfessores != 0) {
						for (int i = 0; i < contProfessores; i++) {
							System.out.println((i + 1) + "º Nome: " + professores[i].getNome() + ", Sexo: "
									+ professores[i].getSexo() + ", Data de nascimento: "
									+ professores[i].getDataNascimento() + ", Local de nascimento: "
									+ professores[i].getLocalNascimento() + ", Formação: " + professores[i].getFormacao());
						}
					} else {
						System.out.println("Não há nenhum aluno a ser listado!");
					}

					break;
				}
				case 5: {

					String curso;
					String formacao;
					clearConsole();
					System.out.println("Qual seu nome? ");
					nome = src.next();

					Coordenador coordenador = new Coordenador(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					coordenador.setSexo(sexo);

					System.out.println("Qual a sua data de nascimento? ");
					dataNascimento = src.next();
					coordenador.setDataNascimento(dataNascimento);

					System.out.println("Qual seu local de nascimento? ");
					localNascimento = src.next();
					coordenador.setLocalNascimento(localNascimento);

					System.out.println("Insira sua formação: ");
					formacao = src.next();
					coordenador.setFormacao(formacao);

					System.out.println("Insira seu curso: ");
					curso = src.next();
					coordenador.setCurso(curso);

					coordenadores[contCoordenadores] = coordenador;

					contCoordenadores++;

					break;
				}
				case 6: {

					if (contCoordenadores != 0) {
						for (int i = 0; i < contCoordenadores; i++) {
							System.out.println((i + 1) + "º Nome: " + coordenadores[i].getNome() + ", Sexo: "
									+ coordenadores[i].getSexo() + ", Data de nascimento: "
									+ coordenadores[i].getDataNascimento() + ", Local de nascimento: "
									+ coordenadores[i].getLocalNascimento() + ", Formação: "
									+ coordenadores[i].getFormacao() + ", Curso: " + coordenadores[i].getCurso());
						}
					} else {
						System.out.println("Não há nenhum aluno a ser listado!");
					}

					break;

				}
				case 7: {

					String instituicao;
					double periodoAtual;
					String curso;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Estagiario estagiario = new Estagiario(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					estagiario.setSexo(sexo);

					System.out.println("Qual a sua data de nascimento? ");
					dataNascimento = src.next();
					estagiario.setDataNascimento(dataNascimento);

					System.out.println("Qual seu local de nascimento? ");
					localNascimento = src.next();
					estagiario.setLocalNascimento(localNascimento);

					System.out.println("Insira sua instituição: ");
					instituicao = src.next();
					estagiario.setInstituicao(instituicao);

					System.out.println("Insira seu período atual: ");
					periodoAtual = src.nextDouble();
					estagiario.setPeriodoAtual(periodoAtual);

					System.out.println("Insira seu curso: ");
					curso = src.next();
					estagiario.setCurso(curso);

					estagiarios[contEstagiarios] = estagiario;

					contEstagiarios++;

					break;

				}
				case 8: {

					if (contEstagiarios != 0) {
						for (int i = 0; i < contEstagiarios; i++) {
							System.out.println(
									(i + 1) + "º Nome: " + estagiarios[i].getNome() + ", Sexo: " + estagiarios[i].getSexo()
											+ ", Data de nascimento: " + estagiarios[i].getDataNascimento()
											+ ", Local de nascimento: " + estagiarios[i].getLocalNascimento()
											+ ", Instituição: " + estagiarios[i].getInstituicao() + ", Periodo Atual: "
											+ estagiarios[i].getPeriodoAtual() + ", Curso: " + estagiarios[i].getCurso());
						}
					} else {
						System.out.println("Não há nenhum aluno a ser listado!");
					}

					break;

				}
				case 9: {

					int codigoPesquisa;
					String grupoPesquisa;
					String instituicaoVinculada;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Pesquisador pesquisador = new Pesquisador(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					pesquisador.setSexo(sexo);

					System.out.println("Qual a sua data de nascimento? ");
					dataNascimento = src.next();
					pesquisador.setDataNascimento(dataNascimento);

					System.out.println("Qual seu local de nascimento? ");
					localNascimento = src.next();
					pesquisador.setLocalNascimento(localNascimento);

					System.out.println("Insira seu código de pesquisa: ");
					codigoPesquisa = src.nextInt();
					pesquisador.setCodigoPesquisa(codigoPesquisa);

					System.out.println("Insira o seu grupo de pesquisa");
					grupoPesquisa = src.next();
					pesquisador.setGrupoPesquisa(grupoPesquisa);

					System.out.println("Insira a sua instituição vinculada");
					instituicaoVinculada = src.next();
					pesquisador.setInstituicaoVinculada(instituicaoVinculada);

					pesquisadores[contPesquisadores] = pesquisador;

					contPesquisadores++;

					break;

				}
				case 10: {

					if (contPesquisadores != 0) {
						for (int i = 0; i < contPesquisadores; i++) {
							System.out.println((i + 1) + "º Nome: " + pesquisadores[i].getNome() + ", Sexo: "
									+ pesquisadores[i].getSexo() + ", Data de nascimento: "
									+ pesquisadores[i].getDataNascimento() + ", Local de nascimento: "
									+ pesquisadores[i].getLocalNascimento() + ", Código de pesquisa: "
									+ pesquisadores[i].getCodigoPesquisa() + ", Grupo de pesquisa: "
									+ pesquisadores[i].getGrupoPesquisa() + ", Instituição vinculada: "
									+ pesquisadores[i].getInstituicaoVinculada());
						}
					} else {
						System.out.println("Não há nenhum aluno a ser listado!");
					}

					break;

				}
				case 11: {

					int numeroDoConselho;
					double cargaHoraria;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Psicologo psicologo = new Psicologo(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					psicologo.setSexo(sexo);

					System.out.println("Qual a sua data de nascimento? ");
					dataNascimento = src.next();
					psicologo.setDataNascimento(dataNascimento);

					System.out.println("Qual seu local de nascimento? ");
					localNascimento = src.next();
					psicologo.setLocalNascimento(localNascimento);

					System.out.println("Insira seu numero do conselho:");
					numeroDoConselho = src.nextInt();
					psicologo.setNumeroDoConselho(numeroDoConselho);

					System.out.println("Insira sua carga horária");
					cargaHoraria = src.nextDouble();
					psicologo.setCargaHoraria(cargaHoraria);

					psicologos[contPsicologos] = psicologo;

					contPsicologos++;

					break;

				}
				case 12: {

					if (contPsicologos != 0) {
						for (int i = 0; i < contPsicologos; i++) {
							System.out.println((i + 1) + "º Nome: " + psicologos[i].getNome() + ", Sexo: "
									+ psicologos[i].getSexo() + ", Data de nascimento: " + psicologos[i].getDataNascimento()
									+ ", Local de nascimento: " + psicologos[i].getLocalNascimento()
									+ ", Número do conselho: " + psicologos[i].getNumeroDoConselho() + ", Carga horária: "
									+ psicologos[i].getCargaHoraria());
						}
					} else {
						System.out.println("Não há nenhum aluno a ser listado!");
					}

					break;

				}
				case 13: {

					String especialidade;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Tecnico tecnico = new Tecnico(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					tecnico.setSexo(sexo);

					System.out.println("Qual a sua data de nascimento? ");
					dataNascimento = src.next();
					tecnico.setDataNascimento(dataNascimento);

					System.out.println("Qual seu local de nascimento? ");
					localNascimento = src.next();
					tecnico.setLocalNascimento(localNascimento);

					System.out.println("Insira sua especialidade: ");
					especialidade = src.next();
					tecnico.setEspecialidade(especialidade);

					tecnicos[contadorTecnicos] = tecnico;

					contadorTecnicos++;

					break;

				}
				case 14: {

					if (contadorTecnicos != 0) {
						for (int i = 0; i < contadorTecnicos; i++) {
							System.out.println((i + 1) + "º Nome: " + tecnicos[i].getNome() + ", Sexo: "
									+ tecnicos[i].getSexo() + ", Data de nascimento: " + tecnicos[i].getDataNascimento()
									+ ", Local de nascimento: " + tecnicos[i].getLocalNascimento()
									+ ", Especialidade: " + tecnicos[i].getEspecialidade());
						}
					} else {
						System.out.println("Não há nenhum aluno a ser listado!");
					}

					break;
				}
				case 15:{

					int valorBolsa= 0;
					String orientador;

					clearConsole();

					System.out.println("Qual seu nome? ");
					nome = src.next();

					Bolsista bolsista = new Bolsista(nome);

					System.out.println("Qual seu sexo? ");
					sexo = src.next().toLowerCase().charAt(0);
					bolsista.setSexo(sexo);

					System.out.println("data de nascimento? ");
					dataNascimento = src.next();
					bolsista.setDataNascimento(dataNascimento);
					System.out.println("local de nascimento: ");
					localNascimento = src.next();
					bolsista.setLocalNascimento(localNascimento);
					System.out.println("Qual o valor da sua bolsa? ");
					valorBolsa = src.nextInt();
					bolsista.setValorDaBolsa(valorBolsa);
					System.out.println("Qual o seu orientador? ");
					orientador = src.next();
					bolsista.setOrientador(orientador);


					bolsistas[contBolsista] = bolsista;

					contBolsista++;

					break;

				}

				case 16:{
					if (contBolsista != 0) {
						for (int i = 0; i < contBolsista; i++) {
							System.out.println((i + 1) + "º Nome: " + bolsistas[i].getNome() + ", Sexo: "
									+ bolsistas[i].getSexo() + ", Data de nascimento: " + bolsistas[i].getDataNascimento()
									+ ", Local de nascimento: " + tecnicos[i].getLocalNascimento()
									+ ", Valor das bolsas " + bolsistas[i].getValorDaBolsa()
									+ ", Orientadores: " + bolsistas[i].getOrientador());

						}

					} else {
						System.out.println("Não há nenhum bolsista!");
					}

					break;




				}
				case 17:{
					Fornecedor fornecedor = new Fornecedor();

					String razaosocial;
					Long cnpj;
					String cidade;

					System.out.println("Qual a razãosocial do fornecedor?");
					razaosocial = src.next();
					fornecedor.setRazaoSocial(razaosocial);

					System.out.println("Qual o cnpj do fornecedor? ");
					cnpj = src.nextLong();
					fornecedor.setCnpj(cnpj);

					System.out.println("Qual a cidade do fornecedor? ");
					cidade = src.next();
					fornecedor.setCidade(cidade);

					fornecedores[contFornecedor] = fornecedor;


					contFornecedor++;







				}
				case 18:{
					if (contFornecedor != 0 ) {
						for (int i= 0; i < contFornecedor; i++){
							System.out.println(i + 1 + "Razão Social: " + fornecedores[i].getRazaoSocial()
										             + "CNPJ: " + fornecedores[i].getCnpj()
													 +  "Cidadade: " + fornecedores[i].getCidade());

						}
					}else {
						System.out.println("Sem fornecedores");
					}

					break;


				}




			}

			System.out.println(menu.getMenu());

			opcao = src.nextInt();
		}

	}
}
