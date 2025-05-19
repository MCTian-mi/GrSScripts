package expansion;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.unification.Element;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.item.ItemStack;

/// Workaround for GrS ObjectMappers
///
/// The methods here are all dummy ones.
@SuppressWarnings("unused")
public class GTExpansion {

    public static Material material(Object dummy, String rl) {
        return null;
    }

    public static RecipeMap<?> recipemap(Object dummy, String name) {
        return null;
    }

    public static ItemStack metaitem(Object dummy, String rl) {
        return null;
    }

    public static OrePrefix oreprefix(Object dummy, String name) {
        return null;
    }

    public static Element element(Object dummy, String name) {
        return null;
    }
}
