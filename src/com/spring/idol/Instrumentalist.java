/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.idol;

/**
 *
 * @author Administrator
 */
public class Instrumentalist implements Performer {

    private String song;
    private Instrument inst;

    @Override
    public void perform() {
        System.out.println("using instrument to play " + song);
        inst.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInst() {
        return inst;
    }

    public void setInst(Instrument inst) {
        this.inst = inst;
    }
}
