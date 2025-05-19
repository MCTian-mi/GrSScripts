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
public class GTStaticExpansion {

    public static Material material(final Object dummy, String rl) {
        return null;
    }

    public static RecipeMap<?> recipemap(final Object dummy, String name) {
        return null;
    }

    public static ItemStack metaitem(final Object dummy, String rl) {
        return null;
    }

    public static OrePrefix oreprefix(final Object dummy, String name) {
        return null;
    }

    public static Element element(final Object dummy, String name) {
        return null;
    }
}
