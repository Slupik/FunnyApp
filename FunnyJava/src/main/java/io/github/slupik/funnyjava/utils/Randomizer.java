/*
 * Copyright (c) 2018. by Sebastian Witasik
 * All rights reserved. No part of this application may be reproduced or be part of other software, without the prior written permission of the publisher. For permission requests, write to the author(WitasikSebastian@gmail.com).
 */

package io.github.slupik.funnyjava.utils;

import java.util.Random;

public class Randomizer {
    public static int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
