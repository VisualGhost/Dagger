package com.cleanarch.presentation;

import com.cleanarch.Main;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {NameModule.class})
public interface RootComponent {

    void inject(Foo foo);

}
