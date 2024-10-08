package com.fit2cloud.datareport.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class Menu implements Serializable {
    private String menuId;

    private String path;

    private String name;

    private String component;

    private String meta;

    private String parentId;

    private Integer index;

    private static final long serialVersionUID = 1L;
}