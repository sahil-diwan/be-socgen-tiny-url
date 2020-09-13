package com.tinyurl.tinyserver.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "urlmapper")
@Data
public class UrlMapper {   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator="mapper_sequence" )
    private int id;
    private String longUrl;
    private String shortUrl;
    private int group_id;
    private int user_id;
}
