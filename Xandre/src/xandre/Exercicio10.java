package xandre;
import javax.swing.JOptionPane;

public class Exercicio10 {

	// Faça uma Pesquisa entre 5 habitantes da região sul de são paulo. Será
	// coletados os dados de idade, sexo e salário.
	// faça um programa que calcule e mostre:
	//
	// A - MÉDIA SALARIAL DO GRUPO.
	// B - MAIOR E MENOR IDADE DO GRUPO;
	// C - A QUANTIDADE DE MULHERES NA REGIÃO;
	// D - A IDADE E O SEXO DA PESSOA QUE POSSUI O MENOR SALÁRIO;

	public static void main(String[] args) {

		int idade1, idade2, idade3;

		idade1 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a idade da Pessoa 1? "));
		idade2 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a idade da Pessoa 2? "));
		idade3 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a idade da Pessoa 3? "));

		Object[] op1 = { "Masculino", "Feminino" };
		Object resp1 = (JOptionPane.showInputDialog(null, " Selecione o Sexo da Pessoa 1: \n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op1, "Masculino"));

		Object[] op2 = { "Masculino", "Feminino" };
		Object resp2 = (JOptionPane.showInputDialog(null, " Selecione o Sexo da Pessoa 2: \n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op2, "Masculino"));

		Object[] op3 = { "Masculino", "Feminino" };
		Object resp3 = (JOptionPane.showInputDialog(null, " Selecione o Sexo da Pessoa 3: \n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op3, "Masculino"));

		int salario1, salario2, salario3, contaA;

		salario1 = Integer.parseInt(JOptionPane.showInputDialog(" Quanto de Salário a Pessoa 1 recebe? (ex: 1500) "));
		salario2 = Integer.parseInt(JOptionPane.showInputDialog(" Quanto de Salário a Pessoa 2 recebe? (ex: 1500) "));
		salario3 = Integer.parseInt(JOptionPane.showInputDialog(" Quanto de Salário a Pessoa 3 recebe? (ex: 1500) "));

		// A

		contaA = salario1 + salario2 + salario3 / 3;
		JOptionPane.showMessageDialog(null, " Média Salarial do grupo: R$" + contaA);

		// B

		if (idade1 > idade2 && idade1 > idade3) {
			if (idade2 > idade3) {
				JOptionPane.showMessageDialog(null, " Idade crescente: " + idade3 + " , " + idade2 + " , " + idade1);
			}
		} else if (idade2 > idade1 && idade2 > idade3) {
			if (idade1 > idade3) {
				JOptionPane.showMessageDialog(null, " Idade crescente: " + idade3 + " , " + idade1 + " , " + idade2);
			}
		} else if (idade3 > idade2 && idade3 > idade1) {
			if (idade2 > idade1)
				JOptionPane.showMessageDialog(null, " Idade crescente: " + idade1 + " , " + idade2 + " , " + idade3);
		}

		// C

		if (resp1 == "Masculino" && resp2 == "Masculino" && resp3 == "Masculino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesqisa são Homens ");
		} else if (resp1 == "Feminino" && resp2 == "Feminino" && resp3 == "Feminino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são Mulheres ");
		} else if (resp1 == "Feminino" && resp2 == "Masculino" && resp3 == "Masculino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são: \n  Homens: 2 \n  Mulheres: 1 ");
		} else if (resp1 == "Masculino" && resp2 == "Feminino" && resp3 == "Masculino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são: \n  Homens: 2 \n  Mulheres: 1 ");
		} else if (resp1 == "Masculino" && resp2 == "Masculino" && resp3 == "Feminino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são: \n  Homens: 2 \n  Mulheres: 1 ");
		} else if (resp1 == "Masculino" && resp2 == "Feminino" && resp3 == "Feminino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são: \n  Homens: 1 \n  Mulheres: 2 ");
		} else if (resp1 == "Feminino" && resp2 == "Masculino" && resp3 == "Feminino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são: \n  Homens: 1 \n  Mulheres: 2 ");
		} else if (resp1 == "Feminino" && resp2 == "Feminino" && resp3 == "Masculino") {
			JOptionPane.showMessageDialog(null, " As 3 Pessoas da Pesquisa são: \n  Homens: 1 \n  Mulheres: 2 ");
		} else
			JOptionPane.showMessageDialog(null, " Não escolheu nenhum Sexo! ");

		// D

		if (salario1 < salario2 && salario1 < salario3) {
			JOptionPane.showMessageDialog(null, " O MENOR SALÁRIO É DE R$" + salario1);
		} else if (salario2 < salario3) {
			JOptionPane.showMessageDialog(null, " O MENOR SALÁRIO É DE R$" + salario2);
		} else {
			JOptionPane.showMessageDialog(null, " O MENOR SALÁRIO É DE R$" + salario3);
		}
		if (idade1 < idade2 && idade1 < idade3) {
			JOptionPane.showMessageDialog(null, " A MENOR IDADE É DE " + idade1 + " ANOS ");
		} else if (idade2 < idade3) {
			JOptionPane.showMessageDialog(null, " A MENOR IDADE É DE " + idade2 + " ANOS ");
		} else {
			JOptionPane.showMessageDialog(null, " A MENOR IDADE É DE " + idade3 + " ANOS ");
		}
	}
}