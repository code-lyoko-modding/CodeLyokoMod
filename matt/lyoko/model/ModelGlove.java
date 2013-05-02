package matt.lyoko.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGlove extends ModelBase {
    // fields
    ModelRenderer arm;
    ModelRenderer barrel;
    ModelRenderer barrel2;
    ModelRenderer barrel3;
    ModelRenderer palm;
    ModelRenderer finger1;
    ModelRenderer finger1mid;
    ModelRenderer finger1tip;
    ModelRenderer finger2;
    ModelRenderer finger2mid;
    ModelRenderer finger2tip;
    ModelRenderer finger3;
    ModelRenderer finger3mid;
    ModelRenderer finger3tip;
    ModelRenderer thumbRight;
    ModelRenderer thumbRightTip;
    ModelRenderer thumbLeft;
    ModelRenderer thumbLeftTip;

    public ModelGlove() {
        textureWidth = 64;
        textureHeight = 128;

        arm = new ModelRenderer(this, 0, 42);
        arm.addBox(-4F, 0F, 0F, 8, 6, 14);
        arm.setRotationPoint(0F, 0F, 0F);
        arm.setTextureSize(64, 32);
        arm.mirror = true;
        setRotation(arm, 0F, 0F, 0F);
        
        barrel = new ModelRenderer(this, 11, 25);
        barrel.addBox(-1F, -1F, -2F, 2, 2, 4);
        barrel.setRotationPoint(2.5F, 0.2F, -2.5F);
        barrel.setTextureSize(64, 32);
        barrel.mirror = true;
        setRotation(barrel, 0F, 0F, 0F);
        
        barrel2 = new ModelRenderer(this, 11, 25);
        barrel2.addBox(-1F, -1F, -2F, 2, 2, 4);
        barrel2.setRotationPoint(0F, 0.2F, -2.5F);
        barrel2.setTextureSize(64, 32);
        barrel2.mirror = true;
        setRotation(barrel2, 0F, 0F, 0F);
        
        barrel3 = new ModelRenderer(this, 11, 25);
        barrel3.addBox(-1F, -1F, -2F, 2, 2, 4);
        barrel3.setRotationPoint(-2.5F, 0.2F, -2.5F);
        barrel3.setTextureSize(64, 32);
        barrel3.mirror = true;
        setRotation(barrel3, 0F, 0F, 0F);
        
        palm = new ModelRenderer(this, 0, 32);
        palm.addBox(-4.5F, -2F, -6F, 9, 4, 6);
        palm.setRotationPoint(0F, 2.5F, 0F);
        palm.setTextureSize(64, 32);
        palm.mirror = true;
        setRotation(palm, 0F, 0F, 0F);
        
        finger1 = new ModelRenderer(this, 0, 27);
        finger1.addBox(-1F, -2F, -3F, 2, 2, 3);
        finger1.setRotationPoint(2.5F, 2.6F, -5.5F);
        finger1.setTextureSize(64, 32);
        finger1.mirror = true;
        setRotation(finger1, 0.1570796F, 0F, 0F);
        
        finger1.mirror = false;
        finger1mid = new ModelRenderer(this, 0, 23);
        finger1mid.addBox(-1F, -1.5F, -2F, 2, 2, 2);
        finger1mid.setRotationPoint(0F, 0F, -2.9F);
        finger1mid.setTextureSize(64, 32);
        finger1mid.mirror = true;
        setRotation(finger1mid, 0.2478368F, 0F, 0F);
        
        finger1tip = new ModelRenderer(this, 0, 19);
        finger1tip.addBox(-1F, -1.5F, -2F, 2, 2, 2);
        finger1tip.setRotationPoint(2.5F, 3F, -7.2F);
        finger1tip.setTextureSize(64, 32);
        finger1tip.mirror = true;
        setRotation(finger1tip, 0.418879F, 0F, 0F);
        
        finger1.addChild(finger1mid);
        finger1mid.addChild(finger1tip);
        
        finger2 = new ModelRenderer(this, 0, 27);
        finger2.addBox(-1F, -2F, -3F, 2, 2, 3);
        finger2.setRotationPoint(0F, 2.6F, -5.5F);
        finger2.setTextureSize(64, 32);
        finger2.mirror = true;
        setRotation(finger2, 0.1570796F, 0F, 0F);
        
        finger2mid = new ModelRenderer(this, 0, 23);
        finger2mid.addBox(-1F, -1.5F, -2F, 2, 2, 2);
        finger2mid.setRotationPoint(0F, 2.6F, -8.4F);
        finger2mid.setTextureSize(64, 32);
        finger2mid.mirror = true;
        setRotation(finger2mid, 0.2478368F, 0F, 0F);
        
        finger2tip = new ModelRenderer(this, 0, 19);
        finger2tip.addBox(-1F, -1.5F, -2F, 2, 2, 2);
        finger2tip.setRotationPoint(0F, 3F, -10.1F);
        finger2tip.setTextureSize(64, 32);
        finger2tip.mirror = true;
        setRotation(finger2tip, 0.418879F, 0F, 0F);
        
        finger3 = new ModelRenderer(this, 0, 27);
        finger3.addBox(-1F, -2F, -3F, 2, 2, 3);
        finger3.setRotationPoint(-2.5F, 2.6F, -5.5F);
        finger3.setTextureSize(64, 32);
        finger3.mirror = true;
        setRotation(finger3, 0.1570796F, 0F, 0F);
        
        finger3mid = new ModelRenderer(this, 0, 23);
        finger3mid.addBox(-1F, -1.5F, -2F, 2, 2, 2);
        finger3mid.setRotationPoint(-2.5F, 2.6F, -8.4F);
        finger3mid.setTextureSize(64, 32);
        finger3mid.mirror = true;
        setRotation(finger3mid, 0.2478368F, 0F, 0F);
        
        finger3tip = new ModelRenderer(this, 0, 19);
        finger3tip.addBox(-1F, -1.5F, -2F, 2, 2, 2);
        finger3tip.setRotationPoint(-2.5F, 3F, -10.1F);
        finger3tip.setTextureSize(64, 32);
        finger3tip.mirror = true;
        setRotation(finger3tip, 0.418879F, 0F, 0F);
        
        thumbRight = new ModelRenderer(this, 0, 15);
        thumbRight.addBox(0F, -2F, 0F, 4, 2, 2);
        thumbRight.setRotationPoint(3F, 4F, -3F);
        thumbRight.setTextureSize(64, 32);
        thumbRight.mirror = true;
        setRotation(thumbRight, 0F, 0.8552113F, 0F);
        
        thumbRightTip = new ModelRenderer(this, 0, 11);
        thumbRightTip.addBox(0F, -2F, 0F, 3, 2, 2);
        thumbRightTip.setRotationPoint(5.4F, 4F, -5.6F);
        thumbRightTip.setTextureSize(64, 32);
        thumbRightTip.mirror = true;
        setRotation(thumbRightTip, 0F, 1.036726F, 0.0546812F);
        
        thumbLeft = new ModelRenderer(this, 0, 15);
        thumbLeft.addBox(-4F, -2F, 0F, 4, 2, 2);
        thumbLeft.setRotationPoint(-3F, 4F, -3F);
        thumbLeft.setTextureSize(64, 32);
        thumbLeft.mirror = true;
        setRotation(thumbLeft, 0F, -0.8552113F, 0F);
        
        thumbLeftTip = new ModelRenderer(this, 0, 11);
        thumbLeftTip.addBox(-3F, -2F, 0F, 3, 2, 2);
        thumbLeftTip.setRotationPoint(-5.4F, 4F, -5.6F);
        thumbLeftTip.setTextureSize(64, 32);
        thumbLeftTip.mirror = true;
        setRotation(thumbLeftTip, 0F, -1.036726F, -0.0546812F);
        
        
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, boolean isFirstPerson) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        arm.render(f5);
        barrel.render(f5);
        barrel2.render(f5);
        barrel3.render(f5);
        palm.render(f5);
        finger1.render(f5);
        
        finger2.render(f5);
        finger2mid.render(f5);
        finger2tip.render(f5);
        finger3.render(f5);
        if(isFirstPerson) {
            thumbLeft.render(f5);
            thumbLeftTip.render(f5);
        }
        else {
            thumbRight.render(f5);
            thumbRightTip.render(f5);
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
    }

    public void clenchHand() {
        finger1.rotateAngleX = (float)Math.toRadians(70);
        finger1mid.rotationPointX = (float)Math.toRadians(70);
        finger1tip.rotateAngleX = (float)Math.toRadians(70);

        finger2.rotateAngleX = 0.418879F;
        finger2mid.rotateAngleX = 0.6667158F;
        finger2tip.rotateAngleX = 1.0855948F;
        
        finger3.rotateAngleX = (float)Math.toRadians(70);
        finger3mid.rotateAngleX = (float)Math.toRadians(70);
        finger3tip.rotateAngleX = (float)Math.toRadians(70);
    }
    
    public void unclenchHand() {
        finger1.rotateAngleX = 0.1570796F;
        finger1mid.rotateAngleX = 0.2478368F;
        finger1tip.rotateAngleX = 0.418879F;
        
        finger2.rotateAngleX = 0.1570796F;
        finger2mid.rotateAngleX = 0.2478368F;
        finger2tip.rotateAngleX = 0.418879F;
        
        finger3.rotateAngleX = 0.1570796F;
        finger3mid.rotateAngleX = 0.2478368F;
//        finger3tip.rotateAngleX = 0.418879F;
    }
}
