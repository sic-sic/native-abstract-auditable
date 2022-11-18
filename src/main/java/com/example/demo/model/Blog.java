package com.example.demo.model;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class Blog extends AbstractAuditable<User, Long> {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "url='" + url + '\'' +
                '}';
    }
}
