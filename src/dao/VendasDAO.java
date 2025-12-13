package dao;

import bean.EcsCliente;
import bean.EcsVendas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class VendasDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(EcsVendas.class);
        criteria.add(Restrictions.eq("idecsVendas", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listCliente(String clientes) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendas.class);

        criteria.createAlias("ecsCliente", "c");
        criteria.add(Restrictions.like("c.ecsNomeCliente", "%" + clientes + "%", MatchMode.ANYWHERE));

        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listVendedor(String vendedor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendas.class);

        criteria.createAlias("ecsVendedor", "v");
        criteria.add(Restrictions.like("v.ecsNomeVendedor", "%" + vendedor + "%", MatchMode.ANYWHERE));

        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listClienteVendedor(String clientes, String vendedor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendas.class);

        criteria.createAlias("ecsCliente", "c");
        criteria.add(Restrictions.like("c.ecsNomeCliente", "%" + clientes + "%", MatchMode.ANYWHERE));

        criteria.createAlias("ecsVendedor", "v");
        criteria.add(Restrictions.like("v.ecsNomeVendedor", "%" + vendedor + "%", MatchMode.ANYWHERE));

        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendas.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.listAll();
    }

}
