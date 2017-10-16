// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
import javax.swing.*;
public class DebugTwelve4
{
   public static void main(String[] args)
   {
      String inStr, outString = "";
      final int MAX = 999;
      int[] emp = new int[4];
      for(int c =0 ; c < emp.length ; c++)
      {
         inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");  
         try
         {
            if(Integer.parseInt(inStr) > MAX)
            {
               throw new DebugEmployeeIDException("Number too high " + inStr);
            }
            emp[c] = Integer.parseInt(inStr);

         }
         catch(NumberFormatException error)
         {
             c--;
            JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
         }
         catch(DebugEmployeeIDException error)
         {
             c--;
            JOptionPane.showMessageDialog(null,error);
         }

         outString = outString + emp[c] + " ";
      }
      JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);


   }


   }
