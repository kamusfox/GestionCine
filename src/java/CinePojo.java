
import Modelo.Cine;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayrton
 */
@ManagedBean
public class CinePojo implements Serializable{
    private List<Cine> cines;
    public List<Cine> getListaCine(){
        cines = Dao.getListaCine();
        return cines;
    }
    
}
