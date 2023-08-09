package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "USER_LOGIN_INFO")
public class TestEntity {
    @Id
    @Column(name = "USERID")
    public String userId;

    @Column(name = "LAST_LOGIN_DATE")
    public LocalDateTime lastLoginDate;

    @Column(name = "RECENT_RELEASE_DATE")
    public LocalDateTime recentReleaseDate;

    @Column(name = "RELEASE_USER_ID")
    public String releaseUserId;

    public TestEntity(String userId) {
        this.userId = userId;
    }
}