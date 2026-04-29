package com.evandev.mod_template;

import com.evandev.mod_template.config.ModConfig;

public class CommonClass {

    public static void init() {
        ModConfig.load();
    }
}