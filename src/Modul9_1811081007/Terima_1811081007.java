/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811081007;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class Terima_1811081007 extends Agent{

    @Override
    protected void setup() {
        DFAgentDescription dfad_1007 = new DFAgentDescription();
        dfad_1007.setName(getAID());
        ServiceDescription sd_1007 = new ServiceDescription();
        sd_1007.setType("terima");
        sd_1007.setName(getLocalName());
        dfad_1007.addServices(sd_1007);
        try{
            DFService.register(this, dfad_1007);
        } catch(FIPAException FIPAEx){
            Logger.getLogger(Terima_1811081007.class.getName()).log(Level.SEVERE, null, FIPAEx);
        }
        
        addBehaviour(new CyclicBehaviour(this) {
            @Override
            public void action() {
                ACLMessage pesan_1007 = myAgent.receive();
                if(pesan_1007 != null){
                    String msg_1007 = pesan_1007.getContent();
                    System.out.println("Terima : "+myAgent.getLocalName()+" : "+msg_1007+"\n");
                } else{
                    block(200);
                }
            }
        });
    }
    
}
