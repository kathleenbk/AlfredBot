import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        // 	Returns a greeting that includes the person's name. 
        // String.format for string interpolation
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        // Implement the dateAnnouncement method, and test it.
        return String.format("It is currently %s.", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // If "Alexis" appears in the conversation (in the string) return a snarky response, such as, "Right away, sir. She certainly isn't sophisticated enough for that."
        // If "Alfred" is in the conversation return an obliging response, for example, "At your service. As you wish, naturally."
        // If neither name is found, return an appropriate response, for instance, "Right. And with that I shall retire." 
        if(conversation.indexOf("Alexis")>-1){
            return ("Right away, sir. She certainly isn't sophisticated enough for that.");
        } else if(conversation.indexOf("Alfred") >-1) {
            return ("At your service. As you wish, naturally.");
        } else {
            return ("Right. And with that I shall retire.");
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

