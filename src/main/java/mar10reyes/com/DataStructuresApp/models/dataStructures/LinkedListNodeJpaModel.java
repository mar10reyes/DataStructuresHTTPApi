package mar10reyes.com.DataStructuresApp.models.dataStructures;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "linkedlist_node")
public class LinkedListNodeJpaModel {

    public LinkedListNodeJpaModel() {
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    
    @Column
    private String data;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linkedlist_id", nullable = false)
    private LinkedListJpaModel linkedlist;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkedListJpaModel getLinkedlist() {
        return linkedlist;
    }

    public void setLinkedlist(LinkedListJpaModel linkedlist) {
        this.linkedlist = linkedlist;
    }

}
