public class main {
    public static void main(String[] args){
     
        printSquareStar(2);
    }




    public static void printSquareStar(int number) {


        if (number >= 5) {


            for (int rows = 1; rows <= number; rows++) {
                for (int columns = 1; columns <= number; columns++) {
                    if (rows == 1 || columns == 1 || rows == number || columns == number || rows == columns || columns == (number - rows + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Invalid Value");


        }
    }
    

   
    }


}
