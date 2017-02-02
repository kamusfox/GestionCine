
import Modelo.Cine;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.Criteria;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayrton
 */
@ManagedBean(name="cineServicio")
@ApplicationScoped
public class CineServicio {
        public List<Cine> getListaCine() {
        List<Cine> listaCines=null;
        Session session = Confbd.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Cine.class);
            listaCines = criteria.list();
            session.getTransaction().commit();
        } catch (Exception ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, "Problema al obtener la lista de Cines");
            session.getTransaction().rollback();
        }
        return listaCines;
    }
}
