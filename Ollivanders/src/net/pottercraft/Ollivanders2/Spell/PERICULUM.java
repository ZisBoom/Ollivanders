package net.pottercraft.Ollivanders2.Spell;

import org.bukkit.Color;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Player;

import net.pottercraft.Ollivanders2.Ollivanders2;

import java.util.ArrayList;

/**
 * Shoots red burst fireworks in to the air.
 *
 * @see PyrotechniaSuper
 * @author lownes
 * @author Azami7
 */
public final class PERICULUM extends PyrotechniaSuper
{
   /**
    * Default constructor for use in generating spell text.  Do not use to cast the spell.
    */
   public PERICULUM ()
   {
      super();

      text = "Conjures red burst fireworks in the air.";
   }

   /**
    * Constructor for casting the spell.
    *
    * @param plugin
    * @param player
    * @param name
    * @param rightWand
    */
   public PERICULUM (Ollivanders2 plugin, Player player, Spells name, Double rightWand)
   {
      super(plugin, player, name, rightWand);

      fireworkColors = new ArrayList<>();
      fireworkColors.add(Color.RED);
      fireworkType = Type.BURST;

      setMaxFireworks(10);
   }
}