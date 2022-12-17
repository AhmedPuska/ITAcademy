
package main;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "isbn")
public class Isbn {
    
    
    @Id
    @Column(name = "isbn_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int isbnId;

    @Column(name = "isbn_number")
       private String isbnNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_issued")
        private Date dateIssued;
    

    public int getIsbnId() {return isbnId;}

    public void setIsbnId(int isbnId) {this.isbnId = isbnId;}

    public String getIsbnNumber() {return isbnNumber;}

    public void setIsbnNumber(String isbnNumber) {this.isbnNumber = isbnNumber;}

    public Date getDateIssued() {return dateIssued;}

    public void setDateIssued(Date dateIssued) {this.dateIssued = dateIssued;}
    
}