/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.EcsVendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05578596207
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lstVendasProdutos;

    public void setList(List lstVendasProdutos) {
        this.lstVendasProdutos = lstVendasProdutos;
        this.fireTableDataChanged();
    }

    public EcsVendasProdutos getBean(int rowIndex) {
        return (EcsVendasProdutos) lstVendasProdutos.get(rowIndex);
    }

    public void addBean(EcsVendasProdutos ecsVendasProdutos) {
        lstVendasProdutos.add(ecsVendasProdutos);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        lstVendasProdutos.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVendasProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EcsVendasProdutos ecsVendasProdutos = (EcsVendasProdutos) lstVendasProdutos.get(rowIndex);
        if (columnIndex == 0) {
            return ecsVendasProdutos.getEcsProduto().getIdecsProduto();
        } else if (columnIndex == 1) {
            return ecsVendasProdutos.getEcsProduto().getEcsNome();
        } else if (columnIndex == 2) {
            return ecsVendasProdutos.getEcsQuantidade();
        } else if (columnIndex == 3) {
            return ecsVendasProdutos.getEcsValorUnitario();
        } else if (columnIndex == 4) {
            return ecsVendasProdutos.getEcsValorUnitario() * ecsVendasProdutos.getEcsQuantidade();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Produto";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }
}
