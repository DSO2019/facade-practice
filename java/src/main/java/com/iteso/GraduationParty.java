package com.iteso;

import com.iteso.impl.DJ;
import com.iteso.impl.EventPhotographer;
import com.iteso.impl.EventWaiter;
import com.iteso.impl.GlassStage;
import com.iteso.impl.Graduate;
import com.iteso.impl.LedLight;
import com.iteso.impl.Meat;
import com.iteso.impl.Ron;

/** Party. */
public final class GraduationParty {

    /** Constructor. */
    private GraduationParty() { }

    /** Main.
     * @param args args.
     */
    public static void main(final String[] args) {
        final int numberOfGraduates = 50;
        Graduate[] graduates = new Graduate[numberOfGraduates];
        for (int i = 0; i < graduates.length; i++) {
            graduates[i] = new Graduate("ExITESO ISC");
        }

        final int numberOfWaiters = 10;
        EventWaiter[] waiters = new EventWaiter[numberOfWaiters];
        for (int i = 0; i < waiters.length; i++) {
            waiters[i] = new EventWaiter("Event waiter");
        }

        EventPhotographer photographer = new EventPhotographer("Photographer");
        GlassStage stage = new GlassStage("Glass Stage");
        Meat meat = new Meat("Arrachera");
        Ron ron = new Ron("Kraken");
        DJ dj = new DJ("David Guetta");
        LedLight light = new LedLight("Color Led Light");

        GraduationFacade graduation = new GraduationFacade(graduates,
        waiters, photographer, stage, meat, ron, dj, light);
        graduation.startParty();
    }
}
