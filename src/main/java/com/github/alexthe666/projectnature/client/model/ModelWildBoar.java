package com.github.alexthe666.projectnature.client.model;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

import com.github.alexthe666.projectnature.utils.ModelUtils;

public class ModelWildBoar extends MowzieModelBase {
    public MowzieModelRenderer Body;
    public MowzieModelRenderer LegR1;
    public MowzieModelRenderer LegL1;
    public MowzieModelRenderer BackLegL1;
    public MowzieModelRenderer BackLegR1;
    public MowzieModelRenderer LowerBody;
    public MowzieModelRenderer Neck1;
    public MowzieModelRenderer Tail1;
    public MowzieModelRenderer Tail2;
    public MowzieModelRenderer HeadBase;
    public MowzieModelRenderer HeadFront;
    public MowzieModelRenderer Jaw;
    public MowzieModelRenderer EarR;
    public MowzieModelRenderer EarL;
    public MowzieModelRenderer ChopsR;
    public MowzieModelRenderer ChopsL;
    public MowzieModelRenderer Nose;
    public MowzieModelRenderer TuskR1;
    public MowzieModelRenderer TuskL1;
    public MowzieModelRenderer TuskR2;
    public MowzieModelRenderer TuskL2;
    public MowzieModelRenderer LegR2;
    public MowzieModelRenderer LegL2;
    public MowzieModelRenderer BackLegL2;
    public MowzieModelRenderer BackLegR2;

    public ModelWildBoar() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.LowerBody = new MowzieModelRenderer(this, 0, 23);
        this.LowerBody.setRotationPoint(0.0F, -2.7F, 2.0F);
        this.LowerBody.addBox(-4.0F, -1.0F, 0.0F, 8, 11, 10, 0.0F);
        this.Body = new MowzieModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 9.0F, -1.0F);
        this.Body.addBox(-4.5F, -4.0F, -7.0F, 9, 12, 10, 0.0F);
        this.Nose = new MowzieModelRenderer(this, 50, 47);
        this.Nose.setRotationPoint(0.0F, -1.3F, -9.3F);
        this.Nose.addBox(-1.5F, -1.2F, -1.2F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Nose, -0.22444934180647075F, 0.0F, 0.0F);
        this.BackLegL1 = new MowzieModelRenderer(this, 23, 52);
        this.BackLegL1.setRotationPoint(-3.9F, 11.5F, 6.9F);
        this.BackLegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 4, 0.0F);
        this.Jaw = new MowzieModelRenderer(this, 61, 59);
        this.Jaw.setRotationPoint(0.0F, 6.4F, -2.7F);
        this.Jaw.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(Jaw, -0.9749409201640326F, 0.0F, 0.0F);
        this.EarL = new MowzieModelRenderer(this, 50, 55);
        this.EarL.setRotationPoint(-1.5F, 0.5F, -2.0F);
        this.EarL.addBox(-3.0F, -3.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(EarL, 0.45378560551852565F, 0.8726646259971648F, -0.3839724354387525F);
        this.LegR1 = new MowzieModelRenderer(this, 0, 54);
        this.LegR1.mirror = true;
        this.LegR1.setRotationPoint(3.9F, 11.5F, -6.0F);
        this.LegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.TuskL1 = new MowzieModelRenderer(this, 56, 0);
        this.TuskL1.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.TuskL1.addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TuskL1, 0.0F, 1.1519173063162573F, 0.0F);
        this.HeadFront = new MowzieModelRenderer(this, 65, 42);
        this.HeadFront.setRotationPoint(0.0F, 0.9F, 0.3F);
        this.HeadFront.addBox(-2.0F, -2.5F, -10.0F, 4, 4, 10, 0.0F);
        this.setRotateAngle(HeadFront, 0.8201302155121354F, 0.0F, 0.0F);
        this.HeadBase = new MowzieModelRenderer(this, 85, 35);
        this.HeadBase.setRotationPoint(0.0F, -0.1F, -4.3F);
        this.HeadBase.addBox(-3.0F, -1.0F, -3.0F, 6, 9, 5, 0.0F);
        this.setRotateAngle(HeadBase, -0.44872415068774213F, 0.0F, 0.0F);
        this.TuskR1 = new MowzieModelRenderer(this, 56, 0);
        this.TuskR1.mirror = true;
        this.TuskR1.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.TuskR1.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TuskR1, 0.0F, -1.1519173063162573F, 0.0F);
        this.TuskL2 = new MowzieModelRenderer(this, 47, 0);
        this.TuskL2.setRotationPoint(-0.2F, 0.01F, -1.4F);
        this.TuskL2.addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TuskL2, 0.0F, -0.6108652381980153F, 0.0F);
        this.Neck1 = new MowzieModelRenderer(this, 39, 24);
        this.Neck1.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Neck1.addBox(-2.5F, -2.0F, -6.0F, 5, 10, 6, 0.0F);
        this.setRotateAngle(Neck1, 0.3590142271352336F, 0.0F, 0.0F);
        this.TuskR2 = new MowzieModelRenderer(this, 47, 0);
        this.TuskR2.mirror = true;
        this.TuskR2.setRotationPoint(0.2F, 0.01F, -1.4F);
        this.TuskR2.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TuskR2, 0.0F, 0.6108652381980153F, 0.0F);
        this.LegL1 = new MowzieModelRenderer(this, 0, 54);
        this.LegL1.setRotationPoint(-3.9F, 11.5F, -6.0F);
        this.LegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.BackLegR2 = new MowzieModelRenderer(this, 37, 55);
        this.BackLegR2.mirror = true;
        this.BackLegR2.setRotationPoint(0.0F, 5.5F, 1.5F);
        this.BackLegR2.addBox(-1.01F, 0.0F, -1.5F, 2, 7, 2, 0.0F);
        this.Tail2 = new MowzieModelRenderer(this, 67, 19);
        this.Tail2.setRotationPoint(0.0F, 0.6F, 4.8F);
        this.Tail2.addBox(-0.51F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Tail2, 0.3490658503988659F, 0.0F, 0.0F);
        this.ChopsL = new MowzieModelRenderer(this, 60, 38);
        this.ChopsL.setRotationPoint(-0.4F, 2.0F, 1.2F);
        this.ChopsL.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(ChopsL, -0.24434609527920614F, -0.45378560551852565F, 0.0F);
        this.BackLegL2 = new MowzieModelRenderer(this, 37, 55);
        this.BackLegL2.setRotationPoint(0.0F, 5.5F, 1.5F);
        this.BackLegL2.addBox(-0.99F, 0.0F, -1.5F, 2, 7, 2, 0.0F);
        this.BackLegR1 = new MowzieModelRenderer(this, 23, 52);
        this.BackLegR1.mirror = true;
        this.BackLegR1.setRotationPoint(3.9F, 11.5F, 6.9F);
        this.BackLegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 4, 0.0F);
        this.LegR2 = new MowzieModelRenderer(this, 12, 55);
        this.LegR2.mirror = true;
        this.LegR2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.LegR2.addBox(-1.01F, 0.0F, -1.51F, 2, 7, 2, 0.0F);
        this.Tail1 = new MowzieModelRenderer(this, 63, 11);
        this.Tail1.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(Tail1, -1.2566370614359172F, 0.0F, 0.0F);
        this.EarR = new MowzieModelRenderer(this, 50, 55);
        this.EarR.mirror = true;
        this.EarR.setRotationPoint(1.5F, 0.5F, -2.0F);
        this.EarR.addBox(0.0F, -3.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(EarR, 0.45378560551852565F, -0.8726646259971648F, 0.3839724354387525F);
        this.LegL2 = new MowzieModelRenderer(this, 12, 55);
        this.LegL2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.LegL2.addBox(-0.99F, 0.0F, -1.51F, 2, 7, 2, 0.0F);
        this.ChopsR = new MowzieModelRenderer(this, 60, 38);
        this.ChopsR.mirror = true;
        this.ChopsR.setRotationPoint(0.4F, 2.0F, 1.2F);
        this.ChopsR.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(ChopsR, -0.24434609527920614F, 0.45378560551852565F, 0.0F);
        this.Body.addChild(this.LowerBody);
        this.HeadFront.addChild(this.Nose);
        this.HeadBase.addChild(this.Jaw);
        this.HeadBase.addChild(this.EarL);
        this.Jaw.addChild(this.TuskL1);
        this.HeadBase.addChild(this.HeadFront);
        this.Neck1.addChild(this.HeadBase);
        this.Jaw.addChild(this.TuskR1);
        this.TuskL1.addChild(this.TuskL2);
        this.Body.addChild(this.Neck1);
        this.TuskR1.addChild(this.TuskR2);
        this.BackLegR1.addChild(this.BackLegR2);
        this.Tail1.addChild(this.Tail2);
        this.HeadBase.addChild(this.ChopsL);
        this.BackLegL1.addChild(this.BackLegL2);
        this.LegR1.addChild(this.LegR2);
        this.LowerBody.addChild(this.Tail1);
        this.HeadBase.addChild(this.EarR);
        this.LegL1.addChild(this.LegL2);
        this.HeadBase.addChild(this.ChopsR);
        ModelUtils.doMowzieStuff(boxList, false);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        ModelUtils.doMowzieStuff(boxList, true);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        ModelUtils.renderAll(boxList);
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    	float speed = 0.5F;
    	float speed2 = 0.1F;

    	MowzieModelRenderer[] tailParts = {this.Tail1, this.Tail2};
		MowzieModelRenderer[] neckParts = {this.Neck1, HeadBase};
		this.faceTarget(HeadBase, 1, f3, f4);
		this.faceTarget(Neck1, 2, f3, f4);
		this.bob(Body, speed2, 0.1F, false, entity.ticksExisted, 1);

    	this.walk(LegR1, speed, 0.4F, false, 0F, -0.2F,f, f1);
		this.walk(LegL1, speed, 0.4F, true, 0F, -0.2F,f, f1);
		this.walk(LegR2, speed, 0.2F, false, 0F, -0.2F,f, f1);
		this.walk(LegL2, speed, 0.2F, true, 0F, -0.2F,f, f1);
		this.walk(BackLegR1, speed, 0.4F, true, 0F, 0.2F,f, f1);
		this.walk(BackLegL1, speed, 0.4F, false, 0F, 0.2F,f, f1);
		this.walk(BackLegR2, speed, 0.2F, true, 0F, 0.2F,f, f1);
		this.walk(BackLegL2, speed, 0.2F, false, 0F, 0.2F,f, f1);
		this.chainWave(tailParts, speed2, 0.05F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed, 0.25F, -3, f, f1);
		this.chainWave(neckParts, speed2, 0.05F, 4, entity.ticksExisted, 1);
    }

  
    public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
        MowzieModelRenderer.rotateAngleX = x;
        MowzieModelRenderer.rotateAngleY = y;
        MowzieModelRenderer.rotateAngleZ = z;
    }
}
