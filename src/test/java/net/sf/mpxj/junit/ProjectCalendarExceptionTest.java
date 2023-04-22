/*
 * file:       ProjectCalendarExceptionTest.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2022
 * date:       26 April 2022
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.junit;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

import net.sf.mpxj.ProjectCalendar;
import net.sf.mpxj.ProjectCalendarException;
import net.sf.mpxj.ProjectFile;
import org.junit.Test;

/**
 * Test to exercise {@code ProjectCalendarException} functionality.
 */
public class ProjectCalendarExceptionTest
{
   /**
    * Test the contains method.
    */
   @Test public void testContains()
   {
      ProjectCalendar calendar = new ProjectCalendar(new ProjectFile());
      ProjectCalendarException exception = calendar.addCalendarException(toDate("10/01/2020"), toDate("12/01/2020"));

      //
      // Test single date
      //
      assertFalse(exception.contains(toDate("09/01/2020")));
      assertTrue(exception.contains(toDate("10/01/2020")));
      assertTrue(exception.contains(toDate("11/01/2020")));
      assertTrue(exception.contains(toDate("12/01/2020")));
      assertFalse(exception.contains(toDate("13/01/2020")));

      //
      // Test calendar exception
      //

      // Range is entirely before
      assertFalse(exception.contains(calendar.addCalendarException(toDate("08/01/2020"), toDate("09/01/2020"))));

      // Range is entirely after
      assertFalse(exception.contains(calendar.addCalendarException(toDate("13/01/2020"), toDate("14/01/2020"))));

      // Range matches exactly
      assertTrue(exception.contains(calendar.addCalendarException(toDate("10/01/2020"), toDate("12/01/2020"))));

      // Range overlaps start
      assertTrue(exception.contains(calendar.addCalendarException(toDate("09/01/2020"), toDate("11/01/2020"))));

      // Range overlaps end
      assertTrue(exception.contains(calendar.addCalendarException(toDate("11/01/2020"), toDate("14/01/2020"))));
   }

   /**
    * Convert a string to a date.
    *
    * @param date date string
    * @return Date instance
    */
   private Date toDate(String date)
   {
      try
      {
         return m_df.parse(date);
      }
      catch (ParseException e)
      {
         throw new RuntimeException(e);
      }
   }

   private final DateFormat m_df = new SimpleDateFormat("dd/MM/yyyy");
}
