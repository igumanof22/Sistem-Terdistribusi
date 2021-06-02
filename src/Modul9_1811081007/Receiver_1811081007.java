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
import jade.lang.acl.MessageTemplate;

/**
 *
 * @author RyderPhantom
 */
public class Receiver_1811081007 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                MessageTemplate mt_1007 = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
                MessageTemplate mt2_1007 = MessageTemplate.and(MessageTemplate.MatchSender(new AID("pengirim", AID.ISLOCALNAME)), 
                        MessageTemplate.MatchPerformative(ACLMessage.INFORM));
                
                ACLMessage msg_1007 = myAgent.receive(mt_1007);
                String content_1007;
                if(msg_1007 != null){
                    content_1007 = msg_1007.getContent();
                    System.out.println("Pesan yang diterima : "+content_1007);
                } else{
                    block();
                }
            }
        });
    }
    
}
