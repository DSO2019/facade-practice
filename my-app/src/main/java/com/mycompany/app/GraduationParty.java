package com.mycompany.app;

import com.mycompany.app.beans.*;

public class GraduationParty {

    public static void main (String[] args) {

        Bear yogiBear = new Bear("Black bear");
        BlackConfetti badConfetti = new BlackConfetti("Bad ass confetti");
        BiggestDream dream = new BiggestDream("Being finally love by my friends and family");
        Vodka kosako = new Vodka("Kosako");
        BiggestHope hope = new BiggestHope("Becoming a succesfull person with no paralyzing anxiety");
        Anxiety anxiety = new Anxiety("Panic and Anxiety Disorder");
        Razor gillete = new Razor("Gillete ultra sharp razor");
        Chips sabritones = new Chips("Sabritones");
        
        GraduationPartyFacade graduationFacade = new GraduationPartyFacade(yogiBear, kosako, badConfetti, dream, hope, anxiety, gillete, sabritones);
    }
}