/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynastymasra;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Dynastymasra
 */
public class TabelUserDetail extends AbstractTableModel {

    private List<UserDetail> list = new ArrayList<UserDetail>();
    
    public int getRowCount() {
        return list.size();
    }
    public int getColumnCount() {
        return 4;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return list.get(rowIndex).getId();
            case 1 : return list.get(rowIndex).getUsername();
            case 2 : return list.get(rowIndex).getName();
            case 3 : return list.get(rowIndex).getDeposit();
            default: return null;
        }
    }
    
   @Override
   public String getColumnName(int column) {
       switch(column) {
           case 0 : return "ID";
           case 1 : return "Username";
           case 2 : return "Name";
           case 3 : return "Deposit";
           default : return null;
       }
   }
   
   public void add(UserDetail userDetail) {
       list.add(userDetail);
       fireTableRowsInserted(getRowCount(), getColumnCount());
   }
   public void delete(int i, int row) {
       list.remove(i);
       fireTableRowsDeleted(i, row);
   }
   public UserDetail get(int row) {
       return (UserDetail) list.get(row);
   }
}
