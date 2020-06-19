package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
            double salBruto = calcularInss(salarioBase);
            double IRRF = 0;
            double salFinal = 0;
            
            if(salBruto>3000&&salBruto<=6000){
                IRRF = salBruto*0.075;
                salFinal = salBruto-IRRF;
            }else if(salBruto>6000){
                IRRF = salBruto*0.15;
                salFinal = salBruto-IRRF;
            }else if(salBruto<1039){
                salFinal = 0;
            }else if(salBruto<=3000&&salBruto>=1039){
                salFinal = salBruto;
            }
            return Math.round(salFinal);
	}
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {
            double desINSS = 0;
            double salPos = 0;
            if(salarioBase<=1500){
                desINSS = salarioBase*0.08;
                salPos = salarioBase - desINSS;
            }else if(salarioBase>1500&&salarioBase<=4000){
                desINSS = salarioBase*0.09;
                salPos = salarioBase - desINSS;
            }else if(salarioBase>4000){
                desINSS = salarioBase*0.11;
                salPos = salarioBase - desINSS;
            }
            return salPos;
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/