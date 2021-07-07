package org.simple.lifeiseasy.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item implements Serializable {
	private static final long serialVersionUID = 9132795992669438578L;
	private int id;
    private String name;
    private String category;
}
