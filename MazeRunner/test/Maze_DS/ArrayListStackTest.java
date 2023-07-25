/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWill
 */
public class ArrayListStackTest {
    
    /**
     * Test constructor
     */
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String element = "Earl Sweatshirt";
        
        ArrayListStack<String> instance = new ArrayListStack();
        
        //make sure the stack is empty
        assertTrue(instance.isEmpty());
        
      
        //testing if the element pushes on the top of the stack
        instance.push(element);
        try{
            assertEquals(element, instance.peek());
            
        }catch(EmptyCollectionException e){
            fail("Shouldn't get here");
        }
        
        //make sure it increases its size
        assertEquals(1, instance.size());
        
        //make sure the elements are in the correct order
        element = "Frank Ocean";
        instance.push(element);
        element = "Tyler, The Creator";
        instance.push(element);
        element = "Domo Genesis";
        instance.push(element);
        
        try {
            assertEquals("Domo Genesis", instance.pop());
            assertEquals("Tyler, The Creator", instance.pop());
            assertEquals("Frank Ocean", instance.pop());
            assertEquals("Earl Sweatshirt", instance.pop());
            
        } catch (EmptyCollectionException ex) {
            fail(" Shouln't get here ");
        }
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack<String> instance = new ArrayListStack();
        
        //test if an empty stack returns 
        try{
            instance.pop();
            fail("Shouldn't get here");
        }catch (EmptyCollectionException e){
            assertEquals("The ArrayList Stack is empty.", e.getMessage());
        }
        
        //test if pop decriments the size of the stack
        try{
            instance.push("Method Man");
            assertEquals(1, instance.size());
            instance.pop();
            assertEquals(0, instance.size());
        }catch(EmptyCollectionException e){
            fail("Shouln't get here");
        }
        
        //test that pop returns the top of the stack
        instance.push("U-God");
        instance.push("RZA");
        instance.push("GZA");
        instance.push("ODB");
        
        assertEquals("ODB", instance.pop());
        
        //check if pop mutates the stack ("GZA" should be on top)
        assertEquals("GZA", instance.pop());
        
        //check that popping off the stack does not throw an exception
        try{
            instance.pop();
        }catch (EmptyCollectionException e){
            fail("Shouldn't get here");
        }
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        
        //test if peek returns exception is stack is empty
        try{
            instance.peek();
        }catch(EmptyCollectionException e){
            assertEquals("The ArrayList Stack is empty.", e.getMessage());
        }
        
        // test that peek does not change the stack
        instance.push("Kevin Abstract");
        try{
            //doesn't remove elements
            assertEquals("Kevin Abstract", instance.peek());
            assertEquals("Kevin Abstract", instance.peek());
            
            //doesnt reduce size
            assertEquals(1, instance.size());
            
            //doesnt change order of elements
            instance.push("Bearface");
            assertEquals("Bearface", instance.peek());
            instance.pop();
            assertEquals("Kevin Abstract", instance.peek());
            
        }catch(EmptyCollectionException e){
            fail("Shouldn't get here");
        }
        
        //test that peek gives what is at the top of the stack
        instance.push("Matt Champion");
        instance.push("Joba");
        instance.push("Merlyn Wood");
        
        //also test that peek doesnt throw exception for a stack with elements
        try{
            assertEquals("Merlyn Wood", instance.peek());
        }catch(EmptyCollectionException e){
            fail("Shouldn't get here");
        }
        
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        
        // test it returns true if the stack is empty
        assertTrue(instance.isEmpty());
        
        // test it returns false if the stack has elements
        instance.push("Ice Cube");
        assertFalse(instance.isEmpty());
        
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack<String> instance = new ArrayListStack();
        
        //test that size returns 0 for an empty stack
        assertEquals(0, instance.size());
        
        //test that size increses when added elements
        instance.push("Q-Tip");
        assertEquals(1, instance.size());
        
        //test that size decrements when removing elements
        try{
            instance.pop();
            assertEquals(0, instance.size());
        }catch (EmptyCollectionException e){
            fail("Should not get here");
        }
        
    }

}
