package mar10reyes.com.DataStructuresApp.models.dataStructures;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.CascadeType;

@Entity
@Table(name = "linkedlists")
public class LinkedListJpaModel {

    public LinkedListJpaModel() {
        
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String name;
    
    @OneToMany(mappedBy = "linkedlist", cascade = CascadeType.ALL)
    private List<LinkedListNodeJpaModel> nodes = new ArrayList<>();

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<LinkedListNodeJpaModel> getNodes() {
        return nodes;
    }
    
    public void setNodes(List<LinkedListNodeJpaModel> nodes) {
        this.nodes = nodes;
    }

}
