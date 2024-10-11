package com.ourhomechina.club.dal.dataobject.club;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 粉丝俱乐部实体
 *
 * @author Lex Xiong
 * @company 深圳市邦德布拉泽科技有限公司
 * @time 2024-10-06 22:54
 */
@Data
@TableName("ohc_club")
@EqualsAndHashCode(callSuper = true)
public class OhcClubBO extends BaseDO {
    /**
     * 俱乐部id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long clubId;
    /**
     * 俱乐部名称
     */
    private String name;
    /**
     * 俱乐部简介
     */
    private String desc;
    /**
     * 俱乐部头像
     */
    private String avatar;
    /**
     * 成立时间
     */
    private Date formed;
    /**
     * 管理员用户ID
     */
    private String managerUserId;
    /**
     * 组织ID
     */
    private String orgId;
}
