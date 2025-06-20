package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BanjikebiaoEntity;
import com.entity.view.BanjikebiaoView;

import com.service.BanjikebiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 班级课表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
@RestController
@RequestMapping("/banjikebiao")
public class BanjikebiaoController {
    @Autowired
    private BanjikebiaoService banjikebiaoService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjikebiaoEntity banjikebiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			banjikebiao.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjikebiaoEntity> ew = new EntityWrapper<BanjikebiaoEntity>();

		PageUtils page = banjikebiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjikebiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjikebiaoEntity banjikebiao, 
		HttpServletRequest request){
        EntityWrapper<BanjikebiaoEntity> ew = new EntityWrapper<BanjikebiaoEntity>();

		PageUtils page = banjikebiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjikebiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjikebiaoEntity banjikebiao){
       	EntityWrapper<BanjikebiaoEntity> ew = new EntityWrapper<BanjikebiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjikebiao, "banjikebiao")); 
        return R.ok().put("data", banjikebiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjikebiaoEntity banjikebiao){
        EntityWrapper< BanjikebiaoEntity> ew = new EntityWrapper< BanjikebiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjikebiao, "banjikebiao")); 
		BanjikebiaoView banjikebiaoView =  banjikebiaoService.selectView(ew);
		return R.ok("查询班级课表成功").put("data", banjikebiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjikebiaoEntity banjikebiao = banjikebiaoService.selectById(id);
        return R.ok().put("data", banjikebiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjikebiaoEntity banjikebiao = banjikebiaoService.selectById(id);
        return R.ok().put("data", banjikebiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjikebiaoEntity banjikebiao, HttpServletRequest request){
    	banjikebiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjikebiao);
        banjikebiaoService.insert(banjikebiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanjikebiaoEntity banjikebiao, HttpServletRequest request){
    	banjikebiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjikebiao);
        banjikebiaoService.insert(banjikebiao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjikebiaoEntity banjikebiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjikebiao);
        banjikebiaoService.updateById(banjikebiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjikebiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BanjikebiaoEntity> wrapper = new EntityWrapper<BanjikebiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = banjikebiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	





    @RequestMapping("/importExcel")
    public R importExcel(@RequestParam("file") MultipartFile file){
        try {
            //获取输入流
            InputStream inputStream = file.getInputStream();
            //创建读取工作簿
            Workbook workbook = WorkbookFactory.create(inputStream);
            //获取工作表
            Sheet sheet = workbook.getSheetAt(0);
            //获取总行
            int rows=sheet.getPhysicalNumberOfRows();
            if(rows>1){
                //获取单元格
                for (int i = 1; i < rows; i++) {
                    Row row = sheet.getRow(i);
                    BanjikebiaoEntity banjikebiaoEntity =new BanjikebiaoEntity();
                    banjikebiaoEntity.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
                    String banji = CommonUtil.getCellValue(row.getCell(0));
                    banjikebiaoEntity.setBanji(banji);
                    String kebiao = CommonUtil.getCellValue(row.getCell(1));
                    banjikebiaoEntity.setKebiao(kebiao);
                    String nianji = CommonUtil.getCellValue(row.getCell(2));
                    banjikebiaoEntity.setNianji(nianji);
                    String jiaoshigonghao = CommonUtil.getCellValue(row.getCell(3));
                    banjikebiaoEntity.setJiaoshigonghao(jiaoshigonghao);
                    String jiaoshixingming = CommonUtil.getCellValue(row.getCell(4));
                    banjikebiaoEntity.setJiaoshixingming(jiaoshixingming);
                     
                    //想数据库中添加新对象
                    banjikebiaoService.insert(banjikebiaoEntity);//方法
                }
            }
            inputStream.close();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok("导入成功");
    }



}
