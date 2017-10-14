package com.springapp.mvc.datasource;

import com.springapp.mvc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

    public UsersDao(){
    }

    public List<User> getListOfUsers() {
        Session session = sessionFactory.getCurrentSession();
        List items = session.createQuery("FROM User").list();

        return items;
    }
}
