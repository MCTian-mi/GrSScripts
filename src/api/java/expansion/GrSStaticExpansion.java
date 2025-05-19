package expansion;

import com.cleanroommc.groovyscript.api.GroovyLog;
import com.cleanroommc.groovyscript.compat.mods.ModSupport;
import com.cleanroommc.groovyscript.compat.vanilla.Crafting;
import com.cleanroommc.groovyscript.compat.vanilla.Furnace;
import com.cleanroommc.groovyscript.compat.vanilla.OreDict;
import com.cleanroommc.groovyscript.helper.ingredient.OreDictIngredient;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

/// Workaround for GrS ObjectMappers
///
/// The methods here are all dummy ones.
@SuppressWarnings("unused")
public class GrSStaticExpansion {

    /// The `resource` Object Mapper allows you to retrieve a `ResourceLocation`.
    ///
    /// There are three ways to call the `resource` Object Mapper:
    ///
    /// - When two Strings are passed in, the first is the `namespace` and the second will be the `path`.
    /// - When only one String is passed in, if there is a colon `:` then it is split by the colon into the same `namespace` and `path`.
    /// - If there is only one String, it will be interpreted as the `path`, and the [GroovyScript `packid`](https://cleanroommc.com/groovy-script/getting_started/run_config#packid) will be used as the `namespace`.
    ///
    /// Using only a single `String` separating the `namespace` and `path` with a colon `:` is the canonical form.
    ///
    /// @link [Vanilla Object Mappers: Resource | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource)
    public static ResourceLocation resource(final Object dummy, String rl) {
        return null;
    }

    /// The `resource` Object Mapper allows you to retrieve a `ResourceLocation`.
    ///
    /// There are three ways to call the `resource` Object Mapper:
    ///
    /// - When two Strings are passed in, the first is the `namespace` and the second will be the `path`.
    /// - When only one String is passed in, if there is a colon `:` then it is split by the colon into the same `namespace` and `path`.
    /// - If there is only one String, it will be interpreted as the `path`, and the [GroovyScript `packid`](https://cleanroommc.com/groovy-script/getting_started/run_config#packid) will be used as the `namespace`.
    ///
    /// Using only a single `String` separating the `namespace` and `path` with a colon `:` is the canonical form.
    ///
    /// @link [Vanilla Object Mappers: Resource | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource)
    public static ResourceLocation resource(final Object dummy, String nameSpace, String path) {
        return null;
    }


    /// The `ore` Object Mapper allows you to retrieve an `IIngredient` representing the relevant OreDictionary.
    ///
    /// There are two ways to call the `ore` Object Mapper:
    ///
    /// - The full name of the OreDictionary being targeted.
    /// - Using an asterisk `*` creates an `OreDictWildcardIngredient` which matches anything that has an ore that matches the rest of the text.
    ///
    /// @link [Vanilla Object Mappers: Ore | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#ore)
    public static OreDictIngredient ore(final Object dummy, String oreDict) {
        return null;
    }

    /// The `item` Object Mapper allows you to retrieve an `ItemStack`.
    ///
    /// You can either get an `ItemStack` with a specific metadata or an `ItemStack` accepting any metadata.
    ///
    /// To target the desired `ItemStack`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// By default, the `ItemStack` will have a metadata of `0`, but it can be specified using the `int` parameter.
    ///
    /// To create an `ItemStack` that allows any metadata, use a colon `:` followed by an asterisk `*`.
    ///
    /// If called without parameters or otherwise is invalid, `ItemStack.EMPTY` will be returned.
    ///
    /// @link [Vanilla Object Mappers: ItemStack | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#itemstack)
    public static ItemStack item(final Object dummy, String rl, int damage) {
        return null;
    }

    /// The `item` Object Mapper allows you to retrieve an `ItemStack`.
    ///
    /// You can either get an `ItemStack` with a specific metadata or an `ItemStack` accepting any metadata.
    ///
    /// To target the desired `ItemStack`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// By default, the `ItemStack` will have a metadata of `0`, but it can be specified using the `int` parameter.
    ///
    /// To create an `ItemStack` that allows any metadata, use a colon `:` followed by an asterisk `*`.
    ///
    /// If called without parameters or otherwise is invalid, `ItemStack.EMPTY` will be returned.
    ///
    /// @link [Vanilla Object Mappers: ItemStack | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#itemstack)
    public static ItemStack item(final Object dummy, String rl) {
        return null;
    }

    /// The `item` Object Mapper allows you to retrieve an `ItemStack`.
    ///
    /// You can either get an `ItemStack` with a specific metadata or an `ItemStack` accepting any metadata.
    ///
    /// To target the desired `ItemStack`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// By default, the `ItemStack` will have a metadata of `0`, but it can be specified using the `int` parameter.
    ///
    /// To create an `ItemStack` that allows any metadata, use a colon `:` followed by an asterisk `*`.
    ///
    /// If called without parameters or otherwise is invalid, `ItemStack.EMPTY` will be returned.
    ///
    /// @link [Vanilla Object Mappers: ItemStack | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#itemstack)
    public static ItemStack item(final Object dummy) {
        return null;
    }

    /// The `liquid` and `fluid` Object Mappers allows you to retrieve a `FluidStack`. They are both the same method internally, and have merely been provided as an alias of each other.
    ///
    /// To target the desired `FluidStack``, use name of the Fluid.
    ///
    /// @link [Vanilla Object Mappers: Liquid And Fluid | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#liquid-and-fluid)
    public static FluidStack fluid(final Object dummy, String name) {
        return null;
    }

    /// The `liquid` and `fluid` Object Mappers allows you to retrieve a `FluidStack`. They are both the same method internally, and have merely been provided as an alias of each other.
    ///
    /// To target the desired `FluidStack``, use name of the Fluid.
    ///
    /// @link [Vanilla Object Mappers: Liquid And Fluid | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#liquid-and-fluid)
    public static FluidStack liquid(final Object dummy, String name) {
        return null;
    }

    /// The `block` Object Mapper allows you to retrieve a `Block`.
    ///
    /// To target the desired `Block`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// If called without parameters or otherwise is invalid, `Blocks.AIR` will be returned.
    ///
    /// @link [Vanilla Object Mappers: Block | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#block)
    public static Block block(final Object dummy, String rl) {
        return null;
    }

    /// The `block` Object Mapper allows you to retrieve a `Block`.
    ///
    /// To target the desired `Block`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// If called without parameters or otherwise is invalid, `Blocks.AIR` will be returned.
    ///
    /// @link [Vanilla Object Mappers: Block | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#block)
    public static Block block(final Object dummy) {
        return null;
    }

    /// The `blockstate` Object Mapper allows you to retrieve an `IBlockState`.
    ///
    /// The `IBlockState` is made up of a `Block` and some number of optional state values.
    ///
    /// To target the desired `Block`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// To target a specific `IBlockState`, either
    ///
    /// - Use an `int` separated by a colon `:` or as a second parameter
    /// - Specify the `property`=`value` entries
    ///
    /// If called without parameters or otherwise is invalid, `Blocks.AIR.getDefaultState()` will be returned.
    ///
    /// @link [Vanilla Object Mappers: BlockState | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#blockState)
    public static IBlockState blockState(final Object dummy, String rl, int meta) {
        return null;
    }

    /// The `blockstate` Object Mapper allows you to retrieve an `IBlockState`.
    ///
    /// The `IBlockState` is made up of a `Block` and some number of optional state values.
    ///
    /// To target the desired `Block`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// To target a specific `IBlockState`, either
    ///
    /// - Use an `int` separated by a colon `:` or as a second parameter
    /// - Specify the `property`=`value` entries
    ///
    /// If called without parameters or otherwise is invalid, `Blocks.AIR.getDefaultState()` will be returned.
    ///
    /// @link [Vanilla Object Mappers: BlockState | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#blockState)
    public static IBlockState blockState(final Object dummy, String rl, String... properties) {
        return null;
    }

    /// The `blockstate` Object Mapper allows you to retrieve an `IBlockState`.
    ///
    /// The `IBlockState` is made up of a `Block` and some number of optional state values.
    ///
    /// To target the desired `Block`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// To target a specific `IBlockState`, either
    ///
    /// - Use an `int` separated by a colon `:` or as a second parameter
    /// - Specify the `property`=`value` entries
    ///
    /// If called without parameters or otherwise is invalid, `Blocks.AIR.getDefaultState()` will be returned.
    ///
    /// @link [Vanilla Object Mappers: BlockState | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#blockState)
    public static IBlockState blockState(final Object dummy) {
        return null;
    }

    /// The `enchantment` Object Mapper allows you to retrieve an `Enchantment`.
    ///
    /// To target the desired `Enchantment`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: Enchantment | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#enchantment)
    public static Enchantment enchantment(final Object dummy, String rl) {
        return null;
    }

    /// The `potion` Object Mapper allows you to retrieve a `Potion`.
    ///
    /// To target the desired `Potion`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: Potion | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#potion)
    public static Potion potion(final Object dummy, String rl) {
        return null;
    }

    /// The `potionType` Object Mapper allows you to retrieve a `PotionType`.
    ///
    /// To target the desired `PotionType`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: PotionType | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#potiontype)
    public static PotionType potionType(final Object dummy, String rl) {
        return null;
    }

    /// The `sound` Object Mapper allows you to retrieve a `SoundEvent`.
    ///
    /// To target the desired `SoundEvent`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: Sound | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#sound)
    public static SoundEvent sound(final Object dummy, String rl) {
        return null;
    }

    /// The `entity` Object Mapper allows you to retrieve an `EntityEntry`.
    ///
    /// To target the desired `EntityEntry`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: Entity | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#entity)
    public static Entity entity(final Object dummy, String rl) {
        return null;
    }

    /// The `dimension` Object Mapper allows you to retrieve a `DimensionType`.
    ///
    /// To target the desired `DimensionType`, use the name of the Dimension.
    ///
    /// @link [Vanilla Object Mappers: Dimension | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#dimension)
    public static DimensionType dimension(final Object dummy, String name) {
        return null;
    }

    /// The `biome` Object Mapper allows you to retrieve a `Biome`.
    ///
    /// To target the desired `Biome`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: Biome | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#biome)
    public static Biome biome(final Object dummy, String rl) {
        return null;
    }

    /// The `profession` Object Mapper allows you to retrieve a `VillagerProfession`.
    ///
    /// To target the desired `VillagerProfession`, use the `ResourceLocation` of it in the same format as the canonical form of [`resource` Object Mapper](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#resource).
    ///
    /// @link [Vanilla Object Mappers: Profession | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#profession)
    public static VillagerRegistry.VillagerProfession profession(final Object dummy, String rl) {
        return null;
    }

    /// The `career` Object Mapper allows you to retrieve a `VillagerCareer`.
    ///
    /// To target the desired `VillagerCareer`, use the name of the Career.
    ///
    /// @link [Vanilla Object Mappers: Career | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#career)
    public static VillagerRegistry.VillagerCareer career(final Object dummy, String name) {
        return null;
    }

    /// The `creativeTab` Object Mapper allows you to retrieve a `CreativeTab`.
    ///
    /// To target the desired `CreativeTab`, use the name of the Creative Tab.
    ///
    /// @link [Vanilla Object Mappers: CreativeTab | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#creativetab)
    public static CreativeTabs creativeTab(final Object dummy, String name) {
        return null;
    }

    /// The `textformat` Object Mapper allows you to retrieve a `TextFormatting`.
    ///
    /// To target the desired `TextFormatting`, use the name of the Text Formatting entry.
    ///
    /// @link [Vanilla Object Mappers: Textformat | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#textformat)
    public static TextFormatting textformat(final Object dummy, String name) {
        return null;
    }

    /// The `nbt` Object Mapper allows you to create an `NBTTagCompound`.
    ///
    /// Unlike most others Object Mappers, this is a shorthand way to create a new instance, not to retrieve an already existing Object.
    ///
    /// @link [Vanilla Object Mappers: Nbt | CleanroomMC](https://cleanroommc.com/groovy-script/minecraft/vanilla_object_mappers#nbt)
    public static NBTTagCompound nbt(final Object dummy, String nbtString) {
        return null;
    }

    public static GroovyLog getLog(final Object dummy) {
        return null;
    }

    public static Crafting getCrafting(final Object dummy) {
        return null;
    }

    public static Furnace getFurnace(final Object dummy) {
        return null;
    }

    public static OreDict getOreDict(final Object dummy) {
        return null;
    }
}
