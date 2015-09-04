package com.github.alexthe666.projectnature.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRedDeer extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LegL1;
    public ModelRenderer LowerBody;
    public ModelRenderer Neck1;
    public ModelRenderer LegR1;
    public ModelRenderer LegL2;
    public ModelRenderer Tail;
    public ModelRenderer BackLegR1;
    public ModelRenderer BackLegL1;
    public ModelRenderer BackLegR2;
    public ModelRenderer BackLegL2;
    public ModelRenderer Neck2;
    public ModelRenderer HeadBase;
    public ModelRenderer HeadFront;
    public ModelRenderer Jaw;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer LAntlerBase;
    public ModelRenderer RAntlerBase;
    public ModelRenderer Nose;
    public ModelRenderer LAntlerProng1;
    public ModelRenderer LAntlerProng2;
    public ModelRenderer LAntlerProng3;
    public ModelRenderer RAntlerProng1;
    public ModelRenderer RAntlerProng2;
    public ModelRenderer RAntlerProng3;
    public ModelRenderer LegR2;

    public ModelRedDeer() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Tail = new ModelRenderer(this, 50, 17);
        this.Tail.setRotationPoint(0.0F, -1.6F, 11.2F);
        this.Tail.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Tail, -1.0016444577195458F, 0.0F, 0.0F);
        this.EarL = new ModelRenderer(this, 3, 3);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(2.0F, -2.2F, 0.0F);
        this.EarL.addBox(-0.6F, -1.1F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(EarL, -1.9198621771937625F, 0.13962634015954636F, 1.0471975511965976F);
        this.RAntlerProng1 = new ModelRenderer(this, 13, 1);
        this.RAntlerProng1.setRotationPoint(0.0F, -0.6F, -2.1F);
        this.RAntlerProng1.addBox(-0.5F, -0.5F, 0.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(RAntlerProng1, -2.6179938779914944F, 1.2292353921796064F, 0.22759093446006054F);
        this.RAntlerProng2 = new ModelRenderer(this, 17, 1);
        this.RAntlerProng2.setRotationPoint(0.0F, -0.8F, -4.1F);
        this.RAntlerProng2.addBox(0.0F, -0.3F, 0.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RAntlerProng2, 0.5918411493512771F, 2.5497515042385164F, -3.141592653589793F);
        this.BackLegR2 = new ModelRenderer(this, 0, 43);
        this.BackLegR2.mirror = true;
        this.BackLegR2.setRotationPoint(0.0F, 7.7F, 1.3F);
        this.BackLegR2.addBox(-1.01F, 0.0F, -0.7F, 2, 8, 2, 0.0F);
        this.RAntlerBase = new ModelRenderer(this, 30, 3);
        this.RAntlerBase.setRotationPoint(-0.8F, -2.0F, -1.5F);
        this.RAntlerBase.addBox(-0.4F, -1.0F, -5.8F, 1, 1, 7, 0.0F);
        this.setRotateAngle(RAntlerBase, -2.0943951023931953F, -0.03490658503988659F, -0.6283185307179586F);
        this.Jaw = new ModelRenderer(this, 17, 11);
        this.Jaw.setRotationPoint(0.0F, 0.8F, -2.9F);
        this.Jaw.addBox(-1.5F, -0.7F, -5.3F, 3, 1, 6, 0.0F);
        this.setRotateAngle(Jaw, -0.045553093477052F, 0.0F, 0.0F);
        this.HeadFront = new ModelRenderer(this, 0, 9);
        this.HeadFront.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.HeadFront.addBox(-1.5F, -1.4F, -5.4F, 3, 2, 5, 0.0F);
        this.setRotateAngle(HeadFront, 0.091106186954104F, 0.0F, 0.0F);
        this.Neck1 = new ModelRenderer(this, 0, 27);
        this.Neck1.setRotationPoint(0.0F, 0.4F, -4.7F);
        this.Neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Neck1, -0.7285004297824331F, 0.0F, 0.0F);
        this.HeadBase = new ModelRenderer(this, 0, 16);
        this.HeadBase.setRotationPoint(0.0F, -0.6F, -4.8F);
        this.HeadBase.addBox(-2.5F, -2.51F, -3.8F, 5, 4, 5, 0.0F);
        this.setRotateAngle(HeadBase, 1.3658946726107624F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 34, 47);
        this.Body.setRotationPoint(0.0F, 8.7F, -4.0F);
        this.Body.addBox(-3.0F, -3.0F, -6.0F, 6, 8, 9, 0.0F);
        this.LegL2 = new ModelRenderer(this, 11, 54);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.LegL2.addBox(-1.01F, 0.0F, -1.6F, 2, 8, 2, 0.0F);
        this.BackLegL2 = new ModelRenderer(this, 0, 43);
        this.BackLegL2.setRotationPoint(0.0F, 7.7F, 1.3F);
        this.BackLegL2.addBox(-1.01F, 0.0F, -0.7F, 2, 8, 2, 0.0F);
        this.EarR = new ModelRenderer(this, 3, 3);
        this.EarR.setRotationPoint(-2.0F, -2.2F, 0.0F);
        this.EarR.addBox(-1.4F, -1.1F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(EarR, -1.9198621771937625F, -0.13962634015954636F, -1.0471975511965976F);
        this.LegR2 = new ModelRenderer(this, 11, 54);
        this.LegR2.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.LegR2.addBox(-1.01F, 0.0F, -1.6F, 2, 8, 2, 0.0F);
        this.LowerBody = new ModelRenderer(this, 30, 25);
        this.LowerBody.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.LowerBody.addBox(-2.5F, -2.7F, -0.1F, 5, 7, 12, 0.0F);
        this.LAntlerProng2 = new ModelRenderer(this, 17, 1);
        this.LAntlerProng2.mirror = true;
        this.LAntlerProng2.setRotationPoint(0.0F, -0.8F, -4.1F);
        this.LAntlerProng2.addBox(-1.0F, -0.3F, 0.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LAntlerProng2, 0.5918411493512771F, -2.5497515042385164F, 3.141592653589793F);
        this.LAntlerProng1 = new ModelRenderer(this, 13, 1);
        this.LAntlerProng1.mirror = true;
        this.LAntlerProng1.setRotationPoint(0.0F, -0.6F, -2.1F);
        this.LAntlerProng1.addBox(-0.5F, -0.5F, 0.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(LAntlerProng1, -2.6179938779914944F, -1.2210323446952327F, -0.22759093446006054F);
        this.LAntlerBase = new ModelRenderer(this, 30, 3);
        this.LAntlerBase.mirror = true;
        this.LAntlerBase.setRotationPoint(0.8F, -2.0F, -1.5F);
        this.LAntlerBase.addBox(-0.6F, -1.1F, -5.8F, 1, 1, 7, 0.0F);
        this.setRotateAngle(LAntlerBase, -2.0943951023931953F, -0.03490658503988659F, 0.6283185307179586F);
        this.Nose = new ModelRenderer(this, 0, 3);
        this.Nose.setRotationPoint(0.0F, -1.2F, -4.4F);
        this.Nose.addBox(-0.5F, -0.4F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Nose, 0.136659280431156F, 0.0F, 0.0F);
        this.RAntlerProng3 = new ModelRenderer(this, 40, 6);
        this.RAntlerProng3.setRotationPoint(0.5F, -0.5F, -5.5F);
        this.RAntlerProng3.addBox(-0.5F, -0.1F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(RAntlerProng3, 0.4553564018453205F, -3.096039560112741F, 1.5025539530419183F);
        this.BackLegR1 = new ModelRenderer(this, 20, 52);
        this.BackLegR1.mirror = true;
        this.BackLegR1.setRotationPoint(2.5F, -0.5F, 8.7F);
        this.BackLegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 4, 0.0F);
        this.LegR1 = new ModelRenderer(this, 0, 54);
        this.LegR1.setRotationPoint(-2.5F, 1.0F, -3.5F);
        this.LegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.Neck2 = new ModelRenderer(this, 21, 25);
        this.Neck2.setRotationPoint(0.0F, 0.8F, -5.3F);
        this.Neck2.addBox(-2.01F, -2.21F, -5.01F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Neck2, -0.27314402793711257F, 0.0F, 0.0F);
        this.LegL1 = new ModelRenderer(this, 0, 54);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(2.5F, 1.0F, -3.5F);
        this.LegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.BackLegL1 = new ModelRenderer(this, 20, 52);
        this.BackLegL1.setRotationPoint(-2.5F, -0.5F, 8.7F);
        this.BackLegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 4, 0.0F);
        this.LAntlerProng3 = new ModelRenderer(this, 40, 6);
        this.LAntlerProng3.mirror = true;
        this.LAntlerProng3.setRotationPoint(-0.5F, -0.5F, -5.5F);
        this.LAntlerProng3.addBox(-0.5F, -0.1F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(LAntlerProng3, 0.4553564018453205F, 3.096039560112741F, -1.5025539530419183F);
        this.LowerBody.addChild(this.Tail);
        this.HeadBase.addChild(this.EarL);
        this.RAntlerBase.addChild(this.RAntlerProng1);
        this.RAntlerBase.addChild(this.RAntlerProng2);
        this.BackLegR1.addChild(this.BackLegR2);
        this.HeadBase.addChild(this.RAntlerBase);
        this.HeadBase.addChild(this.Jaw);
        this.HeadBase.addChild(this.HeadFront);
        this.Body.addChild(this.Neck1);
        this.Neck2.addChild(this.HeadBase);
        this.LegL1.addChild(this.LegL2);
        this.BackLegL1.addChild(this.BackLegL2);
        this.HeadBase.addChild(this.EarR);
        this.LegR1.addChild(this.LegR2);
        this.Body.addChild(this.LowerBody);
        this.LAntlerBase.addChild(this.LAntlerProng2);
        this.LAntlerBase.addChild(this.LAntlerProng1);
        this.HeadBase.addChild(this.LAntlerBase);
        this.HeadFront.addChild(this.Nose);
        this.RAntlerBase.addChild(this.RAntlerProng3);
        this.LowerBody.addChild(this.BackLegR1);
        this.Body.addChild(this.LegR1);
        this.Neck1.addChild(this.Neck2);
        this.Body.addChild(this.LegL1);
        this.LowerBody.addChild(this.BackLegL1);
        this.LAntlerBase.addChild(this.LAntlerProng3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}