package com.learningscreenplay.screenplaydespegar.tasks;

import com.learningscreenplay.screenplaydespegar.userinterfaces.DespegarHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class GoTo implements Task {
    public static GoTo FlightsSection() {

        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


                actor.attemptsTo(Click.on(DespegarHomePage.FLIGHTS_BUTTTON_CUADRADITO));
                //actor.attemptsTo(Click.on(DespegarHomePage.FLIGHTS_BUTTTON_REDONDITO));

    }

}
