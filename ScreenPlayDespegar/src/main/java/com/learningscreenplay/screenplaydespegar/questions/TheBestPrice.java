package com.learningscreenplay.screenplaydespegar.questions;

import com.learningscreenplay.screenplaydespegar.userinterfaces.DespegarSearchResults;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class TheBestPrice implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DespegarSearchResults.CLUSTERS)
                .viewedBy(actor).asList().get(0);
    }

    public static Question<String> is() {
        return new TheBestPrice();
    }

    public static String isVisible(Actor actor) {
        return Text.of(DespegarSearchResults.CLUSTERS).viewedBy(actor).asList().get(0);
    }

    public static List<String> sViewedBy (Actor actor) {
        return Text.of(DespegarSearchResults.CLUSTERS).viewedBy(actor).asList();
    }
}
