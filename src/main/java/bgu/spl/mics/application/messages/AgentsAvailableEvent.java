package bgu.spl.mics.application.messages;

import bgu.spl.mics.Event;

import java.util.List;

public class AgentsAvailableEvent implements Event<Boolean> {
    List<String> serials;

    public AgentsAvailableEvent(){

    }
}
