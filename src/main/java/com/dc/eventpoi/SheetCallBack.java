package com.dc.eventpoi;

/**
 * @Description: 行回调接口
 * @author 段超
 * @date: 2019年1月14日
 */
public interface SheetCallBack extends BaseCallBack{

    /**
     * 行回调方法
     * @param excelSheet 行对象
     * @author 段超
     * @date 2019-01-16 14:04:45
     */
    void getSheet(ExcelSheet excelSheet);
}
