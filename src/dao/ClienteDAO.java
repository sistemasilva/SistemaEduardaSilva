package dao;

import bean.EcsCliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ClienteDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(EcsCliente.class);
        criteria.add(Restrictions.eq("idecsCliente", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsCliente.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsCliente.class);
        criteria.add(Restrictions.like("ecsNomeCliente", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsCliente.class);
        criteria.add(Restrictions.like("ecsCpf", cpf + "%"));

        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsCliente.class);
        criteria.add(Restrictions.like("ecsNomeCliente", "%" + nome + "%"));
        criteria.add(Restrictions.like("ecsCpf", cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        ClienteDAO clientesDAO = new ClienteDAO();
        clientesDAO.listAll();
    }

}
