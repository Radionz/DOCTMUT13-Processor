package fr.unice.polytech.doct13.processors;

import fr.unice.polytech.doct13.processors.BinaryProcessor;
import spoon.reflect.code.BinaryOperatorKind;

/**
 * MyProcessor for mutating lower than or equals into greater or equals than modification
 */
public class LTProcessor extends BinaryProcessor {

    public LTProcessor(){
        super(BinaryOperatorKind.LT,BinaryOperatorKind.GE);
    }
}