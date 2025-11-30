/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.EcsUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05578596207
 */
public class ControllerUsuarios extends AbstractTableModel {

    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }

    public EcsUsuarios getBean(int rowIndex) {
        return (EcsUsuarios) lstUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstUsuarios.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EcsUsuarios usuarios = (EcsUsuarios) lstUsuarios.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getIdecsUsuarios();
        } else if (columnIndex == 1) {
            return usuarios.getEcsNome();
        } else if (columnIndex == 2) {
            return usuarios.getEcsApelido();
        } else if (columnIndex == 3) {
            return usuarios.getEcsCpf();
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
            return "Apelido";
        } else if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
