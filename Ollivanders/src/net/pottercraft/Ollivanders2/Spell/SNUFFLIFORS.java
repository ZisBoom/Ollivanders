package net.pottercraft.Ollivanders2.Spell;

import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import me.libraryaddict.disguise.disguisetypes.watchers.BatWatcher;
import net.pottercraft.Ollivanders2.Ollivanders2;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

/**
 * The Snufflifors Spell (Snufflifors) is a spell used to transfigure objects into mice, but Flying books are
 * especially vulnerable to this spell. Bats are used as the MC approximation of mice.
 *
 * @since 2.2.6
 * @link https://github.com/Azami7/Ollivanders2/issues/94
 * @author Azami7
 */
public class SNUFFLIFORS extends FriendlyMobDisguiseSuper
{
   /**
    * Default constructor for use in generating spell text.  Do not use to cast the spell.
    */
   public SNUFFLIFORS ()
   {
      super();

      flavorText.add("\"You're going to have a lot of fun with the Snufflifors Spell, Hermione! It's particularly useful at turning books into bats! How cool is that?\" -Fred Weasley");

      text = "The Snufflifors Spell is a spell used to transfigure objects into bats.";
   }

   /**
    * Constructor.
    *
    * @param plugin
    * @param player
    * @param name
    * @param rightWand
    */
   public SNUFFLIFORS (Ollivanders2 plugin, Player player, Spells name, Double rightWand)
   {
      super(plugin, player, name, rightWand);

      targetType = EntityType.BAT;
      disguiseType = DisguiseType.getType(targetType);
      disguise = new MobDisguise(disguiseType);

      BatWatcher watcher = (BatWatcher)disguise.getWatcher();
      watcher.setFlyingWithElytra(true);
   }
}
