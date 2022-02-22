package com.almazan.Section9.Interface.Challenge;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}