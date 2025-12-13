/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.EcsVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 
 */
public class ControllerConsultasVenda extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
        this.fireTableDataChanged();
        
    }
    
    public EcsVendas getBean(int rowIndex) {
        return (EcsVendas) lstVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3 ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EcsVendas vend = (EcsVendas) lstVendas.get( rowIndex);
        if ( columnIndex == 0 ){
            return vend.getEcsIdVendas();
        } else if (columnIndex ==2) {
            return vend.getEcsCliente();        
        } else if (columnIndex ==1) {
            return vend.getEcsVendedor();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 2) {
            return "Nome Cliente";         
        } else if ( columnIndex == 1) {
            return "Nome Vendedor";
        } 
        return "";
    }
}
