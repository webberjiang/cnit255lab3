package amazbay;
import java.util.*;
public class Website
{
    private Person[] users;
private Message[] messages;

    public Website()
    {
        users = new Person[0];
        messages = new Message[0];
    }

    public void addPerson(Person p)
    {
        // We will need to create a new Person[] array that is 1 more in size
        // than what `users` used to be, and copy the contents of `users`
        // into it.
        Person newArray[] = new Person[users.length+1];
        for(int i = 0; i < users.length; i+=1)
        {
            newArray[i] = users[i];
        }
       newArray[users.length]=p;
       users = newArray;
        // TODO - add p to newUsers, and update `users`
    }

    public Person getPersonByUID(int uid)
    {
        // TODO - loop through `users`, and return the first person whose uid
        // matches.  Otherwise, return null as below.
       
        for(int i= 0; i < users.length;i+=1 )
        {
           if (users[i].getUID()== uid)
           {
           return users[i];
           }
           }
            return null;
    }

    void addMessage(Message m)
    {
    //    System.out.println("adding message with content " + m.getMessage());
        if(messages.length > 0) {
            Message newArray2[]= new Message[messages.length+1];
            for(int i = 0; i < messages.length; i+=1)
            {
                newArray2[i] = messages[i];
            //    System.out.println("message " + newArray2[i] + " inserted at index " + i);
            }
            newArray2[messages.length]= m;
            messages = newArray2;
        } else {
            messages = new Message[1];
            messages[0] = m;
          //  System.out.println("message " + messages[0].getMessage() + " inserted at index " + 0);
        }
        
        // TODO - decide how to store m, so that you can later retrieve the
        // right ones in getMessagesFor().
    }

    public Message[] getMessagesFor(int uid)
    {
        ArrayList<Message> alist = new ArrayList<Message>();
        // TODO - return all messages added on the Website where either
        // the sender or the receiver was the person with uid `uid`, in
        // the order they were sent.
        //System.out.println("message array length: " + messages.length);
        for (int i=0; i < messages.length;i+=1)
        {
            if(messages[i].getSender().getUID() == uid || messages[i].getReceiver().getUID() == uid)
            {
                //System.out.println("Matching message found.");
                alist.add(messages[i]);
            }          
                }
        //System.out.println("arraylist size: " + alist.size());
         
        return alist.toArray(new Message[alist.size()]);
    }
}
