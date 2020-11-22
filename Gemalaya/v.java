package Activity5;

public class v {
public static void main(String args[]){
  int n=5;
  for (int row=1; row<6;row++)
  {
    for (int i=1; i<n; i++)
    
      System.out.print(" ");
      --n;
    
    for (int j=1; j<=2*row-1; j++)
      
      System.out.print(row);
      
    System.out.println();
  }   
}
}