package dao;

import bean.EcsVendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class VendedorDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(EcsVendedor.class);
        criteria.add(Restrictions.eq("idecsVendedor", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendedor.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendedor.class);
        criteria.add(Restrictions.like("ecsNomeVendedor", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listEmail(String email) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendedor.class);
        criteria.add(Restrictions.like("ecsEmail", "%" + email + "%"));

        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeEmail(String nome, String email) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendedor.class);
        criteria.add(Restrictions.like("ecsNomeVendedor", "%" + nome + "%"));
        criteria.add(Restrictions.like("ecsEmail", "%" + email + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendedorDAO vendedorDAO = new VendedorDAO();
        vendedorDAO.listAll();
    }

}
