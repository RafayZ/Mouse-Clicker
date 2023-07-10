import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

public class MyComponent extends JComponent implements MouseListener, KeyListener { //MouseListener and KeyListener implementation

    private Map<Integer, Integer> quadrant;
    public MyComponent(){ //Constructor for MyComponent
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);

        quadrant = new HashMap<>();
        quadrant.put(1,0);
        quadrant.put(2,0);
        quadrant.put(3,0);
        quadrant.put(4,0);
    }

    private int accessQuadrant(int a, int b){ //method to find divide screen into quadrants
        int centerOfa = getWidth() / 2;
        int centerOfb = getHeight() / 2;
        if(a < centerOfa && b < centerOfb){
            return 1;
        }
        else if(a >= centerOfa && b < centerOfb){
            return 2;
        }
        else if(a >= centerOfa && b >= centerOfb) {
            return 3;
        }
        else{
            return 4;
        }
    }
    private void handleMouseEvent(MouseEvent e) { //method to print and find the coordinates of mouse in quadrants
        int quadrants = accessQuadrant(e.getX(), e.getY());
        int count = quadrant.get(quadrants) + 1;
        quadrant.put(quadrants, count);
        System.out.println("Mouse clicked: quadrant= " + quadrants + ", count= " + count);
        System.out.println("Quadrant counts: " + quadrant);
    }

    private void handleKeyEvent(KeyEvent e) { //method to print and find the coordinates of mouse in quadrants
        Point cursorLocation = getMousePosition();
        int quadrants = accessQuadrant(cursorLocation.x, cursorLocation.y);
        int count = quadrant.get(quadrants) + 1;
        quadrant.put(quadrants, count);
        System.out.println("Key pressed: quadrant= " + quadrants + ", count= " + count);
        System.out.println("Quadrant counts: " + quadrant);
    }

    @Override
    public void mouseClicked(MouseEvent e) { //method to call MouseListener
        handleMouseEvent(e);
    }

    @Override
    public void keyPressed(KeyEvent e) { //method to call KeyListener
        handleKeyEvent(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // not used
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // not used
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // not used
    }
}
