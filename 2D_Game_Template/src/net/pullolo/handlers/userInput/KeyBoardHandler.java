package net.pullolo.handlers.userInput;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardHandler implements KeyListener {

    private boolean w, a, s, d, up, down, left, right, q, e, r, x;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode()==87){
            w=true;
        }
        if (event.getKeyCode()==83){
            s=true;
        }
        if (event.getKeyCode()==65){
            a=true;
        }
        if (event.getKeyCode()==68){
            d=true;
        }
        if (event.getKeyCode()==38){
            up=true;
        }
        if (event.getKeyCode()==37){
            left=true;
        }
        if (event.getKeyCode()==39){
            right=true;
        }
        if (event.getKeyCode()==40){
            down=true;
        }
        if (event.getKeyCode()==81){
            q=true;
        }
        if (event.getKeyCode()==69){
            e=true;
        }
        if (event.getKeyCode()==82){
            r=true;
        }
        if (event.getKeyCode()==88){
            x=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent event) {
        if (event.getKeyCode()==87){
            w=false;
        }
        if (event.getKeyCode()==83){
            s=false;
        }
        if (event.getKeyCode()==65){
            a=false;
        }
        if (event.getKeyCode()==68){
            d=false;
        }
        if (event.getKeyCode()==38){
            up=false;
        }
        if (event.getKeyCode()==37){
            left=false;
        }
        if (event.getKeyCode()==39){
            right=false;
        }
        if (event.getKeyCode()==40){
            down=false;
        }
        if (event.getKeyCode()==81){
            q=false;
        }
        if (event.getKeyCode()==69){
            e=false;
        }
        if (event.getKeyCode()==82){
            r=false;
        }
        if (event.getKeyCode()==88){
            x=false;
        }
    }

    public boolean isW() {
        return w;
    }
    public boolean isA() {
        return a;
    }
    public boolean isS() {
        return s;
    }
    public boolean isD() {
        return d;
    }
    public boolean isUp() {
        return up;
    }
    public boolean isDown() {
        return down;
    }
    public boolean isLeft() {
        return left;
    }
    public boolean isRight() {
        return right;
    }
    public boolean isQ() {
        return q;
    }
    public boolean isE() {
        return e;
    }
    public boolean isR() {
        return r;
    }
    public boolean isX() {
        return x;
    }
}
