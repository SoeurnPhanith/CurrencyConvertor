import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        float CurrencyKHR , CurrencyUSD,CurrencyBath;
        double exchange;
        int option;
        System.out.println("+================Menu================+");
        System.out.println("|    1.Exchange KHR to USD           |");
        System.out.println("|    2.Exchange USD to KHR           |");
        System.out.println("|    3.Exchange KHR to THB           |"); //THB =luy bath
        System.out.println("|    4.Exchange THB to KHR           |");
        System.out.println("|    5.Exchange THB to UDS           |");
        System.out.println("|    6.Exchange KHR to DONG          |");
        System.out.println("+====================================+");

        System.out.println("**NOTE** : Press key (0) to Exit Program! Thank you <3");
        Scanner sc = new Scanner(System.in);
       do{
           System.out.print("Enter your Menu : ");
           option = sc.nextInt();
           switch(option){
               case 1: {
                   System.out.println("======Convert KHR to USD Currency===========");
                   int size;
                   System.out.print("Enter Size : ");size = sc.nextInt();
                   for (int i =0 ; i<size ; i++){
                           System.out.print("Enter value of KHR Currency : ");
                           CurrencyKHR = sc.nextFloat();
                           exchange = CurrencyKHR / 4010; // 4000riel
                           System.out.println("USD = " + exchange + "$");
                   }
                   break;
               }
               case 2: {
                   System.out.println("=======Convert USD to KHR Currency=========");
                   int size;
                   System.out.print("Enter Size : ");size = sc.nextInt();
                   for(int i = 0 ; i<size ; i++){
                       System.out.print("Enter value of USD Currency: ");
                       CurrencyUSD = sc.nextFloat();
                       exchange = CurrencyUSD * 4030; // Pel klas 4100riel
                       System.out.println("KHR = " + exchange + "Riel");
                   }
                   break;
               }
               case 3: {
                   System.out.println("======Convert KHR to THB Currency=======");
                   int size;
                   System.out.print("Enter Size : ");size = sc.nextInt();
                   for(int i = 0 ; i < size ; i++){
                       System.out.print("Enter Value KHR Currency : ");
                       CurrencyKHR = sc.nextFloat();
                       exchange = CurrencyKHR * 0.008477; // 100riel = 0.8477bath
                       System.out.println("THB = " + exchange + "THB");
                   }
                   break;
               }
               case 4: {
                   System.out.println("======Convert THB to KHR=======");
                   int size;
                   System.out.print("Enter Size : ");size = sc.nextInt();
                   for(int i = 0; i< size ; i++){
                       System.out.print("Enter Value THB Currency : ");
                       CurrencyBath = sc.nextFloat();
                       exchange = CurrencyBath / 0.0084777; // 100riel = 0.008477THB
                       System.out.println("KHR = " + exchange + "Riel");
                   }
                   break;
               }
               case 5: {
                   System.out.println("=========Convert THB to USD Currency======== ");
                   int size;
                   System.out.print("Enter Size : ");size = sc.nextInt();
                   for(int j =0 ; j<size ; j+=1){
                       System.out.print("Enter Value THB Currency : ");CurrencyBath = sc.nextFloat();
                       exchange = CurrencyBath * 0.0293;  //1THB = 0.0293$
                       System.out.println("USD = " + exchange + "$");
                   }
                   break;
               }
               case 6: {
                   System.out.println("=======Convert KHR to DONG Currency======");int size;
                   System.out.print("Enter Size : ");size = sc.nextInt();

                   for(int k = 0 ; k<size ; k++){
                       System.out.print("Enter Value KHR Currency: ");CurrencyKHR = sc.nextFloat();
                       exchange = CurrencyKHR * 6.32; //100riel = 6.3242DONG
                       System.out.println("Vietnam DONG = " + exchange + "DONG");
                   }
                   break;
               }
               default: {
                   System.out.println("You Exited Program!");
                   break;
               }
           }
       }while(option!=0);
    }
}

