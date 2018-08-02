package com.kviuff.shop.common.entity;

import com.kviuff.shop.common.entity.base.BasePo;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * 菜单实体JSON
 * @author kanglan
 * @date 2018/07/20
 */
@Data
public class SysMenuJsonPo{

    /**
     * 菜单编码
     */
    private String id;

    /**
     * 父级编码
     */
    private String parentCode;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 链接
     */
    private String href;

    /**
     * 是否展开
     */
    private Boolean spread;

    /**
     *
     */
    private List<SysMenuJsonPo> children;

}
