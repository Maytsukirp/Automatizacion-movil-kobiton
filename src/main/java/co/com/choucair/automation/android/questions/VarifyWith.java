package co.com.choucair.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;

public class VarifyWith  implements Question<Boolean> {
    String question;

    public VarifyWith(String question) {
        this.question = question;
    }

    public static VarifyWith the(String question) {

        return new VarifyWith(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean result;
        String text = Text.of(TEXT_LABEL).viewedBy(actor).asString();
        //System.out.println(text);

        if(text.equals(question)){
            result = true;
        }else{
            result = false;

        }
        return result;

    }
}
