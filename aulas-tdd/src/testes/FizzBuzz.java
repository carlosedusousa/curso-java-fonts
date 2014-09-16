package testes;

public class FizzBuzz {

//	public String divisivelPor(int valor) {
//		if ((valor % 3 == 0 && valor % 5 == 0)){
//			return "FizzBuzz";
//		} 
//		
//		if (valor % 3 == 0){
//			return "Fizz";
//		} 
//		
//		if (valor % 3 != 0){
//			return "Buzz";
//		} 
//				
//		return "";
//	}
	
	// OU
	public String divisivelPor(int valor) {
		if ((valor % 3 == 0 && valor % 5 == 0)){
			return "FizzBuzz";
		} 
		
		if (valor % 3 == 0){
			return "Fizz";
		} 
		
		if (valor % 5 == 0){
			return "Buzz";
		} 
				
		// return valor + "";
		return String.valueOf(valor);
	}

}
