package net.pottercraft.Ollivanders2.Spell;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import net.pottercraft.Ollivanders2.Ollivanders2;

/**
 * Created by Aazmi7 on 6/29/17. Imported from iarepandemonium/Ollivanders.
 *
 * @author lownes
 * @author Azami7
 */
public final class LAPIDO extends MetamorfosiSuper
{
   /**
    * Default constructor for use in generating spell text.  Do not use to cast the spell.
    */
   public LAPIDO ()
   {
      super();

      flavorText.add("Cobblestone to Stone Spell");
      text = "Turns cobblestone in to stone.";
   }

   /**
    * Constructor for casting the spell.
    *
    * @param plugin
    * @param player
    * @param name
    * @param rightWand
    */
   public LAPIDO(Ollivanders2 plugin, Player player, Spells name, Double rightWand)
   {
      super(plugin, player, name, rightWand);

      targetType = Material.COBBLESTONE;
      transformationType = Material.STONE;
   }
}
