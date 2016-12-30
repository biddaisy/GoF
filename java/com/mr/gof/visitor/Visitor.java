package com.mr.gof.visitor;

/**
 * Created by Ramanovich on 12/30/2016.
 */
public interface Visitor {

    void visit(Node node);

    void visit(Employee employee);

    void visit(Boss boss);

    void visit(SuperBoss superBoss);

}
