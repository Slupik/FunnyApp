/*
 * Copyright (c) 2018. by Sebastian Witasik
 * All rights reserved. No part of this application may be reproduced or be part of other software, without the prior written permission of the publisher. For permission requests, write to the author(WitasikSebastian@gmail.com).
 */

package io.github.slupik.funnyjava;

import io.github.slupik.funnyjava.utils.Randomizer;

public class JokeTeller {
    private static final String[] JOKES = new String[]{
            "There are exactly two types of mathematical objects: trivial ones, and those which have not yet been proven.",
            "Q: What's the value of a contour integral around Western Europe? A: Zero, because all the Poles are in Eastern Europe.",
            "I'm sorry, the number you have dialed is imaginary. Please rotate by 90 degrees and try again.",
            "Q: What's purple and commutes? A: An Abelian grape.",
            "Q: What sound does a drowning analytic number theorist make? A: log log log log...",
            "Q: Why did the mathematician name his dog \"Cauchy?\" A: Because he left a residue at every pole.",
            "Q: What's sour, yellow, and equivalent to the axiom of choice? A: Zorn's lemon.",
            "Q: What's hot, chunky, and acts on a polygon? A: Dihedral soup.",
            "Rrrrrring. Operator: I'm sorry, the number you have dialed is imaginary. Please multiply by i and dial again.",
            "1 = 2 (for sufficiently large values of 1)"
    };

    public static String getRandomJoke(){
        return JOKES[Randomizer.randInt(0, JOKES.length-1)];
    }
}
