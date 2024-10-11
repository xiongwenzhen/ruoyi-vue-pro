package com.ourhomechina.club.dal.dataobject.member;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 粉丝俱乐部会员实体
 *
 * @author Lex Xiong
 * @company 深圳市邦德布拉泽科技有限公司
 * @time 2024-10-07 00:09
 */
@Data
@TableName("ohc_club_member")
@EqualsAndHashCode(callSuper = true)
public class OhcClubMemberDO extends BaseDO {
    /**
     * 会员id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long memberId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 会员编号(唯一编号)
     */
    private String membershipNumber;

    /**
     * 国家代码
     */
    private String nationCode;
    /**
     * 国家名称
     */
    private String nationName;
    /**
     * 省份代码
     */
    private String provinceCode;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 城市代码
     */
    private String cityCode;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 完整地址
     */
    private String fullAddress;
}
