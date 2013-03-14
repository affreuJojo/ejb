package org.serviceEuroDolImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.serviceEuroDol.EuroDol;

/**
 * Stateless session bean that is using JPA 2.0.
 */
@Stateless(mappedName = "JPA2Bean")

public class EuroDolImpl implements EuroDol {

	    @PersistenceContext
	    private EntityManager entityManager = null;

	    /**
	     *Converit le euro en dollar.
	     * @param montant le montant à convertir
	     * @return le montant converti
	     */
	   public double conversionEuroDol(int montant){
	    	
	    	return montant/1.5;
	    }
	    
	    /**
	     *Converit le dollar en euro.
	     * @param montant le montant à convertir
	     * @return le montant converti
	     */
	   public double conversionDolEuro(int montant){
	    	
	    	return montant*1.50;
	    }
	    

		public String toString(){
			String momo="";
			return momo;
		}
	}

