
import Modelo.Cine;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ayrton
 */
@ManagedBean(name="dtCineVista")
@ViewScoped
public class CineVista implements Serializable {

    private List<Cine> cines;
    @ManagedProperty("#{cineServicio}")
    CineServicio service = new CineServicio();

    @PostConstruct
    public void init() {
        cines = service.getListaCine();
    }
    public List<Cine> getCines(){
        return cines;
    }
}
