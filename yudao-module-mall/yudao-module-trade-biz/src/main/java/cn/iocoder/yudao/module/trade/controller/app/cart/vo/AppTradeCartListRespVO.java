package cn.iocoder.yudao.module.trade.controller.app.cart.vo;

import cn.iocoder.yudao.module.trade.controller.app.base.sku.AppProductSkuBaseRespVO;
import cn.iocoder.yudao.module.trade.controller.app.base.spu.AppProductSpuBaseRespVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "用户 App - 用户的购物列表 Response VO")
@Data
public class AppTradeCartListRespVO {

    /**
     * 有效的购物项数组
     */
    private List<Cart> validList;

    /**
     * 无效的购物项数组
     */
    private List<Cart> invalidList;

    @Schema(description = "购物项")
    @Data
    public static class Cart {

        @Schema(description = "购物项的编号", required = true, example = "1024")
        private Long id;

        @Schema(description = "商品数量", required = true, example = "1")
        private Integer count;

        /**
         * 商品 SPU
         */
        private AppProductSpuBaseRespVO spu;
        /**
         * 商品 SKU
         */
        private AppProductSkuBaseRespVO sku;

    }

}
