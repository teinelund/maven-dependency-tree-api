package org.teinelund.lib.maven_dependency_tree_api;

import org.teinelund.lib.maven_dependency_tree_api.model.MavenPomFile;

import java.nio.file.Path;
import java.util.Collection;

public interface MavenPomFileParser {
    Collection<MavenPomFile> parseMavenPomFiles(Path... file);
}
