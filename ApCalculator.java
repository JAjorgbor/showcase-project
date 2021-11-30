import java.util.Scanner; 
public class ApCalculator
 {
  public static void main(String[] args) {
    System.out.println("This programme calculates the arithmetic progression of a sequence of values");
    Scanner Input = new Scanner (System.in);
    
    final int limit =10000;
  

    int first_number,second_number,third_number,nth_term;
 
    while (true){
   while (true){
   System.out.print("enter the first number 'a': ");
    first_number = Input.nextInt();
    if(first_number <limit)
    break;
    System.out.println("number too big");}
   
    while(true){
   System.out.print("enter the second number: ");
   second_number = Input.nextInt();
  if (second_number<limit )
    break;
    System.out.println("number too big");
}
   while (true){
   System.out.print("enter the third number: ");
     third_number = Input.nextInt();
    if (third_number<limit )
      break;
      System.out.println("number too big");}
    if((third_number-second_number)!=(second_number-first_number)) {
        System.out.println("the values given does not constitute a sequence because it does not have a common difference,"
        +" please try again ");
continue;}
     
   while (true){
    System.out.print("enter the nth number 'n': ");
    nth_term = Input.nextInt();
    if (nth_term<limit )
    break;
    System.out.println("number too big");}
    break;
}
  
   
   int common_difference = ((third_number-second_number) + (second_number-first_number))/2;
   int nth_term_result = first_number+(nth_term-1)*common_difference;
   
   System.out.println("The "+ nth_term +"th term of the sequence is "+nth_term_result);

   String answer_from_user,Second_Answer;
   int Number_Of_Terms ,Sum_Of_The_Number_Of_Terms ;

  while(true){
    System.out.println("Do you also want to find the sum of the values of the sequence? (type in yes or no)");  
    answer_from_user = Input.next().toLowerCase();

     if (answer_from_user.equals("yes")){
        while (true){
          System.out.println("enter the number of terms that you want to be summed ");
          Number_Of_Terms = Input.nextInt();
          
          if (Number_Of_Terms<limit ){
            Sum_Of_The_Number_Of_Terms = (Number_Of_Terms/2)*(2*first_number+(Number_Of_Terms-1)*common_difference);   
            System.out.println("the sum of the first "+Number_Of_Terms+" term(s) of the Ap is: "+Sum_Of_The_Number_Of_Terms);
          System.out.println("that will be all thank you");  
          break;}
          System.out.println("number too big");
      
        }
       break;
      }
    
     else if (answer_from_user.equals("no")){
       break;
      }                   
           
        System.out.println("(it's a yes or no queston)"); 
        continue;       
  } 
  int first_term_of_second_seq=0; 
   int second_term_of_second_seq =0;
   int third_term_of_second_seq = 0;
   int NumberOfTermsOfSecondSeq=0;
   
  if (answer_from_user.equals("no")){
    while(true){
     System.out.println("would you like to find the sum of another sequence?(type in yes or no)");
           Second_Answer = Input.next().toLowerCase().trim();
    
      
   
     if (Second_Answer.equals("yes")){
       while (true){
       while (true){
         System.out.println("enter the first number 'a'");
       first_term_of_second_seq = Input.nextInt();
       if (first_term_of_second_seq<limit )
       break;
       System.out.println("number too big");}
       
       while(true){
      System.out.println("enter the second number ");
       second_term_of_second_seq = Input.nextInt();
       if (second_term_of_second_seq<1000)
       break;
       System.out.println("number too big");
     }
       
       while (true){
      System.out.println("enter the third number ");
        third_term_of_second_seq = Input.nextInt();
     
     
        if (third_term_of_second_seq<limit )
        break;
        System.out.println("number too big");}

     if ((third_term_of_second_seq - second_term_of_second_seq )!=(second_term_of_second_seq - first_term_of_second_seq)){
     System.out.println("the values given does not constitute a sequence because it does not have a common difference,"
     +" please try again ");
     continue;
    }

        while (true){
     
     System.out.println("enter the number of terms that you want to be summed ");
      NumberOfTermsOfSecondSeq = Input.nextInt();
      if (NumberOfTermsOfSecondSeq<limit ){
     
       int CommonDifferenceOfSecondSeq = (third_term_of_second_seq - second_term_of_second_seq + second_term_of_second_seq - first_term_of_second_seq)/2;
       int Sum_Of_Number_Of_Terms_of_Second_Seq = (NumberOfTermsOfSecondSeq/2)*(2*first_term_of_second_seq+(NumberOfTermsOfSecondSeq-1)*CommonDifferenceOfSecondSeq);
       System.out.println("the sum of the first "+NumberOfTermsOfSecondSeq+" term(s) of the Ap is: "+Sum_Of_Number_Of_Terms_of_Second_Seq+"\n That will be all, thank you ");
       
       break;}
     
     System.out.println("number too big");}
       
     break;
     }

  break;}
     else if (Second_Answer.equals("no")){
      System.out.println("okay that will be all, Thank you ");
      break;  }
      
           System.out.println("invalid input(it's a yes or no queston)");
      continue;
              }
             }
            }
          } 
 

  
  
