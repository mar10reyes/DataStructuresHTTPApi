package mar10reyes.com.DataStructuresApp.services.dataStructures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mar10reyes.com.DataStructuresApp.repositories.dataStructures.linkedListNodeRepository;

@Service
public class LinkedListNodeCrudService {
    @Autowired
    linkedListNodeRepository linkedListNodeRepository;
}
