package com.kasalica.example.callBack2;

public class EventNotifier
{
    private InterestingEvent ie;
    private boolean somethingHappened; 
    
    public EventNotifier (InterestingEvent event)
    {
    // Save the event object for later use.
    ie = event; 
    // Nothing to report yet.
    somethingHappened = false;
    } 
    //...  
    public void doWork ()
    {
    // Check the predicate, which is set elsewhere.
    if (somethingHappened)
        {
        // Signal the even by invoking the interface's method.
        ie.interestingEvent ();
        }
    //...
    } 
    // ...
}
