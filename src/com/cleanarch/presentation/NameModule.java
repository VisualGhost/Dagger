package com.cleanarch.presentation;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class NameModule {
    @Provides
    @Singleton
    public NameApi provideNameApi(){
        return new NameApi();
    }
}
