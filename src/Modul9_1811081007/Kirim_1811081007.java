/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811081007;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author RyderPhantom
 */
public class Kirim_1811081007 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                ACLMessage msg_1007 = new ACLMessage(ACLMessage.SUBSCRIBE);
                msg_1007.setConversationId("kirim");
                msg_1007.setContent("dari "+myAgent.getLocalName()+" apa kabar? \n");
                msg_1007.addReceiver(new AID("broker", AID.ISLOCALNAME));
                myAgent.send(msg_1007);
                block(2000);
            }
        });
    }
    
}
