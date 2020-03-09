//Author Michael Shoenberger

public class GUI {
    
    private Jump jump;
    
    public GUI(Jump jump){
        this.jump = jump;
    }
    
    public void Start(){
        registerParticipants();
        startTourney();
    }
    
    public void registerParticipants(){
        
        System.out.println("Kumpula ski jumping week \n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        jump.addJumpers();
        
    }
    
    public void startTourney(){
        System.out.println("The tournament begins! \n");
        jump.checkJump();
        
    }
}
