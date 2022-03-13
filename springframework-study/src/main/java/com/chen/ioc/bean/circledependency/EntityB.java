package com.chen.ioc.bean.circledependency;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/11 上午10:47
 */
public class EntityB {
    private EntityA entityA;

    public EntityA getEntityA() {
        return entityA;
    }

    public void setEntityA(EntityA entityA) {
        this.entityA = entityA;
    }

}
