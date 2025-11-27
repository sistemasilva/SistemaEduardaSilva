package bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ecs_usuarios",
        catalog = "db_eduarda_silva"
)
public class EcsUsuarios implements java.io.Serializable {

    private int idecsUsuarios;
    private String ecsNome;
    private String ecsApelido;
    private String ecsCpf;
    private Date ecsDataNascimento;
    private String ecsSenha;
    private int ecsNivel;
    private String ecsAtivo;

    public EcsUsuarios() {
    }

    public EcsUsuarios(int idecsUsuarios, String ecsNome, String ecsApelido, String ecsCpf, Date ecsDataNascimento, String ecsSenha, int ecsNivel, String ecsAtivo) {
        this.idecsUsuarios = idecsUsuarios;
        this.ecsNome = ecsNome;
        this.ecsApelido = ecsApelido;
        this.ecsCpf = ecsCpf;
        this.ecsDataNascimento = ecsDataNascimento;
        this.ecsSenha = ecsSenha;
        this.ecsNivel = ecsNivel;
        this.ecsAtivo = ecsAtivo;
    }

    @Id

    @Column(name = "idecs_usuarios", unique = true, nullable = false)
    public int getIdecsUsuarios() {
        return this.idecsUsuarios;
    }

    public void setIdecsUsuarios(int idecsUsuarios) {
        this.idecsUsuarios = idecsUsuarios;
    }

    @Column(name = "ecs_nome", nullable = false, length = 50)
    public String getEcsNome() {
        return this.ecsNome;
    }

    public void setEcsNome(String ecsNome) {
        this.ecsNome = ecsNome;
    }

    @Column(name = "ecs_apelido", nullable = false, length = 45)
    public String getEcsApelido() {
        return this.ecsApelido;
    }

    public void setEcsApelido(String ecsApelido) {
        this.ecsApelido = ecsApelido;
    }

    @Column(name = "ecs_cpf", nullable = false, length = 14)
    public String getEcsCpf() {
        return this.ecsCpf;
    }

    public void setEcsCpf(String ecsCpf) {
        this.ecsCpf = ecsCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "ecs_dataNascimento", nullable = false, length = 10)
    public Date getEcsDataNascimento() {
        return this.ecsDataNascimento;
    }

    public void setEcsDataNascimento(Date ecsDataNascimento) {
        this.ecsDataNascimento = ecsDataNascimento;
    }

    @Column(name = "ecs_senha", nullable = false, length = 30)
    public String getEcsSenha() {
        return this.ecsSenha;
    }

    public void setEcsSenha(String ecsSenha) {
        this.ecsSenha = ecsSenha;
    }

    @Column(name = "ecs_nivel", nullable = false, length = 50)
    public int getEcsNivel() {
        return this.ecsNivel;
    }

    public void setEcsNivel(int ecsNivel) {
        this.ecsNivel = ecsNivel;
    }

    @Column(name = "ecs_ativo", nullable = false, length = 1)
    public String getEcsAtivo() {
        return this.ecsAtivo;
    }

    public void setEcsAtivo(String ecsAtivo) {
        this.ecsAtivo = ecsAtivo;
    }

}
