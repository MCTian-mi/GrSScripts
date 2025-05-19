package expansion;

import com.cleanroommc.groovyscript.api.IIngredient;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

/// Workaround for GrS ObjectMappers
///
/// The methods here are all dummy ones.
@SuppressWarnings("unused")
public class GrSExpansion {

    public static FluidStack multiply(FluidStack stack, int amount) {
        return null;
    }

    public static ItemStack multiply(ItemStack stack, int amount) {
        return null;
    }

    public static IIngredient multiply(IIngredient stack, int amount) {
        return null;
    }
}
