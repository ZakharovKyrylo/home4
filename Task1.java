package home04;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws StackException {
        StackImpl stackImpl = new StackImpl();
        Scanner s1 = new Scanner(System.in);

M1:     while(true) try {
            System.out.println("If you want add Object, enter 1 " +
                    "\nIf you want delete Object, enter 2 " +
                    "\nIf you want delete all Object, enter 3 " +
                    "\nIf you want read all Object, enter 4" +
                    "\nenter 0 to esc ");

            switch (s1.nextInt()){
                case 0 : break M1;
                case 1 : System.out.println("Enter element");  stackImpl.push(s1.next()); break;
                case 2 : System.out.println(stackImpl.pop()); break;
                case 3 : stackImpl.clear(); break;
                case 4 : stackImpl.print(); break;
            }
        }
        catch (Exception e){}
    }
}
