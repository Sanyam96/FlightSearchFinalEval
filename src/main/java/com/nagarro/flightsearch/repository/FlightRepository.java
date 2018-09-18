package com.nagarro.flightsearch.repository;

import com.nagarro.flightsearch.config.AbstractBaseRepository;
import com.nagarro.flightsearch.domains.Flight;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@Repository
public class FlightRepository extends AbstractBaseRepository {

    public List<Flight> getFlightsFromDb(long nextSearchId, int limit) {
        Criteria criteria = this.getCurrentSession().createCriteria(Flight.class);
        criteria.add(Restrictions.gt("id", nextSearchId));
        criteria.setMaxResults(limit);
        return criteria.list();
    }

    public Integer getTotalCount() {
        Criteria criteria = this.getCurrentSession().createCriteria(Flight.class);
        return ((Number) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
    }
}
