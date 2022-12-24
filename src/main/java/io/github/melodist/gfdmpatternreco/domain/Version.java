package io.github.melodist.gfdmpatternreco.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Version {
    private final String versionName;

    public static Version createVersion(String versionName) {
        return new Version(versionName);
    }
}
