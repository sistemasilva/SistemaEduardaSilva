package dao;

import bean.EcsUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UsuariosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsUsuarios.class);
        criteria.add(Restrictions.eq("idecsUsuarios", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public EcsUsuarios autenticar(String apelido, String senha) {
        session.beginTransaction();

        Criteria criteria = session.createCriteria(EcsUsuarios.class);
        criteria.add(Restrictions.eq("ecsApelido", apelido));
        criteria.add(Restrictions.eq("ecsSenha", senha));
        criteria.add(Restrictions.eq("ecsAtivo", "S"));

        EcsUsuarios usuario = (EcsUsuarios) criteria.uniqueResult();

        session.getTransaction().commit();
        return usuario;
    }

    public static void main(String[] args) {
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.listAll();
    }

}
