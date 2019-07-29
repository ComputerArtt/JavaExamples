
package menutest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 *
 * @author ComputerArtt
 */
public class MenuTest {

    public MenuTest() 
    {
        Frame frame = new Frame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.CYAN);
        
        MenuBar menubar = new MenuBar();
        
        
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("Menu");
        
        MenuItem menuitem1 = new MenuItem("menu 1");
        MenuItem menuitem2 = new MenuItem("menu 2");
        MenuItem menuitem3 = new MenuItem("menu 3");
        MenuItem menuitem4 = new MenuItem("menu 4");
        MenuItem menuitem5 = new MenuItem("menu 5");
        MenuItem menuitem6 = new MenuItem("menu 6");
        MenuItem menuitem7 = new MenuItem("menu 7");
        MenuItem menuitem8 = new MenuItem("menu 8");
        
        menu.add(menuitem1);menu.add(menuitem2);
        menu.add(menuitem3);menu.add(menuitem4);
        submenu.add(menuitem5);submenu.add(menuitem6);
        submenu.add(menuitem7);
        submenu.add(menuitem8);
        
        menu.add(submenu);
        menubar.add(menu);
        frame.setMenuBar(menubar);
    }
    
    

    public static void main(String[] args) {
        new MenuTest();
    }
    
}
