package mar10reyes.com.DataStructuresApp.repositories.dataStructures;

import org.springframework.data.repository.CrudRepository;

import mar10reyes.com.DataStructuresApp.models.dataStructures.LinkedListNodeJpaModel;

public interface linkedListNodeRepository extends CrudRepository<LinkedListNodeJpaModel, Long>{
    
}
