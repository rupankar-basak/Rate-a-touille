
package rat;

import javax.swing.*;
import rat.screens.*;
import rat.models.Staff;
import rat.models.MenuItems;
import rat.models.Order;
import rat.resources.UserDbHandler;
import javax.swing.SwingUtilities.*;
/**
 *
 * @author RUP <your.name at your.org>
 */

public class RAT 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       SwingUtilities.invokeLater(new Runnable()
      {@Override
               
       public void run()
        {
           App_Screen app=new App_Screen();
            app.setVisible(true);
        }}) ;
                {
       
        //DbHandler ob=new DbHandler();
        //boolean value=ob.connection();
        //System.out.println(value);
               //Staff s1=new Staff(1,"Manager",30,50000.00);
               //s1.setSalary(75000.00);
               //s1.displayDetails();
               
//               MenuItem m1=new MenuItem(1,"Butter Chicken",300.00);
//               m1.setName("Butter Paneer");
//               m1.displayDetails();
              //boolean status =ob.insert("123");
            // UserDbHandler ob=new UserDbHandler();
             //ob.RegisterStaff("WAITER","ABCD", 35, 40000.00);
     Login ob=new Login();
      ob.setVisible(true);
    }
    }
}



    

