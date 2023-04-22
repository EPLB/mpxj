/*
 * file:       ResourceCostTableReader.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2021
 * date:       2021-04-03
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

package net.sf.mpxj.synchro;

import java.io.IOException;
import java.util.Map;

/**
 * Reads a resource cost container table.
 */
class ResourceCostTableReader extends TableReader
{
   /**
    * Constructor.
    *
    * @param stream input stream
    */
   public ResourceCostTableReader(StreamReader stream)
   {
      super(stream);
   }

   @Override protected void readRow(StreamReader stream, Map<String, Object> map) throws IOException
   {
      map.put("UNKNOWN1", stream.readBytes(24));
      map.put("NAME", stream.readString());
      map.put("COST", stream.readDouble());
      map.put("TYPE", stream.readInteger());
      map.put("UNKNOWN3", stream.readBytes(20));
      map.put("UNIQUE_ID", stream.readInteger());
   }

   @Override protected boolean hasUUID()
   {
      return false;
   }

   @Override protected int rowMagicNumber()
   {
      return 0x04E30E9C;
   }
}
