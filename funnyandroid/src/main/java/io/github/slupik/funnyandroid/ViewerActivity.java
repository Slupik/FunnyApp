/*
 * Copyright (c) 2018. by Sebastian Witasik
 * All rights reserved. No part of this application may be reproduced or be part of other software, without the prior written permission of the publisher. For permission requests, write to the author(WitasikSebastian@gmail.com).
 */

package io.github.slupik.funnyandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

public class ViewerActivity extends AppCompatActivity {
    public static final String ARG_JOKE_TEXT = "joke-text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);

        String joke = "Data with joke not found";
        Intent intent = getIntent();
        if(intent!=null) {
            joke = intent.getStringExtra(ARG_JOKE_TEXT);
            if(TextUtils.isEmpty(joke)) {
                joke = "Error, not found String with a joke";
            }
        }

        TextView textViewer = findViewById(R.id.joke_content);
        textViewer.setText(joke);
    }
}
