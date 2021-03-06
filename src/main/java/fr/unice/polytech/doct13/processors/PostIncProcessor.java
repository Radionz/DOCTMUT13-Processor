package fr.unice.polytech.doct13.processors;

import fr.unice.polytech.doct13.processors.UnaryProcessor;
import spoon.reflect.code.UnaryOperatorKind;

/**
 * MyProcessor for post-incrementation into pre-decrement modification
 */
public class PostIncProcessor extends UnaryProcessor {

    public PostIncProcessor() {
        super(UnaryOperatorKind.POSTINC,UnaryOperatorKind.POSTDEC);
    }
}
