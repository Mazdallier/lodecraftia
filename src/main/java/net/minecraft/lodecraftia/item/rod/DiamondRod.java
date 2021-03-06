package net.minecraft.lodecraftia.item.rod;

import net.minecraft.lodecraftia.item.ModItem;

/**
 * Gold rods.
 *
 * Created by russt on 12/22/14.
 */
public class DiamondRod extends ModItem {

    public static final String ITEM_NAME = "diamond-rod";

    public DiamondRod() {
        super(ITEM_NAME);
    }

    public ModItem register() {
        return register(ITEM_NAME);
    }
}
