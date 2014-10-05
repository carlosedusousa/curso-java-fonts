package lacos.tarefas;
public class VerificaCPF {
    public static boolean cpfEstaCorreto(String cpf){
        String cpfGenerico;
        
        String s1 = cpf.substring(0,1); //s_ é o string de cada número do CPF
        String s2 = cpf.substring(1,2);
        String s3 = cpf.substring(2,3);
        String s4 = cpf.substring(4,5);
        String s5 = cpf.substring(5,6);
        String s6 = cpf.substring(6,7);
        String s7 = cpf.substring(8,9);
        String s8 = cpf.substring(9,10);
        String s9 = cpf.substring(10,11);
        
        int n1 = Integer.parseInt(s1);//n_ é o valor numérico de cada número do CPF
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);
        int n5 = Integer.parseInt(s5);
        int n6 = Integer.parseInt(s6);
        int n7 = Integer.parseInt(s7);
        int n8 = Integer.parseInt(s8);
        int n9 = Integer.parseInt(s9);
        
        int verificador1 = (n1*10+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2);
        if ((verificador1 % 11) < 2){
            verificador1 = 0;
        } else {
            verificador1 = 11 - (verificador1 % 11);
        }
        
        int verificador2 = ((n1*11)+(n2*10)+(n3*9)+(n4*8)+(n5*7)+(n6*6)+(n7*5)+(n8*4)+(n9*3)+(verificador1*2));
        if ((verificador2 % 11) < 2){
            verificador2 = 0;
        } else {
            verificador2 = 11 - (verificador2 % 11);
        }
        
        cpfGenerico = (s1+s2+s3+"."+s4+s5+s6+"."+s7+s8+s9+"-"+verificador1+""+verificador2);
        if (cpfGenerico.equalsIgnoreCase(cpf)){
            return true;
        }
        else{
            return false;
        }
        

    }
    
    public static void main(String[]args){
        System.out.println(cpfEstaCorreto("051.141.119-73"));
    }
}