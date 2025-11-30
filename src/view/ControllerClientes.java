/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.EcsCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05578596207
 */
public class ControllerClientes extends AbstractTableModel {

    private List lstCliente;

    public void setList(List lstUsuarios) {
        this.lstCliente = lstUsuarios;
    }

    public EcsCliente getBean(int rowIndex) {
        return (EcsCliente) lstCliente.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstCliente.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EcsCliente clientes = (EcsCliente) lstCliente.get(rowIndex);
        if (columnIndex == 0) {
            return clientes.getIdecsCliente();
        } else if (columnIndex == 1) {
            return clientes.getEcsNomeCliente();
        } else if (columnIndex == 2) {
            return clientes.getEcsCelular();
        } else if (columnIndex == 3) {
            return clientes.getEcsCpf();
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
            return "Celular";
        } else if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
