import java.util.*;

public class bucledobleRafel {
  public static void main(String[] args) {
    int j=0;  //Creem variable i assignem valor
    int x=0;  
    while (j<5) {  
      while (x<3) {
        
        System.out.print("-");
        x++;
      }
      System.out.println();
      j++;
      x=0;
    }

    System.out.println();

    j=0;
    x=0;
    while (j<3) {
      while (x<5) {
        
        System.out.print("-");
        x++;
      }
      System.out.println();
      j++;
      x=0;
    }

    

  }
}
