package com.chen.ioc.bean.circledependency;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/11 上午10:47
 */
public class EntityA {
    private EntityB entityB;

    public EntityB getEntityB() {
        return entityB;
    }

    public void setEntityB(EntityB entityB) {
        this.entityB = entityB;
    }

}
