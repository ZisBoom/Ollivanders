package net.pottercraft.Ollivanders2.Book;

import net.pottercraft.Ollivanders2.O2MagicBranch;
import net.pottercraft.Ollivanders2.Spell.Spells;

/**
 * Traveling with Trolls - 2nd year Defense Against the Dark Arts book
 *
 * @since 2.2.4
 * @author Azami7
 */
public class TRAVELS_WITH_TROLLS extends Book
{
   public TRAVELS_WITH_TROLLS ()
   {
      title = shortTitle = "Traveling with Trolls";
      author = "Gilderoy Lockhart";
      branch = O2MagicBranch.DARK_ARTS;

      spells.add(Spells.VERDIMILLIOUS_DUO);
      spells.add(Spells.OBLIVIATE);
   }
}
