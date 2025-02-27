public class exo9 {
      public static void main(String[] args) {
          int decimal = 9562; 
  
          
          if (decimal == 0) {
              System.out.println("0 en décimal vaut 0000 en binaire");
              return;
          }
  
          StringBuilder binary = new StringBuilder();
          int temp = decimal;
  
         
          while (temp > 0) {
              binary.insert(0, temp % 2);
              temp = temp / 2;
          }
  
         
          while (binary.length() < 4) {
              binary.insert(0, '0');
          }
  
          System.out.println(decimal + " en décimal vaut " + binary.toString() + " en binaire");
      }
  }