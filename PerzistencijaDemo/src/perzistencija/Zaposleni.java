/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perzistencija;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "zaposleni")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zaposleni.findAll", query = "SELECT z FROM Zaposleni z")
    , @NamedQuery(name = "Zaposleni.findById", query = "SELECT z FROM Zaposleni z WHERE z.id = :id")
    , @NamedQuery(name = "Zaposleni.findByIme", query = "SELECT z FROM Zaposleni z WHERE z.ime = :ime")
    , @NamedQuery(name = "Zaposleni.findByGodine", query = "SELECT z FROM Zaposleni z WHERE z.godine = :godine")
    , @NamedQuery(name = "Zaposleni.findByAdresa", query = "SELECT z FROM Zaposleni z WHERE z.adresa = :adresa")
    , @NamedQuery(name = "Zaposleni.findByDohodak", query = "SELECT z FROM Zaposleni z WHERE z.dohodak = :dohodak")})
public class Zaposleni implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ime")
    private String ime;
    @Column(name = "godine")
    private Integer godine;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "dohodak")
    private Integer dohodak;

    public Zaposleni() {
    }

    public Zaposleni(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        String oldIme = this.ime;
        this.ime = ime;
        changeSupport.firePropertyChange("ime", oldIme, ime);
    }

    public Integer getGodine() {
        return godine;
    }

    public void setGodine(Integer godine) {
        Integer oldGodine = this.godine;
        this.godine = godine;
        changeSupport.firePropertyChange("godine", oldGodine, godine);
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        String oldAdresa = this.adresa;
        this.adresa = adresa;
        changeSupport.firePropertyChange("adresa", oldAdresa, adresa);
    }

    public Integer getDohodak() {
        return dohodak;
    }

    public void setDohodak(Integer dohodak) {
        Integer oldDohodak = this.dohodak;
        this.dohodak = dohodak;
        changeSupport.firePropertyChange("dohodak", oldDohodak, dohodak);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zaposleni)) {
            return false;
        }
        Zaposleni other = (Zaposleni) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perzistencija.Zaposleni[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
