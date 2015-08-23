/*
 * Copyright (C) 2015 Jacob Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klinker.android.sliding.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        findViewById(R.id.show_normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNormalExample();
            }
        });

        findViewById(R.id.show_menu_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenuItemExample();
            }
        });

        findViewById(R.id.show_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageExample();
            }
        });

        findViewById(R.id.show_dark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDarkExample();
            }
        });

        findViewById(R.id.show_fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFabExample();
            }
        });

        findViewById(R.id.show_no_header).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNoHeaderExample();
            }
        });

        findViewById(R.id.show_talon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTalonExample();
            }
        });
    }

    private void showNormalExample() {
        startActivity(new Intent(this, NormalActivity.class));
    }

    private void showMenuItemExample() {
        startActivity(new Intent(this, MenuItemActivity.class));
    }

    private void showImageExample() {
        startActivity(new Intent(this, ImageActivity.class));
    }

    private void showDarkExample() {
        startActivity(new Intent(this, DarkActivity.class));
    }

    private void showFabExample() {
        startActivity(new Intent(this, FabActivity.class));
    }

    private void showNoHeaderExample() {
        startActivity(new Intent(this, NoHeaderActivity.class));
    }

    private void showTalonExample() {
        startActivity(new Intent(this, TalonActivity.class));
    }

}
