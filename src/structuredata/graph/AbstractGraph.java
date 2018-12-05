package structuredata.graph;

import java.util.ArrayList;
import java.util.List;
import structuredata.node.Node;

abstract class AbstractGraph<E> implements Graph<E> {

    protected List<Node<E>> nodes;

    public AbstractGraph() {
        nodes = new ArrayList<>();
    }

    protected abstract double getWeight(E from, E to);

}
