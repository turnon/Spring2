/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.idol;

/**
 *
 * @author Administrator
 */
public class PoeticJuggler extends Juggler{
    
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    
    public void perform() {
        super.perform(); 
        System.out.println("while reciting...");
        poem.recite();
    }
    
    
    
    
    
}
