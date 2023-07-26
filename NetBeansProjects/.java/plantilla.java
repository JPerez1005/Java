import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class plantilla {
   public static String hash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main( String[] args) {
              String hola="Soy un Dato Importante";
              String hash=plantilla.hash(hola);
              System.out.println("La  funcion hash de "+hola+" Es: "+hash);
    }
    
    
}



