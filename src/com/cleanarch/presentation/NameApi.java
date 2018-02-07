package com.cleanarch.presentation;

public class NameApi {
    public boolean isShortName(String name) {
        return name != null && name.length() < 3;
    }
}
