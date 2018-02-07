package com.cleanarch.presentation;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Foo_MembersInjector implements MembersInjector<Foo> {
  private final Provider<NameApi> mNameApiProvider;

  public Foo_MembersInjector(Provider<NameApi> mNameApiProvider) {
    assert mNameApiProvider != null;
    this.mNameApiProvider = mNameApiProvider;
  }

  public static MembersInjector<Foo> create(Provider<NameApi> mNameApiProvider) {
    return new Foo_MembersInjector(mNameApiProvider);
  }

  @Override
  public void injectMembers(Foo instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mNameApi = mNameApiProvider.get();
  }

  public static void injectMNameApi(Foo instance, Provider<NameApi> mNameApiProvider) {
    instance.mNameApi = mNameApiProvider.get();
  }
}
