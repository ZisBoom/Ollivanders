package net.pottercraft.Ollivanders2.Spell;

import java.util.ArrayList;

import org.bukkit.Color;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Player;

import net.pottercraft.Ollivanders2.Ollivanders2;

/**
 * Fancier version of VERDIMILLIOUS
 *
 * @see PyrotechniaSuper
 * @see VERDIMILLIOUS
 * @author Azami7
 */
public final class VERDIMILLIOUS_DUO extends PyrotechniaSuper
{
   /**
    * Default constructor for use in generating spell text.  Do not use to cast the spell.
    */
   public VERDIMILLIOUS_DUO ()
   {
      super();

      text = "Conjures large green ball fireworks with trails.";
   }

   /**
    * Constructor for casting the spell.
    *
    * @param plugin
    * @param player
    * @param name
    * @param rightWand
    */
   public VERDIMILLIOUS_DUO (Ollivanders2 plugin, Player player, Spells name, Double rightWand)
   {
      super(plugin, player, name, rightWand);

      fireworkColors = new ArrayList<>();
      fireworkColors.add(Color.GREEN);
      fireworkColors.add(Color.LIME);

      fireworkType = Type.BALL_LARGE;
      hasTrails = true;

      setMaxFireworks(10);
   }
}
