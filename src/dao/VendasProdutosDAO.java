package dao;

import bean.EcsVendas;
import bean.EcsVendasProdutos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class VendasProdutosDAO extends AbstractDAO {

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

    public void deleteProdutos(EcsVendas vendas) {
        List lista = (List) listProdutos(vendas);
        session.beginTransaction();
        for (int i = 0; i < lista.size(); i++) {
            EcsVendasProdutos vendprod = (EcsVendasProdutos) lista.get(i);
            session.flush();
            session.clear();
            session.delete(vendprod);
        }
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendasProdutos.class);
        criteria.add(Restrictions.eq("idecsVendasProdutos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listProdutos(EcsVendas ecsVendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendasProdutos.class);
        criteria.add(Restrictions.eq("ecsVendas", ecsVendas));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(EcsVendasProdutos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendasProdutosDAO vendasProdutosDAO = new VendasProdutosDAO();
        vendasProdutosDAO.listAll();
    }

}
