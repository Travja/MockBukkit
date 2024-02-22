package be.seeseemelk.mockbukkit.entity;

import be.seeseemelk.mockbukkit.ServerMock;
import com.google.common.base.Preconditions;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.AbstractArrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Trident;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Mock implementation of an {@link Trident}.
 *
 * @see ProjectileMock
 */
public class TridentMock extends ProjectileMock implements Trident
{

	private boolean glint;
	private ItemStack item = new ItemStack(Material.TRIDENT);

	/**
	 * Constructs a new {@link TridentMock} on the provided {@link ServerMock} with a specified {@link UUID}.
	 *
	 * @param server The server to create the entity on.
	 * @param uuid   The UUID of the entity.
	 */
	public TridentMock(@NotNull ServerMock server, @NotNull UUID uuid)
	{
		super(server, uuid);
	}

	@Override
	public EntityType getType()
	{
		return EntityType.TRIDENT;
	}

	@Override
	public boolean hasGlint()
	{
		return this.glint;
	}

	@Override
	public void setGlint(boolean glint)
	{
		this.glint = glint;
	}

	@Override
	public int getLoyaltyLevel()
	{
		return 0;
	}

	@Override
	public void setLoyaltyLevel(int i)
	{

	}

	@Override
	public boolean hasDealtDamage()
	{
		return false;
	}

	@Override
	public void setHasDealtDamage(boolean b)
	{

	}

	@Override
	public void setDamage(double v)
	{

	}

	@Override
	public int getPierceLevel()
	{
		return 0;
	}

	@Override
	public void setPierceLevel(int i)
	{

	}

	@Override
	public boolean isCritical()
	{
		return false;
	}

	@Override
	public void setCritical(boolean b)
	{

	}

	@Override
	public boolean isInBlock()
	{
		return false;
	}

	@Override
	public @Nullable Block getAttachedBlock()
	{
		return null;
	}

	@NotNull
	@Override
	public PickupStatus getPickupStatus()
	{
		return null;
	}

	@Override
	public void setPickupStatus(@NotNull AbstractArrow.PickupStatus pickupStatus)
	{

	}

	@Override
	public boolean isShotFromCrossbow()
	{
		return false;
	}

	@Override
	public void setShotFromCrossbow(boolean b)
	{

	}

	@Override
	public @NotNull ItemStack getItemStack()
	{
		return null;
	}

	@Override
	public void setLifetimeTicks(int i)
	{

	}

	@Override
	public int getLifetimeTicks()
	{
		return 0;
	}

	@Override
	public @NotNull Sound getHitSound()
	{
		return null;
	}

	@Override
	public void setHitSound(@NotNull Sound sound)
	{

	}

	@Override
	public void setNoPhysics(boolean b)
	{

	}

	@Override
	public boolean hasNoPhysics()
	{
		return false;
	}

	@Override
	public int getKnockbackStrength()
	{
		return 0;
	}

	@Override
	public void setKnockbackStrength(int i)
	{

	}

	@Override
	public double getDamage()
	{
		return 0;
	}

	@Override
	public @NotNull ItemStack getItem()
	{
		return this.item;
	}

	@Override
	public void setItem(@NotNull ItemStack itemStack)
	{
		Preconditions.checkNotNull(itemStack, "Item cannot be null");
		Preconditions.checkArgument(itemStack.getType() == Material.TRIDENT, "Item must be a trident");
		this.item = itemStack;
	}

}
