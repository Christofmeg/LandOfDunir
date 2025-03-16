package net.sufia.landofdrunir.item.custom;


import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ForgeMod;

import java.util.UUID;




public class LanceItem extends SwordItem {



    private static final UUID ATTACK_REACH = UUID.fromString("a4c45206-3f2f-4588-910e-af679c3312f6");
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public LanceItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> extra = ImmutableMultimap.builder();
        extra.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(ATTACK_REACH, "Attack reach", 3f, AttributeModifier.Operation.ADDITION));
        extra.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(ATTACK_REACH, "Block reach", 3f, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = extra.build();
    }
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        HashMultimap<Attribute, AttributeModifier> map = HashMultimap.create();
        map.putAll(super.getDefaultAttributeModifiers(slot));
        if (slot == EquipmentSlot.MAINHAND) map.putAll(this.defaultModifiers);
        return map;
    }
}
