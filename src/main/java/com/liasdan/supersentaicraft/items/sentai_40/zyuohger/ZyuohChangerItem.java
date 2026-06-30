package com.liasdan.supersentaicraft.items.sentai_40.zyuohger;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.ZyuohgerItems;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class ZyuohChangerItem extends RangerChangerItem {

    public ZyuohChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem,
            DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (num == 1) {
            Item formItem = get_Form_Item(itemstack, 1);

            if (formItem == ZyuohgerItems.EAGLE_YASEI_DAI_KAIHOU_CUBE.get())
                return "zyuoh_eagle_yasei_dai_kaihou";
            if (formItem == ZyuohgerItems.THE_WORLD_YASEI_DAI_KAIHOU_CUBE.get())
                return "zyuoh_the_world_yasei_dai_kaihou";

            if (formItem == ZyuohgerItems.SHARK_YASEI_KAIHOU_CUBE.get())
                return "zyuoh_shark_yasei_kaihou";
            if (formItem == ZyuohgerItems.LION_YASEI_KAIHOU_CUBE.get())
                return "zyuoh_lion_yasei_kaihou";
            if (formItem == ZyuohgerItems.ELEPHANT_YASEI_KAIHOU_CUBE.get())
                return "zyuoh_elephant_yasei_kaihou";
            if (formItem == ZyuohgerItems.TIGER_YASEI_KAIHOU_CUBE.get())
                return "zyuoh_tiger_yasei_kaihou";

       
        }
        return "blank";
    }
}
