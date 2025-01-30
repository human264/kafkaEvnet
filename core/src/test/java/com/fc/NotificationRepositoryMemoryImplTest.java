package com.fc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@SpringBootApplication
//class NotificationRepositoryMemoryImplTest {
//
//    @Autowired
//    private NotificationRepository sut;
//    private final Instant now = Instant.now();
//    private final Instant deletedAt = Instant.now().plus(90, ChronoUnit.DAYS);
//
//    @Test
//    void test_save() {
//        // 알림 객체 생성
//        // 저장
//        // 조회했을 때 객체가 있나?
//        sut.save(new Notification("1", 2L, NotificationType.LIKE, now,deletedAt));
//        Optional<Notification> notificaiton = sut.findById("1");
//        assertTrue(notificaiton.isPresent());
//    }
//
//    @Test
//    void test_find_by_id() {
//        sut.save(new Notification("2", 2L, NotificationType.LIKE, now, deletedAt));
//        Optional<Notification> optionalNotificaiton = sut.findById("2");
//
//        Notification notificaiton = optionalNotificaiton.orElseThrow();
//        assertEquals(notificaiton.id, "2");
//        assertEquals(notificaiton.userId, 2L);
//        assertEquals(notificaiton.createdAt.getEpochSecond(), now.getEpochSecond());
//        assertEquals(notificaiton.deletedAt.getEpochSecond(), deletedAt.getEpochSecond());
//    }
//
//    @Test
//    void test_find_by_userId() {
//        sut.save(new Notification("2", 2L, NotificationType.LIKE, now, deletedAt));
//        Optional<Notification> optionalNotificaiton = sut.findById("2");
//
//        Notification notificaiton = optionalNotificaiton.orElseThrow();
//        assertEquals(notificaiton.id, "2");
//        assertEquals(notificaiton.userId, 2L);
//        assertEquals(notificaiton.createdAt.getEpochSecond(), now.getEpochSecond());
//        assertEquals(notificaiton.deletedAt.getEpochSecond(), deletedAt.getEpochSecond());
//    }
//
//    @Test
//    void test_delete_by_id() {
//        sut.save(new Notification("3", 2L, NotificationType.LIKE, now, deletedAt));
//        sut.deleteById("3");
//
//        sut.findById("3");
//
//        Optional<Notification> optionalNotificaiton = sut.findById("3");
//
//        assertFalse(optionalNotificaiton.isPresent());
//    }
//
//}