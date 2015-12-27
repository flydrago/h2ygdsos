package com.h2y.os.entity;

import java.util.Date;

import com.h2y.object.BaseObject;


/**
 * 项目名称：h2ygdsos  
 * 类名称：ShoppingCart  
 * 类描述：购物车模型  
 * 创建人：侯飞龙  
 * 创建时间：2015年4月13日 下午3:24:03  
 * 修改人：侯飞龙
 * 修改时间：2015年4月13日 下午3:24:03  
 * 修改备注：  
 * @version
 */
public class ShoppingCart extends BaseObject{

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;	
    public static final String key = "keyShoppingCart";
    private long id;
    private String memberId;
    private long goodsId;
    private long goodsPriceId;
    private int goodsCount;
    private Double goodsAmount;
    private int buyType;
    private Date createDate;
    private int status;
    private String memo;

	public ShoppingCart(){
		super();
	}

	public ShoppingCart(long id){
		super();
		this.id = id;
	}

	public ShoppingCart(long id,String memberId,long goodsId,long goodsPriceId,int goodsCount,Double goodsAmount,int buyType,Date createDate,int status,String memo){
		super();
		this.id = id;
		this.memberId = memberId;
		this.goodsId = goodsId;
		this.goodsPriceId = goodsPriceId;
		this.goodsCount = goodsCount;
		this.goodsAmount = goodsAmount;
		this.buyType = buyType;
		this.createDate = createDate;
		this.status = status;
		this.memo = memo;
	}
  
    public long getId(){
      return id;
    }
    
    public void setId(long id){
      this.id = id;
    }

    public String getMemberId(){
      return memberId;
    }
    
    public void setMemberId(String memberId){
      this.memberId = memberId;
    }


    public long getGoodsId(){
      return goodsId;
    }
    
    public void setGoodsId(long goodsId){
      this.goodsId = goodsId;
    }


    public long getGoodsPriceId(){
      return goodsPriceId;
    }
    
    public void setGoodsPriceId(long goodsPriceId){
      this.goodsPriceId = goodsPriceId;
    }


    public int getGoodsCount(){
      return goodsCount;
    }
    
    public void setGoodsCount(int goodsCount){
      this.goodsCount = goodsCount;
    }


    public Double getGoodsAmount(){
      return goodsAmount;
    }
    
    public void setGoodsAmount(Double goodsAmount){
      this.goodsAmount = goodsAmount;
    }


    public int getBuyType(){
      return buyType;
    }
    
    public void setBuyType(int buyType){
      this.buyType = buyType;
    }


    public Date getCreateDate(){
      return createDate;
    }
    
    public void setCreateDate(Date createDate){
      this.createDate = createDate;
    }


    public int getStatus(){
      return status;
    }
    
    public void setStatus(int status){
      this.status = status;
    }


    public String getMemo(){
      return memo;
    }
    
    public void setMemo(String memo){
      this.memo = memo;
    }

    public String toString(){
	return "id:"+id+"\t"+"memberId:"+memberId+"\t"+"goodsId:"+goodsId+"\t"+"goodsPriceId:"+goodsPriceId+"\t"+"goodsCount:"+goodsCount+"\t"+"goodsAmount:"+goodsAmount+"\t"+"buyType:"+buyType+"\t"+"createDate:"+createDate+"\t"+"status:"+status+"\t"+"memo:"+memo;
    }
}