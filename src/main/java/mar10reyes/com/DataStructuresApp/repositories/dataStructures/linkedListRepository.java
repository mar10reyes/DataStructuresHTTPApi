package mar10reyes.com.DataStructuresApp.repositories.dataStructures;

import org.springframework.data.repository.CrudRepository;

import mar10reyes.com.DataStructuresApp.models.dataStructures.LinkedListJpaModel;

public interface linkedListRepository extends CrudRepository<LinkedListJpaModel, Long>{
    
}
