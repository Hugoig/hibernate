package org.example.dao;

import java.util.List;

import org.example.model.Product;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class ProductDAO {

    public List <Product> findByName ( String name ) {
        Session session = HibernateUtil.getSessionFactory().openSession() ;
        Query <Product> query = session.createQuery ( "from Product where name =:name ",Product.class);
        query.setParameter ( "name" , name ) ;
        List <Product> products = query.list() ;
        session.close() ;
        return products ;
    }
}