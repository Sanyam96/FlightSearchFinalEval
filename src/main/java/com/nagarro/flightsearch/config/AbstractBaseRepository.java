package com.nagarro.flightsearch.config;

import com.nagarro.flightsearch.exceptions.FlightSearchHibernateException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@Repository
public class AbstractBaseRepository {

    @PersistenceContext
    EntityManager entityManager;

    private ThreadLocal<Session> currentSession = new ThreadLocal();

    public AbstractBaseRepository() {
    }

    public Session getCurrentSession() {
        Session session = (Session) this.currentSession.get();
        return null != session ? session : (Session) this.entityManager.unwrap(Session.class);
    }

    public <T> List<T> getList(Class<T> clz) {
        try {
            return this.getCurrentSession().createCriteria(clz).list();
        } catch (HibernateException ex) {
            throw new FlightSearchHibernateException(String.format("Hibernate Exception occurred with cause %s", ex.getMessage()), ex);
        }
    }
}
