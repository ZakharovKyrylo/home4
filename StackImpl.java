package org.sourceit.zakharov.home04;

public class StackImpl implements Stack{
    int lengthMass;
    static int checker=0;
    Object[] objects;// = new Object[5];
    StackImpl(int num){
        lengthMass = num;
        objects = new Object[lengthMass];
    }


    @Override
    public void push(Object o) throws StackException {
        for (int i=0; i< lengthMass; i ++){
            if(objects[i] == null){
                objects[i] =  o;
                ++checker;
                break;
            }
            else if (checker>=lengthMass) throw new StackException();
        }
    }

    @Override
    public Object pop() throws StackException {
        for (int i=0; i< lengthMass; i ++){
            if(objects[i] != null){
                Object o = objects[i];
                objects[i]=null;
                --checker;
                return o;
            }
            else if(checker<1) throw new StackException();
        }
        return null;
    }

    @Override
    public void clear() {
        for (int i=0; i< lengthMass; i ++){
                objects[i]=null;
        }
        checker=0;
    }

    @Override
    public void print() {
        for (int i=0; i< lengthMass; i ++){
            System.out.println(objects[i]);
        }
    }
}



class StackException extends Exception {
    public StackException(){
        if(StackImpl.checker < 1) System.out.println("Stack is empty ");
        else  System.out.println("Stack is full ");
    }
}