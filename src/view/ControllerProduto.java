/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.EcsProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05578596207
 */
public class ControllerProduto extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
    }

    public EcsProduto getBean(int rowIndex) {
        return (EcsProduto) lstProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EcsProduto produto = (EcsProduto) lstProdutos.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getIdecsProduto();
        } else if (columnIndex == 1) {
            return produto.getEcsNome();
        } else if (columnIndex == 2) {
            return produto.getEcsCategoria();
        } else if (columnIndex == 3) {
            return produto.getEcsAnoFabricacao();
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
            return "Categoria";
        } else if (columnIndex == 3) {
            return "Ano de Fabricação";
        }
        return "";
    }
}
