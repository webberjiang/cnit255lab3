package amazbay;

public class Person 
{
   
    // TODO - add the other fields mentioned in the handout, and create
    // getters and setters for each.
    private int uid;
    private String LastName;
    private String FirstName;
    private String FullName;
    
    public Person(int uid, String LastName, String FirstName)
    {
        setUID(uid);
        this.uid = uid;
        setLastName(LastName);
        this.LastName = LastName;
        setFirstName(FirstName);
        this.FirstName=FirstName;
       
    }

    public int getUID()
    {
        return uid;
    }

    public void setUID(int uid)
    {
        this.uid = uid;
    }

    public void sendMessageTo(Person receiver, String message, long when,
                              Website website)
    {
        Message m = new Message(this, receiver, message, when);
        website.addMessage(m);
    }

    public String getFirstName()
    {
        
        // TODO - this is one of the getters, but it doesn't
        // do the right thing currently...
        return FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    
    
    }

    /**
     * @return the FullName
     */
    public String getFullName() {
        this.FullName = FirstName + " "+ LastName;
        return FullName;
    }

    /**
     * @return the Fullname
     */
   
            }

