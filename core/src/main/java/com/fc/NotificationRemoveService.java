package com.fc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class NotificationRemoveService {

    @Autowired
    private NotificationRepository repository;

    public void deletedById(String id) {
        log.info("deleted: {}", id);
        repository.deleteById(id);
    }

}
