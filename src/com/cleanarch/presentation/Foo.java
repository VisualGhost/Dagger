package com.cleanarch.presentation;

import javax.inject.Inject;

public class Foo {

    @Inject
    NameApi mNameApi;

    public Foo() {
        RootComponent rootComponent = DaggerRootComponent.builder().build();
        rootComponent.inject(this);
    }

    public boolean isShortName(String s) {
        return mNameApi.isShortName(s);
    }
}
