package org.temkarus0070.ordergenerator.models;

import lombok.Data;

import java.util.Collection;

public @Data  class Order {
    private String clientFIO;
    private long orderNum;
    private Collection<Good> goods;

}
