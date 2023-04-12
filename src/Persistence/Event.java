package Persistence;

import java.util.Calendar;

/**Class to manipulate Calendar Events.*/
public class Event implements Comparable<Event>
{
   private Calendar start;
   private Calendar end;
   private String title;
   private String status;
   
   /**
    * Constructor method */
   public Event(Calendar start, Calendar end, String title, String status)
   {
      this.start = start;
      this.end = end;
      this.title = title;
      this.status = status;
   }
   
   /**
    * Returns the start date/time of the event */
   public Calendar getStart()
   {
      return this.start;
   }
   
   /**Returns the end date/time of the event */
   public Calendar getEnd()
   {
      return this.end;
   }
   
   /**Returns the title of the event. */
   public String getTitle()
   {
      return this.title;
   }

   public String getStatus(){
      return this.status;

   }

   /**Compares two Event objects for sorted ordering*/
   @Override
   public int compareTo(Event c)
   {
      return this.getStart().compareTo(c.getStart());
   }
}
