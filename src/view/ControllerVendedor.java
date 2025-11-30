/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.EcsVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05578596207
 */

public class ControllerVendedor extends AbstractTableModel {

    private List lstVendedor;

    public void setList(List lstVendedor) {
        this.lstVendedor = lstVendedor;
    }

    public EcsVendedor getBean(int rowIndex) {
        return (EcsVendedor) lstVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendedor.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EcsVendedor vendedor = (EcsVendedor) lstVendedor.get(rowIndex);
        if (columnIndex == 0) {
            return vendedor.getIdecsVendedor();
        } else if (columnIndex == 1) {
            return vendedor.getEcsNomeVendedor();
        } else if (columnIndex == 2) {
            return vendedor.getEcsTelefone();
        } else if (columnIndex == 3) {
            return vendedor.getEcsCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "Telefone";
        } else if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
