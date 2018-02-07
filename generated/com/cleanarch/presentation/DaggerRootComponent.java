package com.cleanarch.presentation;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerRootComponent implements RootComponent {
  private Provider<NameApi> provideNameApiProvider;

  private MembersInjector<Foo> fooMembersInjector;

  private DaggerRootComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static RootComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideNameApiProvider =
        DoubleCheck.provider(NameModule_ProvideNameApiFactory.create(builder.nameModule));

    this.fooMembersInjector = Foo_MembersInjector.create(provideNameApiProvider);
  }

  @Override
  public void inject(Foo foo) {
    fooMembersInjector.injectMembers(foo);
  }

  public static final class Builder {
    private NameModule nameModule;

    private Builder() {}

    public RootComponent build() {
      if (nameModule == null) {
        this.nameModule = new NameModule();
      }
      return new DaggerRootComponent(this);
    }

    public Builder nameModule(NameModule nameModule) {
      this.nameModule = Preconditions.checkNotNull(nameModule);
      return this;
    }
  }
}
