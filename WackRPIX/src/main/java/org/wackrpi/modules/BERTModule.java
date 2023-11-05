package org.wackrpi.modules;

import com.robrua.nlp.bert.Bert;

public class BERTModule {
    public static void test() {
        try(Bert bert = Bert.load("com/robrua/nlp/easy-bert/bert-cased-L-12-H-768-A-12")) {
            float[] f = bert.embedSequence("test");
            for(float v : f)
                System.out.print(v+" ");
        }
    }
}
