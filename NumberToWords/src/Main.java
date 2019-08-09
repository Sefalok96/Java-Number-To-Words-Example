public class Main {
    public static void main(String[] args){
        numberToWords(100);
        System.out.println(getDigitCount(10));
    }
public static void numberToWords(int number){
        int theDigit;
    int theCount=getDigitCount(number);
        number=reverse(number);
        if(number<0) {
            System.out.println("Invalid Value");
        }
        else{
            if(number==0){
                System.out.println("Zero");}
            else {
                while (number != 0) {
                    theDigit = number % 10;
                    switch (theDigit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    theCount--;
                    number /= 10;
                }
              if(theCount>0) {
                  for (int i = theCount; i > 0; i--) {
                      System.out.println("Zero");
                  }
              }
            }
            }
}
public static int reverse(int number){
        int reversed=0;

        for(int i=number;i!=0;i/=10){
            int digit=i%10;
            reversed=reversed*10+digit;
        }
        return reversed;
}
public static int getDigitCount(int number){
        if(number<0){return -1;}
        if(number==0){return 1;}
        int count=0;
        while(number!=0){
            number /=10;
            count++;
        }
        return count;
    }
}
