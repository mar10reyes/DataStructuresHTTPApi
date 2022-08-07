package mar10reyes.com.DataStructuresApp.controllers.dataStructures;

import mar10reyes.com.DataStructuresApp.models.dataStructures.LinkedListNodeJpaModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mar10reyes.com.DataStructuresApp.models.dataStructures.LinkedListJpaModel;
import mar10reyes.com.DataStructuresApp.services.dataStructures.LinkedListCrudService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping({"/api/v1/linkedlist"})
public class LinkedListsController {

    @Autowired
    LinkedListCrudService linkedListCrudService;
    
    @GetMapping()
    public ArrayList<LinkedListJpaModel> getLinkedLists() {
        return linkedListCrudService.getAllLinkedLists();
    }

    @GetMapping("/id")
    public LinkedListJpaModel getLinkedList(@PathVariable("id") long id) {
        return linkedListCrudService.getLinkedList(id);
    }

    @PostMapping()
    public HashMap<String, String> createLinkedList(@RequestBody LinkedListJpaModel newLinkedList) {
        
        HashMap<String, String> response = new HashMap<>();

        for (LinkedListNodeJpaModel node: newLinkedList.getNodes()) {
            node.setLinkedlist((newLinkedList));
        }

        try {
            linkedListCrudService.createLinkedList(newLinkedList);            
        } catch (Exception e) {
            response.put("created", "false");
        }
        
        response.put("created", "true");
        return response;
    }

    @PutMapping()
    public Map<String, String> updateLinkedList() {
        HashMap<String, String> statusResponse = new HashMap<>();
        statusResponse.put("method", "update");
        return statusResponse;
    }

    @DeleteMapping()
    public Map<String, String> deleteLinkedList(@RequestParam long id) {
        HashMap<String, String> statusResponse = new HashMap<>();
        statusResponse.put("method", "delete");
        return statusResponse;
    }
    
}
