package model;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "proizvodi")
public class Proizvodi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proizvodi_id")
    private int proizvodi_id;
    @Column(name = "ime_proizvoda")
    private String ime_proizvoda;
    @Column(name = "opis")
    private String opis;
    @Column(name = "cijena")
    private int cijena;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "proizvodiprodaja",
            joinColumns = {
                @JoinColumn(name = "prodaja_id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "proizvodi_id")
            }
    )
    private Set<Prodaja> prodajas;

    public Set<Prodaja> getProdajas() {
        return prodajas;
    }

    public void setProdajas(Set<Prodaja> prodajas) {
        this.prodajas = prodajas;
    }
    
    public int getProizvodi_id() {
        return proizvodi_id;
    }

    public void setProizvodi_id(int proizvodi_id) {
        this.proizvodi_id = proizvodi_id;
    }

    public String getIme_proizvoda() {
        return ime_proizvoda;
    }

    public void setIme_proizvoda(String ime_proizvoda) {
        this.ime_proizvoda = ime_proizvoda;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
    
    public static List prikazProizvoda() {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "from Proizvodi";
        Query query = session.createQuery(hql);
        
        
        List<Proizvodi> zaposleniList = new ArrayList();
        
        try {
        tx = session.beginTransaction();

            zaposleniList = query.list();

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return zaposleniList;
    }
    
    public void unosProizvoda() {
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        String hql = "from Prodaja";
//        String hql1 = "from Proizvodi";
//        Query query = session.createQuery(hql);
        Proizvodi proizvodi = new Proizvodi();
        Prodaja prodaja = new Prodaja();
        
//        List<Proizvodi> zaposleniList = new ArrayList();
        
        
        Set<Prodaja> prodajas = new HashSet() {
                {
                    add(prodaja);
                }
        };
        Set<Proizvodi> proizvodis = new HashSet() {
                {
                    add(proizvodi);
                }
        };
        
        proizvodi.setProdajas(prodajas);
        prodaja.setProizvodis(proizvodis);
        
        try {
        tx = session.beginTransaction();

        session.persist(proizvodi);
//            zaposleniList = query.list();

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        
    }
    
    @Override
    public String toString() {
        return "Id: " + proizvodi_id + "\t Ime: " + ime_proizvoda + "\t Opis: " + opis + "\t Cijena: " + cijena ;
    }
    
//    public static String prikazProizvoda() throws ClassNotFoundException {
//        
//        StringBuilder prikaz_proizvoda = new StringBuilder();
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
//            
//            Statement st = conn.createStatement();
//            st.executeQuery("select * from proizvodi");
//            ResultSet rs = st.getResultSet();
//            while (rs.next()) {
//                prikaz_proizvoda.append(rs.getInt("proizvodi_id"));
//                prikaz_proizvoda.append(": ");
//                prikaz_proizvoda.append(rs.getString("ime_proizvoda"));
//                prikaz_proizvoda.append(": ");
//                prikaz_proizvoda.append(rs.getString("opis"));
//                prikaz_proizvoda.append(": ");
//                prikaz_proizvoda.append(rs.getInt("cijena"));
//                prikaz_proizvoda.append("\n");
//            }
//        } catch (SQLException ex) {
//            prikaz_proizvoda.append(ex.getMessage());
//        }
//        
//        return prikaz_proizvoda.toString();
//    }
//    
//    public void unosProizvoda() throws ClassNotFoundException {
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
//            
//            if (ime_proizvoda != null && !(ime_proizvoda.isEmpty()) && opis != null && !(opis.isEmpty()) && String.valueOf(cijena) != null && !(String.valueOf(cijena).isEmpty())) {
//                Statement st = conn.createStatement();
//                st.execute("insert into proizvodi (ime_proizvoda, opis, cijena) values ('" + ime_proizvoda + "', '" + opis + "', '" + cijena + "')");
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    
//    public void obrisiProizvod() throws ClassNotFoundException {
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
//            Statement st = conn.createStatement();
//            st.execute("delete from proizvodi where ime_proizvoda = '" + ime_proizvoda + "'");
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
}
