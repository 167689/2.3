class Main {
  public static void main(String[] args) {
    int z,x,c;
    for(z=0;z<5;z++)
    {
      for(x=0;x<5*2;x++)
      {
      if(x<(5-z)||x>(5+z)) 
      {
      System.out.print(" "); 
      }
        else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }
    
  }
}