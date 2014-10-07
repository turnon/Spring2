/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.idol;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class OneManBand implements Performer {

    private String song;
    private Collection<Instrument> insts;
    private Map<String, Instrument> symphone;

    @Override
    public void perform() {
        System.out.println("using instrument-s to play " + song);
        for (Instrument inst : insts) {
            inst.play();
        }
        for (String key : symphone.keySet()) {
            System.out.println(key + symphone.get(key));
        }
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Collection<Instrument> getInsts() {
        return insts;
    }

    public void setInsts(Collection<Instrument> insts) {
        this.insts = insts;
    }

    public Map<String, Instrument> getSymphone() {
        return symphone;
    }

    public void setSymphone(Map<String, Instrument> symphone) {
        this.symphone = symphone;
    }
}
