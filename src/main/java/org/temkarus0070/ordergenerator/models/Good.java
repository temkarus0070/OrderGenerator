package org.temkarus0070.ordergenerator.models;

import lombok.Data;

public @Data class Good {
    private long id;
    private String name;
    private double price;
    private int count;
    private double sum;
}