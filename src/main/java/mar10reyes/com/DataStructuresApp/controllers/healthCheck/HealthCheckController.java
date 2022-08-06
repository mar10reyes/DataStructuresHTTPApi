package mar10reyes.com.DataStructuresApp.controllers.healthCheck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping({"/api/v1/healthcheck"})
public class HealthCheckController {
    @GetMapping()
    public Map<String, String> healthCheck() {
        HashMap<String, String> statusResponse = new HashMap<>();
        statusResponse.put("status", "healthty");
        return statusResponse;
    }
}
