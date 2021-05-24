
package net.eclips_e.jokemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.eclips_e.jokemod.JokemodModElements;

@JokemodModElements.ModElement.Tag
public class FlowItem extends JokemodModElements.ModElement {
	@ObjectHolder("jokemod:flow")
	public static final Item block = null;
	public FlowItem(JokemodModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, JokemodModElements.sounds.get(new ResourceLocation("jokemod:record.flow")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("flow");
		}
	}
}
