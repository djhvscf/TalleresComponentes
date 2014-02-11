/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp3;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dennis
 */
public class FancyButton extends JComponent 
{
  public FancyButton()
  {
  }
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FancyButton button = new FancyButton();  // Initialize the component.
    frame.getContentPane().add(button);
    frame.setVisible(true);
  }
  
  @Override
  public void paintComponent(Graphics graphics)
  {
    //graphics.setColor(Color.red);
    //graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
    graphics.setColor(Color.gray);
    graphics.fillRoundRect(2, 2, this.getWidth() - 4, this.getHeight() - 4, 30, 30);
  }
}