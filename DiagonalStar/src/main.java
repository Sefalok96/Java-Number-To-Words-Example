public class main {
    public static void main(String[] args){
        //printSquareStar(8);
        //print_squaredi(6);
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
    public static void print_squaredi(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (i == 1 || i == n || j == 1 ||
                        j == n || i == j || j == (n - i + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void Printet(int num){
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
                if(row==num || col==num || row==1 || col==1 || row==col || col==(num-row+1)) {

                    System.out.print("*");
                }

                 else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
