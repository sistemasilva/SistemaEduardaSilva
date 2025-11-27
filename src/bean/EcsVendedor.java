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
@Table(name = "ecs_vendedor",
        catalog = "db_eduarda_silva"
)
public class EcsVendedor implements java.io.Serializable {

    private int idecsVendedor;
    private String ecsNomeVendedor;
    private String ecsCpf;
    private String ecsRg;
    private String ecsEmail;
    private String ecsTelefone;
    private Date ecsDataNasc;

    public EcsVendedor() {
    }

    public EcsVendedor(int idecsVendedor, String ecsNomeVendedor, String ecsCpf, String ecsRg, String ecsEmail, String ecsTelefone,  Date ecsDataNasc) {
        this.idecsVendedor = idecsVendedor;
        this.ecsNomeVendedor = ecsNomeVendedor;
        this.ecsCpf = ecsCpf;
        this.ecsRg = ecsRg;
        this.ecsEmail = ecsEmail;
        this.ecsTelefone = ecsTelefone;
        this.ecsDataNasc = ecsDataNasc;
    }

    public EcsVendedor(int idecsVendedor, String ecsNomeVendedor, String ecsCpf, String ecsRg, String ecsEmail, String ecsTelefone, Date ecsDataNasc, Set ecsVendases) {
        this.idecsVendedor = idecsVendedor;
        this.ecsNomeVendedor = ecsNomeVendedor;
        this.ecsCpf = ecsCpf;
        this.ecsRg = ecsRg;
        this.ecsEmail = ecsEmail;
        this.ecsTelefone = ecsTelefone;
        this.ecsDataNasc = ecsDataNasc;
    }

    @Id

    @Column(name = "idecs_vendedor", unique = true, nullable = false)
    public int getIdecsVendedor() {
        return this.idecsVendedor;
    }

    public void setIdecsVendedor(int idecsVendedor) {
        this.idecsVendedor = idecsVendedor;
    }

    @Column(name = "ecs_nomeVendedor", nullable = false, length = 50)
    public String getEcsNomeVendedor() {
        return this.ecsNomeVendedor;
    }

    public void setEcsNomeVendedor(String ecsNomeVendedor) {
        this.ecsNomeVendedor = ecsNomeVendedor;
    }

    @Column(name = "ecs_cpf", nullable = false, length = 14)
    public String getEcsCpf() {
        return this.ecsCpf;
    }

    public void setEcsCpf(String ecsCpf) {
        this.ecsCpf = ecsCpf;
    }

    @Column(name = "ecs_rg", nullable = false, length = 10)
    public String getEcsRg() {
        return this.ecsRg;
    }

    public void setEcsRg(String ecsRg) {
        this.ecsRg = ecsRg;
    }

    @Column(name = "ecs_email", nullable = false, length = 30)
    public String getEcsEmail() {
        return this.ecsEmail;
    }

    public void setEcsEmail(String ecsEmail) {
        this.ecsEmail = ecsEmail;
    }

    @Column(name = "ecs_telefone", nullable = false, length = 45)
    public String getEcsTelefone() {
        return this.ecsTelefone;
    }

    public void setEcsTelefone(String ecsTelefone) {
        this.ecsTelefone = ecsTelefone;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ecs_dataNasc", nullable = false, length = 10)
    public Date getEcsDataNasc() {
        return this.ecsDataNasc;
    }

    public void setEcsDataNasc(Date ecsDataNasc) {
        this.ecsDataNasc = ecsDataNasc;
    }
}
