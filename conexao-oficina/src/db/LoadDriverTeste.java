package db;

public class LoadDriverTeste {
    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            System.out.println("Conectando!");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            System.out.println("Conectado!");
            
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
}