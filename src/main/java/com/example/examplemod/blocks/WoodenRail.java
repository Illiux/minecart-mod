package com.example.examplemod.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.DetectorRailBlock;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.block.RailBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

public class WoodenRail extends RailBlock {

    public float maxSpeed = 0.2f;


    public WoodenRail(Properties builder) {
        super(builder);
    }

    @Override
    public float getRailMaxSpeed(BlockState state, World world, BlockPos pos, AbstractMinecartEntity cart) {
        return maxSpeed;
    }
}
