/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Shapes2D.Circle;
import Shapes2D.Line;
import Shapes2D.Rectangle;
import Shapes2D.Transform;
import Shapes2D.Triangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Windmill {
    private Point O;
    private int size, R;
    private int r = 3;
    private Color color;
    
    Point rowA, rowB;
    Point d1, d2, d3;
    Point A1, A2, A3;
    Point B1, B2, B3;

    public Windmill() {
    }

    public Windmill(Point O, int size, int R, Color color) {
        this.O = O;
        this.size = size;
        this.R = R;
        this.color = color;
    }

    public Point getO() {
        return O;
    }

    public void setO(Point O) {
        this.O = O;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }
    
    public void init(){
        // Vẽ cây cột điện
        rowA = new Point((O.x + r*size/2), O.y);
        rowB = new Point((O.x - r*size/2), O.y+(R+r)*size);
        
        // Vẽ cánh cối xay
        float canh = (float)Math.sqrt(3)*(R*size); 
        d1 = new Point((O.x + R*size/2), (int)(O.y + canh/2));
        d2 = new Point((O.x + R*size/2), (int)(O.y - canh/2));
        d3 = new Point((O.x - R*size), O.y);
        
        A1 = new Point(O.x + r*r, O.y - r*r);
        B1 = new Point(O.x - r*r, O.y + r*r);
        
        A2 = new Point(O.x + r*r, O.y +r*r);
        B2 = new Point(O.x - r*r, O.y -r*r);
        
        A3 = new Point(O.x , O.y + r*r);
        B3 = new Point(O.x , O.y - r*r);
    }
    
    public void draw(Graphics g){
        // Vẽ cây cột điện
        Rectangle rect = new Rectangle();
        rect.init(rowA, rowB, size, Color.red);
        rect.draw(g);
        
        // Vẽ cánh cối xay
        Line l = new Line();
        l.init(d1, A1, size, Color.yellow);
        l.draw(g);
        l.init(d1, B1, size, Color.yellow);
        l.draw(g);
        
        
        l.init(d2, A2, size, Color.yellow);
        l.draw(g);
        l.init(d2, B2, size, Color.yellow);
        l.draw(g);
        
        
        l.init(d3, A3, size, Color.yellow);
        l.draw(g);
        l.init(d3, B3, size, Color.yellow);
        l.draw(g);
        
        // Vẽ Tâm
        Circle c = new Circle();
        Point A = new Point(O.x + r*size, O.y + r*size);
        Point B = new Point(O.x - r*size, O.y - r*size);
        c.init(A, B, size, color);
        c.draw(g);
    }
    
    public void drawRotate(Graphics g, float angle){
        angle *= Math.PI/180;
        Transform trans = new Transform();
        this.d1 = trans.rotateAny(O, d1, angle);
        this.d2 = trans.rotateAny(O, d2, angle);
        this.d3 = trans.rotateAny(O, d3, angle);
        this.A1 = trans.rotateAny(O, A1, angle);
        this.A2 = trans.rotateAny(O, A2, angle);
        this.A3 = trans.rotateAny(O, A3, angle);
        this.B1 = trans.rotateAny(O, B1, angle);
        this.B2 = trans.rotateAny(O, B2, angle);
        this.B3 = trans.rotateAny(O, B3, angle);
        
        draw(g);
    }
}
