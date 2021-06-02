/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_1811081007;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class Broker_1811081007 extends Agent{
    Vector aTerimaBaru_1007 = new Vector();

    @Override
    protected void setup() {
        addBehaviour(new behav(this, aTerimaBaru_1007));
        addBehaviour(new cari_df(this, 10000, aTerimaBaru_1007));
    }
    
    class behav extends CyclicBehaviour{
        MessageTemplate mt_Kirim_1007;
        boolean StaKirim_1007 = false, StaTerima_1007 = false;
        Vector vTerima_1007;
        int iTerima_1007 = 0;
        
        public behav(Broker_1811081007 aThis, Vector aTerimaBaru){
            vTerima_1007 = aTerimaBaru;
            mt_Kirim_1007 = MessageTemplate.MatchConversationId("kirim");
        }

        @Override
        public void action() {
            ACLMessage msgKrmPesan_1007 = myAgent.receive(mt_Kirim_1007);
            if(msgKrmPesan_1007 != null){
                if(vTerima_1007.size() > 0){
                    ACLMessage KrmBalas_1007 = new ACLMessage(ACLMessage.PROPOSE);
                    KrmBalas_1007.setContent(msgKrmPesan_1007.getContent());
                    KrmBalas_1007.addReceiver((AID) vTerima_1007.elementAt(iTerima_1007++));
                    myAgent.send(KrmBalas_1007);
                    if(iTerima_1007 >= vTerima_1007.size()){
                        iTerima_1007 = 0;
                    }
                    StaKirim_1007 = true;
                    System.out.println("size OK \n");
                }
                System.out.println("Message OK \n");
            } else{
                StaKirim_1007 = false;
            }
            if(!(StaKirim_1007 || StaTerima_1007)){
                block(50);
            }
        }
    }
    
    class cari_df extends TickerBehaviour{
        String[] aTerimaBaru_1007;
        DFAgentDescription tm_1007 = new DFAgentDescription();
        ServiceDescription sd_1007 = new ServiceDescription();
        Vector vTerima_1007;
        
        public cari_df(Agent aThis, int i, Vector aTerimaBaru){
            super(aThis, i);
            sd_1007.setType("terima");
            tm_1007.addServices(sd_1007);
            vTerima_1007 = aTerimaBaru;
        }
        
        @Override
        protected void onTick() {
            try{
                DFAgentDescription[] dfPenerima_1007 = DFService.search(myAgent, tm_1007);
                vTerima_1007.clear();
                for(int i=0; i<dfPenerima_1007.length; i++){
                    vTerima_1007.addElement(dfPenerima_1007[i].getName());
                }
            } catch(FIPAException FIPAEx){
                Logger.getLogger(Broker_1811081007.class.getName()).log(Level.SEVERE, null, FIPAEx);
            }
        }
    }
}
