package demo;

import com.google.inject.AbstractModule;

public class DrawSquareModule extends AbstractModule {

    public void configure() {
        bind(DrawShape.class).to(DrawShape.class);
    }
}
