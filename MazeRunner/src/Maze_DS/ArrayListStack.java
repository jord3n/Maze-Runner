/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * changed this
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 *
 * @author JWill
 * @param <T>
 */
public class ArrayListStack<T> implements StackADT<T> {
    //fields
    private ArrayList<T> stack;
    private T top;
    private int count;
    
    /**  
     * Constructor
     * initializes the stack, top, and count fields
     */
    public ArrayListStack() {
        stack = new ArrayList<>();
        top = null;
        count = 0;
    }
    
    @Override
    /**
     * Adds an element to the top of the stack
     * @param element
     */
    public void push(T element) {
        stack.add(element);
        top = element;
        count++;
    }

    @Override
    /**
     * Returns the element at the top of the stack and removes it from the stack
     * @return element at the top of the stack
     * @throws EmptyCollectionExcpetion if stack is empty
     */
    public T pop() throws EmptyCollectionException {
        T result;
        if(count != 0){
            result = stack.get(count - 1);
            stack.remove(count - 1);
            count--;
            top = result;
        }else{
            throw new EmptyCollectionException("ArrayList Stack");
        }
        return result;
    }

    @Override
    /**
     * Returns the element at the top of the stack but does not remove it
     * @return the element at the top of the stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T peek() throws EmptyCollectionException {
        T result;
        if(count != 0){
            result = stack.get(count - 1);
        }else{
            throw new EmptyCollectionException("ArrayList Stack");
        }
        return result;
    }
    
    @Override
    /**
     * Tells whether the stack is empty or not by returning true or false
     * @return true if the count is 0
     * @return false if the count is more than 1
     */
    public boolean isEmpty(){
        boolean result;
        if (count == 0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    /**
     *Tells how many elements are in the stack
     * @return the count
     */
    @Override
    public int size(){
        return count;
    }
    
    /**
     * Prints out the content in the stack
     * @return a string message with everything in the stack
     */
    @Override
    public String toString() {
        return "ArrayListStack{" + stack.toString() + '}';
    }
    
    
    
}
