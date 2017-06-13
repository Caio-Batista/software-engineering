/* Deve-se implementar uma calculadora de salário de funcionários.
 *  Um funcionário contém nome, e-mail, salário-base e cargo.
 *   De acordo com seu cargo, a regra para cálculo do salário líquido é diferente:
 
Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20% caso 
o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso.

Caso o cargo seja DBA, o funcionário terá desconto de 25% caso 
o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.

Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso 
o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.

Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso
o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.

 */

package principal;
import principal.Funcionario;

public class Calculadora {
	
	
	public Calculadora() {}
	
	public double calculaFuncionario(Funcionario func){
		
		if (func == null ){
			return 0;
		}
				
		double salarioFinal = func.getSalarioBase();
	    String cargo = func.getCargo();
	    
	    if (cargo.equals("DESENVOLVEDOR")) {
	    	salarioFinal = (salarioFinal >= 3000) ? salarioFinal*0.8:salarioFinal*0.9;
	    } else if(cargo.equals("DBA")){
	    	salarioFinal = (salarioFinal >= 2000) ? salarioFinal*0.75:salarioFinal*0.85;
	    }else if(cargo.equals("TESTADOR")){
	    	salarioFinal = (salarioFinal >= 2000) ? salarioFinal*0.75:salarioFinal*0.85;
	    }else if(cargo.equals("GERENTE")){
	    	salarioFinal = (salarioFinal >= 5000) ? salarioFinal*0.7:salarioFinal*0.8;
	    }else{
	    	return salarioFinal;
	    }
	
		
		return salarioFinal;
	}
	

}
