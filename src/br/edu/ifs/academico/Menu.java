package br.edu.ifs.academico;

public class Menu {
	
	public String getMenu() {
		String menu = """
				\s
				********** Sistema Academico **********\s
				=======================================\s
				Menu, digite uma opcao: \s
				1 - Cadastrar Aluno\s
				2 - Listar Alunos\s
				3 - Cadastrar Professor\s
				4 - Listar Professores\s
				5 - Cadastrar Coordenador\s
				6 - Listar Coordenadores\s
				7 - Cadastrar Estagiario\s
				8 - Listar Estagiarios\s
				9 - Cadastrar Pesquisador\s
				10 - Listar Pesquisadores\s
				11 - Cadastrar Psicologo\s
				12 - Listar Psicologos\s
				13 - Cadastrar Tecnico\s
				14 - Listar Tecnicos\s
				15 - Cadastrar Bolsista\s
				16 - Listar bolsistas\s
				17 - Cadastrar fornecedor\s
				18 - Listar fornecedores\s
				0 - Sair\s
				""";
		return menu;
	}

}
