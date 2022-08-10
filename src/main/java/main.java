import akka.actor.typed.ActorSystem;

public class main {
    public static void main(String[] args){
        ActorSystem<String> actorSystem = ActorSystem.create(FirstSimpleBehavior.create(),"FirstActorSystem");
        actorSystem.tell("Hello are you there?");
        actorSystem.tell("say hello");
        actorSystem.tell("who are you");
        actorSystem.tell("create a child");
        actorSystem.tell("this is second message");
    }
}
