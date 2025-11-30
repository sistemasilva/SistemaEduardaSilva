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
@Table(name = "ecs_cliente",
        catalog = "db_eduarda_silva"
)
public class EcsCliente implements java.io.Serializable {

    private int idecsCliente;
    private String ecsNomeCliente;
    private String ecsCpf;
    private Date ecsDataNasc;
    private String ecsEmail;
    private int ecsSexo;
    private String ecsRg;
    private String ecsEndereco;
    private String ecsApelido;
    private int ecsEscolaridade;
    private String ecsNacionalidade;
    private String ecsCelular;
    private String ecsProfissao;
    private int ecsEstadoCivil;

    public EcsCliente() {
    }

    public EcsCliente(int idecsCliente, String ecsNomeCliente, String ecsCpf, Date ecsDataNasc, String ecsEmail, int ecsSexo, String ecsRg, String ecsEndereco, String ecsApelido, int ecsEscolaridade, String ecsNacionalidade, String ecsCelular, String ecsProfissao, int ecsEstadoCivil) {
        this.idecsCliente = idecsCliente;
        this.ecsNomeCliente = ecsNomeCliente;
        this.ecsCpf = ecsCpf;
        this.ecsDataNasc = ecsDataNasc;
        this.ecsEmail = ecsEmail;
        this.ecsSexo = ecsSexo;
        this.ecsRg = ecsRg;
        this.ecsEndereco = ecsEndereco;
        this.ecsApelido = ecsApelido;
        this.ecsEscolaridade = ecsEscolaridade;
        this.ecsNacionalidade = ecsNacionalidade;
        this.ecsCelular = ecsCelular;
        this.ecsProfissao = ecsProfissao;
        this.ecsEstadoCivil = ecsEstadoCivil;
    }

    public EcsCliente(int idecsCliente, String ecsNomeCliente, String ecsCpf, Date ecsDataNasc, String ecsEmail, int ecsSexo, String ecsRg, String ecsEndereco, String ecsApelido, int ecsEscolaridade, String ecsNacionalidade, String ecsCelular, String ecsProfissao, int ecsEstadoCivil, Set ecsVendases) {
        this.idecsCliente = idecsCliente;
        this.ecsNomeCliente = ecsNomeCliente;
        this.ecsCpf = ecsCpf;
        this.ecsDataNasc = ecsDataNasc;
        this.ecsEmail = ecsEmail;
        this.ecsSexo = ecsSexo;
        this.ecsRg = ecsRg;
        this.ecsEndereco = ecsEndereco;
        this.ecsApelido = ecsApelido;
        this.ecsEscolaridade = ecsEscolaridade;
        this.ecsNacionalidade = ecsNacionalidade;
        this.ecsCelular = ecsCelular;
        this.ecsProfissao = ecsProfissao;
        this.ecsEstadoCivil = ecsEstadoCivil;
    }

    @Id

    @Column(name = "idecs_cliente", unique = true, nullable = false)
    public int getIdecsCliente() {
        return this.idecsCliente;
    }

    public void setIdecsCliente(int idecsCliente) {
        this.idecsCliente = idecsCliente;
    }

    @Column(name = "ecs_nomeCliente", nullable = false, length = 50)
    public String getEcsNomeCliente() {
        return this.ecsNomeCliente;
    }

    public void setEcsNomeCliente(String ecsNomeCliente) {
        this.ecsNomeCliente = ecsNomeCliente;
    }

    @Column(name = "ecs_cpf", nullable = false, length = 14)
    public String getEcsCpf() {
        return this.ecsCpf;
    }

    public void setEcsCpf(String ecsCpf) {
        this.ecsCpf = ecsCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ecs_dataNasc", nullable = false, length = 10)
    public Date getEcsDataNasc() {
        return this.ecsDataNasc;
    }

    public void setEcsDataNasc(Date ecsDataNasc) {
        this.ecsDataNasc = ecsDataNasc;
    }

    @Column(name = "ecs_email", nullable = false, length = 25)
    public String getEcsEmail() {
        return this.ecsEmail;
    }

    public void setEcsEmail(String ecsEmail) {
        this.ecsEmail = ecsEmail;
    }

    @Column(name = "ecs_sexo", nullable = false, length = 15)
    public int getEcsSexo() {
        return this.ecsSexo;
    }

    public void setEcsSexo(int ecsSexo) {
        this.ecsSexo = ecsSexo;
    }

    @Column(name = "ecs_rg", nullable = false, length = 10)
    public String getEcsRg() {
        return this.ecsRg;
    }

    public void setEcsRg(String ecsRg) {
        this.ecsRg = ecsRg;
    }

    @Column(name = "ecs_endereco", nullable = false, length = 50)
    public String getEcsEndereco() {
        return this.ecsEndereco;
    }

    public void setEcsEndereco(String ecsEndereco) {
        this.ecsEndereco = ecsEndereco;
    }

    @Column(name = "ecs_apelido", nullable = false, length = 30)
    public String getEcsApelido() {
        return this.ecsApelido;
    }

    public void setEcsApelido(String ecsApelido) {
        this.ecsApelido = ecsApelido;
    }

    @Column(name = "ecs_escolaridade", nullable = false, length = 40)
    public int getEcsEscolaridade() {
        return this.ecsEscolaridade;
    }

    public void setEcsEscolaridade(int ecsEscolaridade) {
        this.ecsEscolaridade = ecsEscolaridade;
    }

    @Column(name = "ecs_nacionalidade", nullable = false, length = 45)
    public String getEcsNacionalidade() {
        return this.ecsNacionalidade;
    }

    public void setEcsNacionalidade(String ecsNacionalidade) {
        this.ecsNacionalidade = ecsNacionalidade;
    }

    @Column(name = "ecs_celular", nullable = false, length = 14)
    public String getEcsCelular() {
        return this.ecsCelular;
    }

    public void setEcsCelular(String ecsCelular) {
        this.ecsCelular = ecsCelular;
    }

    @Column(name = "ecs_profissao", nullable = false, length = 45)
    public String getEcsProfissao() {
        return this.ecsProfissao;
    }

    public void setEcsProfissao(String ecsProfissao) {
        this.ecsProfissao = ecsProfissao;
    }

    @Column(name = "ecs_estadoCivil", nullable = false, length = 30)
    public int getEcsEstadoCivil() {
        return this.ecsEstadoCivil;
    }

    public void setEcsEstadoCivil(int ecsEstadoCivil) {
        this.ecsEstadoCivil = ecsEstadoCivil;
    }

    @Override
    public String toString() {
        return this.idecsCliente + " - " + this.ecsNomeCliente;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EcsCliente) {
            EcsCliente ecsCliente = (EcsCliente) object;
            if (ecsCliente.getIdecsCliente() == this.getIdecsCliente()) {
                return true;
            }
        }
        return false;
    }

}
