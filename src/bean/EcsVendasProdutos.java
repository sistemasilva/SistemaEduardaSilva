package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ecs_vendas_produtos",
        catalog = "db_eduarda_silva"
)
public class EcsVendasProdutos implements java.io.Serializable {

    private int ecsId;
    private EcsProduto ecsProdutos;
    private EcsVendas ecsVendas;
    private int ecsQuantidade;
    private double ecsValorUnitario;

    public EcsVendasProdutos() {
    }

    public EcsVendasProdutos(EcsProduto ecsProdutos, EcsVendas ecsVendas, int ecsQuantidade, double ecsValorUnitario) {
        this.ecsProdutos = ecsProdutos;
        this.ecsVendas = ecsVendas;
        this.ecsQuantidade = ecsQuantidade;
        this.ecsValorUnitario = ecsValorUnitario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ecs_id", unique = true, nullable = false)
    public int getEcsId() {
        return this.ecsId;
    }

    public void setEcsId(int ecsId) {
        this.ecsId = ecsId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ecs_produto_id", nullable = false)
    public EcsProduto getEcsProduto() {
        return this.ecsProdutos;
    }

    public void setEcsProduto(EcsProduto ecsProdutos) {
        this.ecsProdutos = ecsProdutos;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ecs_venda_id", nullable = false)
    public EcsVendas getEcsVendas() {
        return this.ecsVendas;
    }

    public void setEcsVendas(EcsVendas ecsVendas) {
        this.ecsVendas = ecsVendas;
    }

    @Column(name = "ecs_quantidade", nullable = false)
    public int getEcsQuantidade() {
        return this.ecsQuantidade;
    }

    public void setEcsQuantidade(int ecsQuantidade) {
        this.ecsQuantidade = ecsQuantidade;
    }

    @Column(name = "ecs_valor_unitario", nullable = false, precision = 10)
    public double getEcsValorUnitario() {
        return this.ecsValorUnitario;
    }

    public void setEcsValorUnitario(double ecsValorUnitario) {
        this.ecsValorUnitario = ecsValorUnitario;
    }

}
