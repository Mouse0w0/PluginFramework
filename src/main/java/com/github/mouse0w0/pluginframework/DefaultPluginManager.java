package com.github.mouse0w0.pluginframework;

import com.github.mouse0w0.version.ComparableVersion;

import java.nio.file.Path;
import java.util.List;

public class DefaultPluginManager extends AbstractPluginManager {
    @Override
    public PluginContainer loadPlugin(Path path) {
        return null;
    }

    @Override
    public List<PluginContainer> loadPlugin(PluginSource pluginSource) {
        return null;
    }

    @Override
    public void unloadPlugin(PluginContainer container) {

    }

    @Override
    public List<PluginContainer> getPlugins() {
        return null;
    }

    @Override
    public PluginContainer getPlugin(String pluginId) {
        return null;
    }

    @Override
    public PluginContainer whichPlugin(Class<?> clazz) {
        return null;
    }

    @Override
    public ComparableVersion getSystemVersion() {
        return null;
    }

    @Override
    public void setSystemVersion(ComparableVersion version) {

    }
}
