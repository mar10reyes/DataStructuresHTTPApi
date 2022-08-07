package mar10reyes.com.DataStructuresApp.services.dataStructures;

import java.util.ArrayList;
import java.util.Optional;

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

    public LinkedListJpaModel getLinkedList(long id) {

        Optional<LinkedListJpaModel> requestedLinkedList = linkedListRepository.findById(id);

        if (requestedLinkedList.isEmpty()) {
            return null;
        }

        return requestedLinkedList.get();
    }

    public boolean createLinkedList(LinkedListJpaModel newLinkedList) {
        try {
            linkedListRepository.save(newLinkedList);
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
}
