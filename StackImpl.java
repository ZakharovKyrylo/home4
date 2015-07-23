package home04;

import java.util.Objects;

public class StackImpl implements Stack{

    Object[] objects = new Object[5];

    @Override
    public void push(Object o) throws StackException {
        for (int i=0; i< objects.length; i ++){
            if(objects[i] == null){
                objects[i] =  o;
                break;
            }
            else if ((i== objects.length-1)&(objects[i]!=null)) throw new StackException(1);
        }
    }

    @Override
    public Object pop() throws StackException {
        for (int i=0; i< objects.length; i ++){
            if(objects[i] != null){
                Object o = objects[i];
                objects[i]=null;
                return o;
            }
            else if((i== objects.length-1)&(objects[i] == null)) throw new StackException(2);
        }
        return null;
    }

    @Override
    public void clear() {
        for (int i=0; i< objects.length; i ++){
                objects[i]=null;
        }
    }

    @Override
    public void print() {
        for (int i=0; i< objects.length; i ++){
            System.out.println(objects[i]);
        }
    }
}



class StackException extends Exception {
    public StackException(int i){
        switch (i){
            case 1 : System.out.println("Stack is full "); break;
            case 2 : System.out.println("Stack is empty "); break;
        }
    }
}