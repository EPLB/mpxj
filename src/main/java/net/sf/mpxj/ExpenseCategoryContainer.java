/*
 * file:       ExpenseCategoryContainer.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2020
 * date:       12/10/2020
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

package net.sf.mpxj;

/**
 * Container for expense categories.
 */
public class ExpenseCategoryContainer extends ProjectEntityContainer<ExpenseCategory>
{
   /**
    * Constructor.
    *
    * @param projectFile parent project
    */
   public ExpenseCategoryContainer(ProjectFile projectFile)
   {
      super(projectFile);
   }

   @Override public void added(ExpenseCategory category)
   {
      mapUniqueID(category.getUniqueID(), category);
   }

   @Override public void removed(ExpenseCategory category)
   {
      unmapUniqueID(category.getUniqueID());
   }
}
