package bean;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ecs_produto",
        catalog = "db_eduarda_silva"
)
public class EcsProduto implements java.io.Serializable {

    private int idecsProduto;
    private String ecsNome;
    private double ecsValorUnitario;
    private String ecsDescricao;
    private int ecsQuantidade;
    private Date ecsAnoFabricacao;
    private String ecsCategoria;

    public EcsProduto() {
    }

    public EcsProduto(int idecsProduto, String ecsNome, double ecsValorUnitario, String ecsDescricao, int ecsQuantidade, Date ecsAnoFabricacao, String ecsCategoria) {
        this.idecsProduto = idecsProduto;
        this.ecsNome = ecsNome;
        this.ecsValorUnitario = ecsValorUnitario;
        this.ecsDescricao = ecsDescricao;
        this.ecsQuantidade = ecsQuantidade;
        this.ecsAnoFabricacao = ecsAnoFabricacao;
        this.ecsCategoria = ecsCategoria;
    }

    public EcsProduto(int idecsProduto, String ecsNome, double ecsValorUnitario, String ecsDescricao, int ecsQuantidade, Date ecsAnoFabricacao, String ecsCategoria, Set ecsVendasProdutoses) {
        this.idecsProduto = idecsProduto;
        this.ecsNome = ecsNome;
        this.ecsValorUnitario = ecsValorUnitario;
        this.ecsDescricao = ecsDescricao;
        this.ecsQuantidade = ecsQuantidade;
        this.ecsAnoFabricacao = ecsAnoFabricacao;
        this.ecsCategoria = ecsCategoria;
    }

    @Id

    @Column(name = "idecs_produto", unique = true, nullable = false)
    public int getIdecsProduto() {
        return this.idecsProduto;
    }

    public void setIdecsProduto(int idecsProduto) {
        this.idecsProduto = idecsProduto;
    }

    @Column(name = "ecs_nome", nullable = false, length = 50)
    public String getEcsNome() {
        return this.ecsNome;
    }

    public void setEcsNome(String ecsNome) {
        this.ecsNome = ecsNome;
    }

    @Column(name = "ecs_valorUnitario", nullable = false, precision = 10)
    public double getEcsValorUnitario() {
        return this.ecsValorUnitario;
    }

    public void setEcsValorUnitario(double ecsValorUnitario) {
        this.ecsValorUnitario = ecsValorUnitario;
    }

    @Column(name = "ecs_descricao", nullable = false, length = 50)
    public String getEcsDescricao() {
        return this.ecsDescricao;
    }

    public void setEcsDescricao(String ecsDescricao) {
        this.ecsDescricao = ecsDescricao;
    }

    @Column(name = "ecs_quantidade", nullable = false)
    public int getEcsQuantidade() {
        return this.ecsQuantidade;
    }

    public void setEcsQuantidade(int ecsQuantidade) {
        this.ecsQuantidade = ecsQuantidade;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ecs_anoFabricacao", nullable = false, length = 10)
    public Date getEcsAnoFabricacao() {
        return this.ecsAnoFabricacao;
    }

    public void setEcsAnoFabricacao(Date ecsAnoFabricacao) {
        this.ecsAnoFabricacao = ecsAnoFabricacao;
    }

    @Column(name = "ecs_categoria", nullable = false, length = 20)
    public String getEcsCategoria() {
        return this.ecsCategoria;
    }

    public void setEcsCategoria(String ecsCategoria) {
        this.ecsCategoria = ecsCategoria;
    }

    @Override
    public String toString() {
        return this.idecsProduto + " - " + this.ecsNome;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EcsProduto) {
            EcsProduto ecsProduto = (EcsProduto) object;
            if (ecsProduto.getIdecsProduto() == this.getIdecsProduto()) {
                return true;
            }
        }
        return false;
    }
}
