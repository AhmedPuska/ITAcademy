package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mojatabela")
public class Player {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    
    public String username;
    
    @Column(name = "banned")
    public boolean banovan;
}