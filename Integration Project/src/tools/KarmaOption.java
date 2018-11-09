package tools;


public class KarmaOption {

/////////////////////Fields////////////////////////
  private String question;
  private int reputation;
  private String reply;
  
///////////////////Methods////////////////////////
  
  
  ////////////Overloaded Constructor//////////////////
  public KarmaOption(String question, int reputation, String reply) {
    this.question = question;
    this.reputation = reputation;
    this.reply = reply;   
  }
  
  public void setQuestion(String question) {
    this.question = question;
  }
  
  public String getQuestion( ) {
    return question;
  }
  
  public void setReputation(int reputation) {
    this.reputation = reputation;
  }
  
  public int getReputation() {
    return reputation;
  }
  
  public void setReply(String reply) {
    this.reply = reply;
  }
  
  public String getReply() {
    return reply;
  }
}
