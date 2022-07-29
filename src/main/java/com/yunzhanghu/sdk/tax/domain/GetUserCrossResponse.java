package com.yunzhanghu.sdk.tax.domain;




// 查询纳税人是否为跨集团用户返回
public class GetUserCrossResponse {
    
    // 跨集团标识
    private boolean isCross;
    
    public void setIsCross(boolean isCross) {
        this.isCross = isCross;
    }

    public boolean getIsCross() {
        return isCross;
    }
    
    @Override
    public String toString() {
        return "GetUserCrossResponse{" +
             " isCross='" + isCross + '\'' + 
              '}';
    }
}