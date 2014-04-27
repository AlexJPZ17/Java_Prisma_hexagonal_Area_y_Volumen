/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prisma.hexagonal.area.y.volumen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class ImagenFondo extends javax.swing.JPanel{
     public ImagenFondo() {
          this.setSize(300,300);
      }
    @Override
      public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/img/prisma.png")).getImage());
        g.drawImage(ImagenFondo.getImage(), 0,0, tam.width, tam.height,null);
        setOpaque(false);
        super.paintComponents(g);
      }
}

