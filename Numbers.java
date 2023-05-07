class Numbers {
     public static void main (String[] args){
     int count=5;
     Numbers pattern = new Numbers();
     pattern.one();
     pattern.two();
     pattern.three();
     pattern.four();
   }
     
//Pattern one//
void one()
     {
       int count = 0;
       System.out.println("Pattern_one");
       while (count<12)
       {
          count= count+2;
          System.out.println(count + " ");
      }
      }
      
// Pattern Two//
 void two()  
     {
     int count = 1;
     System.out.println("Pattern_Two");
     while (count<=13)
         {
         count=count+3;
         System.out.println(count+ " ");
          }
     }
      
//  Patern three//    
  void three() 
       {
       int count = 3;
       System.out.println("Patern_Three");
       while (count<=15){
            System.out.println(count+ " ");
            count=count+3;
           }
       }
       
//     Pattern four//  
   void four(){
       int count = 1;
     System.out.println("Pattern_Four");
       while (count<=27){
            System.out.println(count+" ");
            count=count*3;   
            }
       }
 }
