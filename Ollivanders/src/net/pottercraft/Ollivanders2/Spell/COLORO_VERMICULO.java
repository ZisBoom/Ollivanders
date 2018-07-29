package net.pottercraft.Ollivanders2.Spell;

import org.bukkit.DyeColor;
import org.bukkit.entity.Player;

import net.pottercraft.Ollivanders2.Ollivanders2;

/**
 * Created by Azami7 on 6/30/17.
 *
 * Target sheep or colored block turns red.
 *
 * @author Azami7
 */
public final class COLORO_VERMICULO extends ColoroSuper
{
   /**
    * Default constructor for use in generating spell text.  Do not use to cast the spell.
    */
   public COLORO_VERMICULO ()
   {
      super();

      text = "Turns target colorable entity or block red.";
   }

   /**
    * Constructor for casting the spell.
    *
    * @param plugin
    * @param player
    * @param name
    * @param rightWand
    */
   public COLORO_VERMICULO (Ollivanders2 plugin, Player player, Spells name, Double rightWand)
   {
      super(plugin, player, name, rightWand);

      //set color red
      color = DyeColor.RED;
   }
}
