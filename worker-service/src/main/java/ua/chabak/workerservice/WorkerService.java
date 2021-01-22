package ua.chabak.workerservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ua.chabak.workerservice.model.Position;



@Slf4j
@Service
public class WorkerService {

    @Autowired
    private KafkaTemplate<Long, Position> kafkaTemplate;

    public void send(Position position) {
        kafkaTemplate.send("position", position);
        log.info("<= sending {}", position);
    }
}
