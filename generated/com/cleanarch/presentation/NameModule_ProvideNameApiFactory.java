package com.cleanarch.presentation;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NameModule_ProvideNameApiFactory implements Factory<NameApi> {
  private final NameModule module;

  public NameModule_ProvideNameApiFactory(NameModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public NameApi get() {
    return Preconditions.checkNotNull(
        module.provideNameApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<NameApi> create(NameModule module) {
    return new NameModule_ProvideNameApiFactory(module);
  }
}
