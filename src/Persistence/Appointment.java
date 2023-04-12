package Persistence;

import java.util.Calendar;

/**Class to manipulate Calendar Events (Appointments).*/
public class Appointment implements Comparable<Appointment>
{
   private Calendar start;
   private Calendar end;
   private String title;
   private String status;
   
   /**
    * Constructor method */
   public Appointment(Calendar start, Calendar end, String title, String status)
   {
      this.start = start;
      this.end = end;
      this.title = title;
      this.status = status;
   }
   
   /**
    * Returns the start date/time of the appointment */
   public Calendar getStart()
   {
      return this.start;
   }
   
   /**Returns the end date/time of the appointment */
   public Calendar getEnd()
   {
      return this.end;
   }
   
   /**Returns the title of the appointment. */
   public String getTitle()
   {
      return this.title;
   }

   public String getStatus(){
      return this.status;

   }

   /**Compares two Appointment objects for sorted ordering*/
   @Override
   public int compareTo(Appointment c)
   {
      return this.getStart().compareTo(c.getStart());
   }
}
