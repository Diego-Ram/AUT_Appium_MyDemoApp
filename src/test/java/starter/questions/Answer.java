package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Answer implements Question<String>

    {

        private Target target;

    public Answer(Target target){
        this.target = target;
    }

        @Override
        public String answeredBy(Actor actor) {

         return Text.of(target).answeredBy(actor).toString();

    }
        public static Answer message(Target target){
            return new Answer(target);
        }
}
