package org.serviceEuroDol;

import javax.ejb.Remote;


@Remote
public interface EuroDol 
{

    /**
     * Find all employees.
     * @return list of employees
     */

    /**
     *Converit le euro en dollar.
     * @param montant le montant à convertir
     * @return le montant converti
     */
    double conversionEuroDol(int montant);
    
    /**
     *Converit le dollar en euro.
     * @param montant le montant à convertir
     * @return le montant converti
     */
    double conversionDolEuro(int montant);
    

	String toString();
}
