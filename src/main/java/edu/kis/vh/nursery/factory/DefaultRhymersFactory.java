package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
