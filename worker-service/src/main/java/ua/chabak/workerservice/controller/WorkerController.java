package ua.chabak.workerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.chabak.workerservice.model.Position;
import ua.chabak.workerservice.service.WorkerService;

@RestController
@RequestMapping("/api/v1/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PutMapping("/position")
    public void lastPosition(@RequestBody Position position) {
//        System.out.println(position);
        workerService.send(position);
    }
}
