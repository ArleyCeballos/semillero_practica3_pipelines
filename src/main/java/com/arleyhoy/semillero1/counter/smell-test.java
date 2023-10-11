

public static void main(String args[]) throws Exception { // Noncompliant
    int x = 1;
    int y=0;
    if (x == 0) {
        y= 1
      } else if (x == 1) {
        y = 2;  
      }
      else if (true==true){
        if (true==true){
          System.out.println("amen");
          if (true==true){
            System.out.println("amen");
            if (true==true){
              System.out.println("amen");
              if (true==true){
                System.out.println("amen");
                if (true==true){
                  System.out.println("amen");
                  if (true==true){
                    System.out.println("amen");
                  }    
                }    
              }    
            }    
          }    
        }    
      }



  }


