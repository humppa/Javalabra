
package ircbot;

public class Profile {
    
    private String server;
    private String owner;
    private String nick;
    private String channel;
    
    /*
    * variable for the irc bot.
    * 
    * @param server String that contains this profile's server.
    * @param owner String that contains this profile's owner.
    * @param nick String that contains this profile's nick.
    * @param channel String that contains this profile's channel.
    */
    public Profile(String server, String owner, String nick, String channel){
        this.server = server;
        this.owner = owner;
        this.nick = nick;
        this.channel = channel;
    }
    
    public String getServer(){
        return this.server;
    }
    public String getOwner(){
        return this.owner;
    }
    public String getNick(){
        return this.nick;
    }
    public String getChannel(){
        return this.channel;
    }
    
    public String toString(){
        String temp = this.server + "\r\n" + this.owner + "\r\n" + this.nick + "\r\n" + this.channel + "\r\n";
        return temp;
    }
    /*
     * compares two Profiles and returns a boolean.
     * 
     * @param profile Profile to compare this profile to.
     * @return true if the profiles did match, otherwise false.
     */
    public boolean equals(Profile profile){
        if(this.server.equals(profile.server) && this.owner.equals(profile.owner)
                && this.nick.equals(profile.nick) && this.channel.equals(profile.channel)){
            return true;
        }else{
            return false;
        }
    }
}
