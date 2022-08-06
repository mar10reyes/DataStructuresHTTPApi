package mar10reyes.com.DataStructuresApp.services.dataStructures;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mar10reyes.com.DataStructuresApp.models.dataStructures.LinkedListJpaModel;
import mar10reyes.com.DataStructuresApp.repositories.dataStructures.linkedListRepository;

@Service
public class LinkedListCrudService {
    @Autowired
    linkedListRepository linkedListRepository;

    public ArrayList<LinkedListJpaModel> getAllLinkedLists() {
        return (ArrayList<LinkedListJpaModel>) linkedListRepository.findAll();
    }
}
