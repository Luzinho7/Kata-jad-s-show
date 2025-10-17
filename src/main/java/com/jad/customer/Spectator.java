package com.jad.customer;

import com.jad.show.*;

public class Spectator implements ISpectator {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void watch(final IShow show) {
        // TODO: Implement this method
    show.watchedby(this);

    }

    public void watch(final MovieShow show) {
        System.out.println("J'ai assisté au film "+show.getName()+" de "+show.getDirector()+" sorti en "+show.getYearOfRelease());
    }

    public void watch(final StreetShow show) {

    }

    public void watch(final TheaterShow show) {

    }

    public void watch(final ConcertShow show) {

    }
}
