package com.evandev.mod_template;

import com.evandev.mod_template.config.ModConfig;
import com.evandev.mod_template.logic.RuleManager;
import net.minecraft.server.MinecraftServer;

public class CommonClass {
    private static MinecraftServer currentServer;

    public static MinecraftServer getServer() {
        return currentServer;
    }

    public static void setServer(MinecraftServer server) {
        currentServer = server;
    }

    public static void init() {
        ModConfig.load();
        RuleManager.load(null);
    }
}