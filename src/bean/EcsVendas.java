package bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ecs_vendas",
        catalog = "db_eduarda_silva"
)
public class EcsVendas implements java.io.Serializable {

    private int ecsIdVendas;
    private EcsCliente ecsCliente;
    private EcsVendedor ecsVendedor;
    private Date ecsDataVenda;
    private double ecsTotal;
    private int ecsFormaPagamento;
    private double ecsDesconto;

    public EcsVendas() {
    }

    public EcsVendas(Date ecsDataVenda) {
        this.ecsDataVenda = ecsDataVenda;
    }

    public EcsVendas(EcsCliente ecsCliente, EcsVendedor ecsVendedor, Date ecsDataVenda, double ecsTotal, int ecsFormaPagamento, double ecsDesconto) {
        this.ecsCliente = ecsCliente;
        this.ecsVendedor = ecsVendedor;
        this.ecsDataVenda = ecsDataVenda;
        this.ecsTotal = ecsTotal;
        this.ecsFormaPagamento = ecsFormaPagamento;
        this.ecsDesconto = ecsDesconto;
    }

    @Id
    

    @Column(name = "ecs_idVendas", unique = true, nullable = false)
    public int getEcsIdVendas() {
        return this.ecsIdVendas;
    }

    public void setEcsIdVendas(int ecsIdVendas) {
        this.ecsIdVendas = ecsIdVendas;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ecs_cliente")
    public EcsCliente getEcsCliente() {
        return this.ecsCliente;
    }

    public void setEcsCliente(EcsCliente ecsCliente) {
        this.ecsCliente = ecsCliente;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ecs_vendedor")
    public EcsVendedor getEcsVendedor() {
        return this.ecsVendedor;
    }

    public void setEcsVendedor(EcsVendedor ecsVendedor) {
        this.ecsVendedor = ecsVendedor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ecs_dataVenda", nullable = false, length = 10)
    public Date getEcsDataVenda() {
        return this.ecsDataVenda;
    }

    public void setEcsDataVenda(Date ecsDataVenda) {
        this.ecsDataVenda = ecsDataVenda;
    }

    @Column(name = "ecs_total", precision = 10)
    public double getEcsTotal() {
        return this.ecsTotal;
    }

    public void setEcsTotal(double ecsTotal) {
        this.ecsTotal = ecsTotal;
    }

    @Column(name = "ecs_forma_pagamento", length = 50)
    public int getEcsFormaPagamento() {
        return this.ecsFormaPagamento;
    }

    public void setEcsFormaPagamento(int ecsFormaPagamento) {
        this.ecsFormaPagamento = ecsFormaPagamento;
    }

    @Column(name = "ecs_desconto", precision = 10)
    public double getEcsDesconto() {
        return this.ecsDesconto;
    }

    public void setEcsDesconto(double ecsDesconto) {
        this.ecsDesconto = ecsDesconto;
    }

}
