/*
  	ISYS 320
  	Name(s):AlfurhudSolomon
  	Date: March25, 2018
*/

public class P13_NumbersRight {
    public static void main(String[] args) {
        int num=5;
     for(int i=0; i<=num; i++)
    {
        for(int j=num-i; j>0; j--)
        {
            System.out.print(" ");
        }
        for(int z=0; z<i; z++)
        {
            System.out.print(i);
        }
        System.out.println();
    }
}
}